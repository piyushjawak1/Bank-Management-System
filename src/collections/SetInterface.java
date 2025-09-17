package collections;

import java.util.ArrayList;
import java.util.HashSet;

public class SetInterface {
	public static void main(String[] args) {
		HashSet s=new HashSet();
		s.add("Piyush");
		s.add(12);
		s.add('@');
		s.add(12);
		s.add(null);
		s.add(null);
		
	
		ArrayList ls=new ArrayList();
		ls.add(1);
		ls.add(1);
		ls.add(null);
		ls.add(null);
		
		
		
		System.out.println("Contains: "+s.contains(12));
		System.out.println("Isempty: "+s.isEmpty());
		//s.clear();
		//System.out.println("Clear: "+s);
		//System.out.println("Remove: "+s.remove(12));
		System.out.println(s);
		//System.out.println("RemoveAll: "+s.removeAll(s));
		System.out.println("Size: "+s.size());
		System.out.println();
		System.out.println("ArrayList: "+ls);
		System.out.println("HashSet: "+s);
	}

}
