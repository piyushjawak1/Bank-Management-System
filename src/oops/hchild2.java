package oops;

public class hchild2  extends hparent{
void child2() {
	System.out.println("I am child2 class");
}
public static void main(String[] args) {
	hchild2 o=new hchild2();
	o.child2();
	o.parent();
	
	hchild1 ob=new hchild1();
	ob.child1();

}
}
