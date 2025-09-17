package Assignments;

public class StringTaskReversejuly {
  public static void main(String[] args) {
	String s="july";
	String reversed="";
	
	for(int i=s.length()-1;i>=0;i--) {
		reversed=reversed+s.charAt(i);
	}
	System.out.println("The original string:"+s);
	System.out.println("The reveresd string:"+reversed);
}
}
