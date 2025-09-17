package keywords;

public class ThisKeyword {
	String str;
	
	void show(String str) {
		this.str=str;
		System.out.println(str);
	}
	public static void main(String[] args) {
		ThisKeyword o=new ThisKeyword();
		o.show("Piyush");
		System.out.println(o.str);
	}

}
