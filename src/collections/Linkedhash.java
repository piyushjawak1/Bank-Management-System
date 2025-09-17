package collections;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Linkedhash {
	public static void main(String[] args) {

		TreeSet ts=new TreeSet();
		ts.add("Piyush");
		ts.add("Om");
		ts.add("Anil");
		System.out.println(ts);
		LinkedHashSet s=new LinkedHashSet();
		s.add(null);
		s.add(null);
		System.out.println(s);
		
		
	}

}
