package Assignments;

public class StringReverseAndManyMore {
	public static void main(String[] args) {//Reverse string
		String s=new String("Pune");
		
//		char ch[]=s.toCharArray();
//		
//		for(int i=ch.length-1;i>=0;i--) {
//			System.out.print(ch[i]);
//		}
		for(int i=s.length()-1;i>=0;i--) {
			System.out.println(s.charAt(i));
		}
		
		
	}

}
