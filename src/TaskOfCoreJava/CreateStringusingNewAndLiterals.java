package TaskOfCoreJava;

public class CreateStringusingNewAndLiterals {
	public static void main(String[] args) {
		//Using literals
		String str1="hello";
		String str2="hello";
		//Using new Keyword
		String str3=new String("hello");
		String str4=new String("hello");
		//print
		System.out.println("String created using literals:"+str1);
		System.out.println("String created using literals:"+str2);
		System.out.println("String created using new:"+str3);
		System.out.println("String created using new:"+str4);
		//compare
		
		System.out.println("str1==str2:"+(str1==str2));
		System.out.println("str2==str3:"+(str2==str3));
		System.out.println("str3==str4:"+(str3==str4));
		System.out.println("str1==str4:"+(str1==str4));
		 System.out.println("str1.equals(str3):" + str1.equals(str3)); 
		
	}

}
