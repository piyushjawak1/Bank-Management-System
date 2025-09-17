package corejava;

public class StringBuilderDemo {
public static void main(String[] args) {
	StringBuilder str= new StringBuilder("Fortune Cloud");
	
	System.out.println(str);
	
	System.out.println(str.append(" Technology"));
	System.out.println("String is:"+ str);
	System.out.println(str);
	System.out.println("Length is:"+str.length());
	System.out.println("String is:"+ str);
	System.out.println("Repeat"+str.repeat(str, 0));
	System.out.println("String is:"+ str);
	System.out.println("Delete"+str.delete(1, 3));
	System.out.println("String is:"+ str);
	System.out.println("Insert"+str.insert(0, false));
	System.out.println("String is:"+ str);
	System.out.println("indexof"+str.indexOf("t"));
	System.out.println("String is:"+ str);
	System.out.println("charat"+str.charAt(2));
	System.out.println("String is:"+ str);
	System.out.println("capacity"+str.capacity());
	System.out.println("String is:"+ str);
	System.out.println("replace"+str.replace(1, 3, "j"));
	System.out.println("String is:"+ str);
	System.out.println("reverse"+str.reverse());
	System.out.println("String is:"+ str);
	System.out.println("Isempty"+str.isEmpty());
	System.out.println("String is:"+ str);
	System.out.println("2");
	System.out.println("String is:"+ str);
	String st=str.toString();
	System.out.println("String is:"+ str);
	System.out.println(st);
	System.out.println("String is:"+ str);
	System.out.println("substring"+str.substring(2));
	System.out.println("String is:"+ str);
	System.out.println("Tostring"+str.toString());
	System.out.println("String is:"+ str);
	System.out.println("equals"+str.equals(str));
	System.out.println("String is:"+ str);
	System.out.println("deletecharat"+str.deleteCharAt(0));
	System.out.println("String is:"+ str);
	System.out.println("LastIndex"+str.lastIndexOf("r"));
	System.out.println("String is:"+ str);
	
}
}
