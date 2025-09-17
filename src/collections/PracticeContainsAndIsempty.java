package collections;

import java.util.ArrayList;
import java.util.List;

public class PracticeContainsAndIsempty {
	public static void main(String[] args) {
		List A=new ArrayList();
		A.add(15);
		A.add("Piyush");
		int count=0;
		String s="Piyush";
		for(int i=0;i<A.size();i++) {
			if(A.get(i).equals(s)) {
				count++;
				
			}
		}
		if(count==0) {
			
			System.out.println("ArrayList not Constains: "+s);
		}
		else {
			System.out.println("ArrayList contains: "+s);
		}
	}

}
