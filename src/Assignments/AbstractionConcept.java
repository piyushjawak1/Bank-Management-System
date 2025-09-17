package Assignments;

abstract class Mvehicle {
    abstract void start();
}

class Mycar extends Mvehicle {
    void start() {
        System.out.println("Car starts with a key ");
    }}
class Motorbike extends Mvehicle {
    void start() {
        System.out.println("Bike starts with a button ");
    }
}public class AbstractionConcept {
    public static void main(String[] args) {
    	Mvehicle v1 = new Mycar();
    	Mvehicle v2 = new Motorbike();
        v1.start();
        v2.start();
    }
}
