package oops;

public class dowhileloop extends Loop {
void doloop() {
	System.out.println("Do While Loop");
	int i=1;
	do {
		System.out.println(i);
		i++;
		
	}while(i<=3);
}
public static void main(String[] args) {
	dowhileloop o=new dowhileloop();
	o.doloop();
	o.loopbase();
	
	forloop ob=new forloop();
	ob.forbase();
	
	
	whileloop obj=new whileloop();
	obj.whileloopbase();
}
}
