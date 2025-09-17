package Assignments;

public class SumofDigit {
public static void main(String[] args) {
	int num=46351;
	int sum=0;
	int rem=0;
	
	
	while(num>0) {
		rem=num%10;
		sum=sum+rem;
		num=num/10;
		
	}
	System.out.println("Sum is: "+sum);
} 
}
