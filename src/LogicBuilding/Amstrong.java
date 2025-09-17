package LogicBuilding;

public class Amstrong {
	public static void main(String[] args) {
		int num=153;
		int rem;
		int arm=0;
		int c=num;
		
		while(num>0) {
			rem=num%10;
			arm=(rem*rem*rem)+arm;
			num=num/10;
		}
		if(c==arm) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not Armstrong Number");
		}
	}

}
