package Assignments;

public class demo {
   demo(){
	   System.out.println("demo");
   }
   demo(int a){
	   demo o=new demo();
	 
	   System.out.println("demo1");
   }
   public static void main(String[] args) {
	
	demo ob=new demo(1);
}
}
