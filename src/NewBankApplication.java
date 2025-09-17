import java.sql.*;
import java.util.Scanner;

public class NewBankApplication {
    // database details
    static final String URL = "jdbc:mysql://localhost:3306/bankdb";
    static final String USER = "root";
    static final String PASS = "";

    public static void main(String[] args) throws Exception {
        // load driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Wampp Driver loaded successfully...");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n====== Welcome User ======");
            System.out.println("1. New Registration");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. View User");
            System.out.println("6. Update User");
            System.out.println("7. Delete User");
            System.out.println("8. Exit");
            System.out.println("==================================");
            System.out.print("Choice: ");
            int ch = sc.nextInt();

            if (ch == 1) {
                newAccount(sc);
            } else if (ch == 2) {
                depositMoney(sc);
            } else if (ch == 3) {
                withdrawMoney(sc);
            } else if (ch == 4) {
                checkBalance(sc);
            } else if (ch == 5) {
                viewUser(sc);
            } else if (ch == 6) {
                updateUser(sc);
            } else if (ch == 7) {
                deleteUser(sc);
            } else if (ch == 8) {
                System.out.println("Session closed. Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice, try again.");
            }
        }
        sc.close();
    }

    // create new account
    public static void newAccount(Scanner sc) throws Exception {
        Connection con = DriverManager.getConnection(URL, USER, PASS);

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // clear buffer
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Contact: ");
        String contact = sc.nextLine();
        System.out.print("Enter Address: ");
        String addr = sc.nextLine();
        System.out.print("Enter Account No: ");
        String accNo = sc.nextLine();
        System.out.print("Enter Opening Balance: ");
        double bal = sc.nextDouble();

        if (bal < 500) {
            System.out.println("❌ Minimum opening balance is 500.");
            con.close();
            return;
        }

        // check if id already exists
        PreparedStatement p1 = con.prepareStatement("SELECT id FROM accounts WHERE id=?");
        p1.setInt(1, id);
        ResultSet r1 = p1.executeQuery();
        if (r1.next()) {
            System.out.println("❌ This ID already exists.");
            con.close();
            return;
        }

        // check if account number already exists
        PreparedStatement p2 = con.prepareStatement("SELECT account_number FROM accounts WHERE account_number=?");
        p2.setString(1, accNo);
        ResultSet r2 = p2.executeQuery();
        if (r2.next()) {
            System.out.println("❌ This account number already exists.");
            con.close();
            return;
        }

        // insert data (safer with column names)
        PreparedStatement ps = con.prepareStatement(
            "INSERT INTO accounts(id,name,contact,address,account_number,balance) VALUES (?,?,?,?,?,?)"
        );
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setString(3, contact);
        ps.setString(4, addr);
        ps.setString(5, accNo);
        ps.setDouble(6, bal);
        ps.executeUpdate();

        System.out.println("Account created successfully.");
        con.close();
    }

    // deposit
    public static void depositMoney(Scanner sc) throws Exception {
        Connection con = DriverManager.getConnection(URL, USER, PASS);

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        System.out.print("Enter amount: ");
        double amt = sc.nextDouble();

        if (amt <= 0) {
            System.out.println("❌ Please enter a positive amount.");
            con.close();
            return;
        }

        PreparedStatement ps = con.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE id = ?");
        ps.setDouble(1, amt);
        ps.setInt(2, id);

        int rows = ps.executeUpdate();
        if (rows > 0) {
            System.out.println("Money deposited.");
        } else {
            System.out.println("Account not found.");
        }
        con.close();
    }

    // withdraw
    public static void withdrawMoney(Scanner sc) throws Exception {
        Connection con = DriverManager.getConnection(URL, USER, PASS);

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        System.out.print("Enter amount: ");
        double amt = sc.nextDouble();

        if (amt <= 0) {
            System.out.println("❌ Please enter a positive amount.");
            con.close();
            return;
        }

        PreparedStatement ps1 = con.prepareStatement("SELECT balance FROM accounts WHERE id=?");
        ps1.setInt(1, id);
        ResultSet rs = ps1.executeQuery();

        if (rs.next()) {
            double bal = rs.getDouble(1);
            if (bal - amt >= 500) { // keep min balance
                PreparedStatement ps2 = con.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE id = ?");
                ps2.setDouble(1, amt);
                ps2.setInt(2, id);
                ps2.executeUpdate();
                System.out.println("Withdraw successful.");
            } else {
                System.out.println("❌ Cannot withdraw. Minimum balance of 500 must be maintained.");
            }
        } else {
            System.out.println("Account not found.");
        }
        con.close();
    }

    // check balance
    public static void checkBalance(Scanner sc) throws Exception {
        Connection con = DriverManager.getConnection(URL, USER, PASS);

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        PreparedStatement ps = con.prepareStatement("SELECT name, balance FROM accounts WHERE id=?");
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            System.out.println("Name: " + rs.getString(1));
            System.out.println("Balance: " + rs.getDouble(2));
        } else {
            System.out.println("Account not found.");
        }
        con.close();
    }

    // view user
    public static void viewUser(Scanner sc) throws Exception {
        Connection con = DriverManager.getConnection(URL, USER, PASS);

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        PreparedStatement ps = con.prepareStatement("SELECT * FROM accounts WHERE id=?");
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            System.out.println("ID: " + rs.getInt(1));
            System.out.println("Name: " + rs.getString(2));
            System.out.println("Contact: " + rs.getString(3));
            System.out.println("Address: " + rs.getString(4));
            System.out.println("Account No: " + rs.getString(5));
            System.out.println("Balance: " + rs.getDouble(6));
        } else {
            System.out.println("Account not found.");
        }
        con.close();
    }

    // update user
    public static void updateUser(Scanner sc) throws Exception {
        Connection con = DriverManager.getConnection(URL, USER, PASS);

        System.out.print("Enter ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter new Name: ");
        String name = sc.nextLine();
        System.out.print("Enter new Contact: ");
        String contact = sc.nextLine();
        System.out.print("Enter new Address: ");
        String addr = sc.nextLine();

        PreparedStatement ps = con.prepareStatement("UPDATE accounts SET name=?, contact=?, address=? WHERE id=?");
        ps.setString(1, name);
        ps.setString(2, contact);
        ps.setString(3, addr);
        ps.setInt(4, id);

        int rows = ps.executeUpdate();
        if (rows > 0) {
            System.out.println("User updated.");
        } else {
            System.out.println("Account not found.");
        }
        con.close();
    }

    // delete user
    public static void deleteUser(Scanner sc) throws Exception {
        Connection con = DriverManager.getConnection(URL, USER, PASS);

        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();

        PreparedStatement ps = con.prepareStatement("DELETE FROM accounts WHERE id=?");
        ps.setInt(1, id);

        int rows = ps.executeUpdate();
        if (rows > 0) {
            System.out.println("User deleted.");
        } else {
            System.out.println("Account not found.");
        }
        con.close();
    }
}
