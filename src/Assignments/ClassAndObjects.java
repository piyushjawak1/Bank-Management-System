package Assignments;
//Example:
class Student {
    String name;
    int rollNo;

    void displayInfo() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
    }
}

public class ClassAndObjects {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Piyush";
        s1.rollNo = 101;
        s1.displayInfo();  // Output: Name: Piyush, Roll No: 101

        Student s2 = new Student();
        s2.name = "Anita";
        s2.rollNo = 102;
        s2.displayInfo();  // Output: Name: Anita, Roll No: 102
    }
}


