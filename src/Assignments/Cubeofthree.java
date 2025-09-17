package Assignments;

public class Cubeofthree {
	int cube(){
		return 3*3*3;
	}
	public static void main(String[] args) {
		
		Cubeofthree obj=new Cubeofthree();
		int result=obj.cube();
		System.out.println("Cube of three is:"+result);
	}

}
