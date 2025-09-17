package LogicBuilding;

public class spacesandstar {
public static void main(String[] args) {
	//---***
	//---***
	//---***
	for(int r=1;r<=3;r++) {
		for(int c=1;c<=6;c++) {
			if(c==1||c==2||c==3) {
				System.out.print(" ");
			}
			else {
				System.out.print("*");
			}
		}
		System.out.println();
	}
}
}
