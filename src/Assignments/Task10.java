package Assignments;

import java.util.*;

public class Task10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> flowers = new HashSet<>();

        
        System.out.println("Enter 10 flower names:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Flower " + (i + 1) + ": ");
            String flower = sc.nextLine();
            flowers.add(flower);
        }

               System.out.println("\nFlower names stored in HashSet:");
        for (String flower : flowers) {
            System.out.println(flower);
        }

        
        if (flowers.contains("Rose")) {
            flowers.remove("Rose");
            System.out.println(" 'Rose' was found and removed from the collection.");
        } else {
            System.out.println("'Rose' not found in the collection.");
        }

       
        System.out.println("\nUpdated Flower List:");
        for (String flower : flowers) {
            System.out.println(flower);
        }

    }
}
