package LogicBuilding;

public class CountDigit {
public static void main(String[] args) {
	int num=9034;
	int count=0;
	
	while(num>0) {
		count++;
		num=num/10;
		
		
	}
	System.out.println("The count is "+ count);


}
}
