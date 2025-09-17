package collections;

import java.util.LinkedHashSet;

public class LinkedHashset {
	public static void main(String[] args) {
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("Piyush");
		lhs.add(5);
		lhs.add('*');
		System.out.println("LinkedHashSet: "+lhs);
		
		lhs.addFirst("OM");
		lhs.addLast("Anil");
		System.out.println("LinkedHashSet After AddFirst and Last: "+lhs);
		//lhs.clear();
		System.out.println("LinkedHashSet: "+lhs);
	
		System.out.println("Contains: "+lhs.contains(5));
		System.out.println("Get First:"+lhs.getFirst());
		System.out.println("Get Last:"+lhs.getLast());
		
		
	}

}
