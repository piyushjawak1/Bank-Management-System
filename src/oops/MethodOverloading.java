package oops;

public class MethodOverloading {
	
void payment() {
	System.out.println("debit");
}
void payment(int r) {
	System.out.println("credit");
}
void payment(int s,String str) {
	System.out.println("UPI");
}
void payment(String b,int h)
{
	System.out.println("Cash On Delivary");
}

void payment(double g) {
	System.out.println("paytm");
}
public static void main(String[] args) {
	MethodOverloading o=new MethodOverloading();
	o.payment();
	o.payment(0);
	o.payment(0.0);
	o.payment(2, null);
	o.payment(null, 2);
	
}
}
