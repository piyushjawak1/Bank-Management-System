package oops;

public class course extends institute {
   void b()
   {
	   System.out.println("Course Names are:");
	   System.out.println("java");
	   System.out.println("py");
	   System.out.println("mern");
	   System.out.println("testing");
	   System.out.println("mannual");
   }
   public static void main(String[] args) {
	course c=new course();
	c.a();
	c.b();
}
}
