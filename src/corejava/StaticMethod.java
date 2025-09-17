package corejava;

public class StaticMethod {
public static void main(String[] args) {
	display();
	StaticMethod o=new StaticMethod();
	o.area();
    
}
static void display() {
	System.out.println("Today is Saturday");
}
void area() {
	int l=3,b=3;
	System.out.println("Area of Rectangle is:"+l*b);
}
}
