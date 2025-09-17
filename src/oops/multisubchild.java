package oops;

public class multisubchild extends multichild {
 void subchild() {
	 System.out.println("Subchild");
 }
 public static void main(String[] args) {
	//Creation of object because it is not static 
	 multisubchild o=new multisubchild();
	 o.parent();
	 o.child();
	 o.subchild();
	
}
}
