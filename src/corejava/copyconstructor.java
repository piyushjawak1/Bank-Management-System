package corejava;

public class copyconstructor {
	int rollno;
	String name;
	
	copyconstructor(int r,String s){
		rollno=r;
		name=s;
		System.out.println(rollno);
		System.out.println(name);
	}
	copyconstructor(copyconstructor o){
		
		System.out.println(o.rollno);
		System.out.println(o.name);
	}
	public static void main(String[] args) {
		copyconstructor o=new copyconstructor(2,"Piyush");
		copyconstructor ob=new copyconstructor(o);
	}
	

}
