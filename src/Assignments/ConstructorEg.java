package Assignments;

class Learner {
    String name;
    int age;

    // Constructor
    Learner(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorEg {
    public static void main(String[] args) {
        Learner l1 = new Learner("Piyush", 22);
        Learner l2 = new Learner("Neha", 21);

        l1.display();
        l2.display();
    }
}
