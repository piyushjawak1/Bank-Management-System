package corejava;

public class nestedifeg {
   public static void main(String[] args) {
	boolean checkreg=true;
	boolean checkuser=true;
	boolean checkpass=true;
	
	if(checkreg==true) {
		System.out.println("Registration Successfull now u can check the condition");
		
		if(checkuser==true&&checkpass==true){
			System.out.println("Login Successfull");
			
			
		}
		else {
			System.out.println("Login Fail");
			
		}
	}
	else {
		System.out.println("Registration unsucessfull please crate your account ");
		
	}
}
}
