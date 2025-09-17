package collections;

import java.util.Vector;

public class vectorDemo {
	public static void main(String[] args) {
		Vector fruits=new Vector();
		fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        System.out.println("First fruit: " + fruits.firstElement());
        System.out.println("Last fruit: " + fruits.lastElement());
        System.out.println("Fruit at index 2: " + fruits.get(2));

        // Updating element
        fruits.set(1, "Blueberry");
        System.out.println("After updating index 1: " + fruits);

        // Removing element
        fruits.remove("Mango");
        System.out.println("After removing Mango: " + fruits);

        // Iterating using for-each
//        System.out.println("Iterating with for-each:");
//        for (String fruit : fruits) {
//            System.out.println(fruit);
        // Checking size and capacity
        System.out.println("Size: " + fruits.size());
        System.out.println("Capacity: " + fruits.capacity());

        // Checking if element exists
        System.out.println("Contains Orange " + fruits.contains("Orange"));
        System.out.println("Contains Apple " + fruits.contains("Apple"));
    }

	}


