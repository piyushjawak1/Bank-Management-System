package keywords;

public class finaldemo  extends final2{
	void abc() {
		super.abc();
		System.out.println("Child");
	}
	
	public static void main(String[] args) {
		finaldemo ob=new finaldemo();
		ob.abc();
		final int d=90;
		System.out.println(d);
	}

}
