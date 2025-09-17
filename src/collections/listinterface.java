package collections;

import java.util.ArrayList;
import java.util.List;

public class listinterface {
	public static void main(String[] args) {
		List studentsdata= new ArrayList();
		studentsdata.add("Piyush");
		studentsdata.add(90);
		studentsdata.add(98.2);
		studentsdata.add('A');
		studentsdata.add(true);
		
		
		System.out.println(studentsdata);
		System.out.println("Getfirst: "+studentsdata.get(0));
		System.out.println("indexof: "+studentsdata.indexOf(1));
		//System.out.println("addlast: "+ studentsdata.addLast(1));
		//System.out.println("Addfirst: "studentsdata.addFirst());
		//indexof,addlst,addfirst,addwithindex,getfirst,getlast,isemnpty,size,remeovefirst,removelast,
		//set,lastindexof,contains,tostring,sublist,reverse,remove,clear
		System.out.println("Sublist: "+studentsdata.subList(1, 3));
		System.out.println("Reverse is: "+studentsdata.reversed());
		
		
	}

}
