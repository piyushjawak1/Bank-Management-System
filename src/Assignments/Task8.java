package Assignments;

import java.util.*;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> panList = new LinkedList<>();

       
        System.out.print("Enter how many PAN numbers you want to store: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.print("Enter PAN number " + (i + 1) + ": ");
            String pan = sc.nextLine();
            panList.add(pan);
        }

        
        System.out.println("\nPAN Numbers stored in LinkedList:");
        for (String pan : panList) {
            System.out.println(pan);
        }

     
        System.out.print("\nEnter a PAN number to search: ");
        String searchPan = sc.nextLine();

        boolean found = false;
        for (String pan : panList) {
            if (pan.equals(searchPan)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(" PAN number " + searchPan + " exists in the list.");
        } else {
            System.out.println(" PAN number " + searchPan + " not found in the list.");
        }

        sc.close();
    }
}



