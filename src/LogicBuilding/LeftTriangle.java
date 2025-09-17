package LogicBuilding;

public class LeftTriangle {
	public static void main(String[] args) {
		for(int i=1;i<=3;i++) {
			for(int s=2;s>=i;s--) {
				System.out.print(" ");
			}
			for(int c=1;c<=i;c++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
