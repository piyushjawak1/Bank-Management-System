package oops;

public class hysubchild extends hychild2 {
void subchild() {
	System.out.println("Subchild");
}
public static void main(String[] args) {
	hysubchild o=new hysubchild();
	o.child2();
	o.parent();
	o.subchild();
	
	hychild1 ob=new hychild1();
	ob.child1();
}
}
