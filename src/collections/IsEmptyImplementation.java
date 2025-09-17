package collections;

import java.util.ArrayList;
import java.util.List;

public class IsEmptyImplementation {
public static void main(String[] args) {
	List student=new ArrayList();
	student.add(12);
	student.add("Piyush");
	if(student.size()==0) {
		System.out.println("ArrayList Isempty");
	}
	else
	{
		System.out.println("ArrayList is not Isempty");
	}
}
}
