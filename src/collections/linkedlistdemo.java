package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class linkedlistdemo {
public static void main(String[] args) {
	LinkedList ll=new LinkedList();
	
	ArrayList al=new ArrayList();
	al.add(30);
	al.add("om");
	al.add(2);
	al.add("piyush");
	System.out.println(al);
	ll.add("om");
	System.out.println("Add in Linkedlist: "+ll.add(2));
	ll.addFirst(30);
	System.out.println("AddFirst: "+ll);
	ll.addLast("piyush");
	System.out.println("AddLast: "+ll);
	
	System.out.println("getfirst: "+ll.getFirst());//like peek
	System.out.println("getlast: "+ll.getLast());//offer
	System.out.println("Reversed: "+ll.reversed());
	System.out.println("LinkedList: "+ll);
	System.out.println("ArrayList: "+al);
	System.out.println("Equallly: "+ll.equals(al));
	
}
}
