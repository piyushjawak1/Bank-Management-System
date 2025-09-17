package LogicBuilding;

public class NewPattern {
	public static void main(String[] args) {
		char ch='D';
	
		for(int r=1;r<=4;r++) {
			for(int s=1;s<=r;s++) {
				System.out.print(" ");
			}
			for(int c=4;c>=r;c--) {
				System.out.print(ch);
			}
			System.out.println();
			ch--;
		}
	}

}
