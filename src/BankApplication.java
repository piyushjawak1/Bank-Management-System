import java.sql.*;
import java.util.Scanner;

public class BankApplication {
    // database details
    static final String URL = "jdbc:mysql://localhost:3306/bankdb";
    static final String USER = "root";
    static final String PASS = "";

    public static void main(String[] args) throws Exception {
        // load driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println(" Wampp Driver loaded successfully...");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n====== Welcome User ======");
            System.out.println("1. New Registration");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
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
                System.out.println("Thank you for using Bank App!");
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
            System.out.println(" This account number already exists.");
            con.close();
            return;
        }

        // insert data
        PreparedStatement ps = con.prepareStatement("INSERT INTO accounts VALUES (?,?,?,?,?,?)");
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
        
      if(amt>500) {
    	  
          PreparedStatement ps = con.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE id = ? ");
          ps.setDouble(1, amt);
          ps.setInt(2, id);

          int rows = ps.executeUpdate();
          if (rows > 0) {
              System.out.println("Money deposited.");
          } else {
              System.out.println(" Account not found.");
          }
          System.out.println(rows);
          con.close();
    	  
      }else {
    	  System.out.println(" Please Enter amount greater than 500.");
      }

    }

    // withdraw
    public static void withdrawMoney(Scanner sc) throws Exception {
        Connection con = DriverManager.getConnection(URL, USER, PASS);

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        System.out.print("Enter amount: ");
        double amt = sc.nextDouble();

        PreparedStatement ps1 = con.prepareStatement("SELECT balance FROM accounts WHERE id=?");
        ps1.setInt(1, id);
        ResultSet rs = ps1.executeQuery();

        if (rs.next()) {
            double bal = rs.getDouble(1);
            if (bal >= amt) {
                PreparedStatement ps2 = con.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE id = ?");
                ps2.setDouble(1, amt);
                ps2.setInt(2, id);
                ps2.executeUpdate();
                System.out.println("Withdraw successful.");
            } else {
                System.out.println(" Insufficient balance.");
            }
        } else {
            System.out.println(" Account not found.");
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
            System.out.println(" Account not found.");
        }
        con.close();
    }
}
