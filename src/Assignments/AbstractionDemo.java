package Assignments;
//Abstract class
abstract class Vehicle {
 abstract void start();  // abstract method (no body)
 void fuelType() {
     System.out.println("Uses petrol or diesel");
 }
}
//Subclass
class Car extends Vehicle {
 @Override
 void start() {
     System.out.println("Car starts with a key "); }}

class Bike extends Vehicle {
 @Override
 void start() {
     System.out.println("Bike starts with a button");}}
public class AbstractionDemo {
 public static void main(String[] args) {
     Vehicle v1 = new Car();
     Vehicle v2 = new Bike();

     v1.start();   // Car starts with a key
     v2.start();   // Bike starts with a button
 }
}
