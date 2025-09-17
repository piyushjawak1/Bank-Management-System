package Assignments;

public class TwoDarrayIDandName {
	public static void main(String[] args) {
		String data[][]= {{"ID","Name"},
				          {"1","jay"},
				          {"2","om"}
		};
		
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[0].length;j++) {
				System.out.print(data[i][j]+" ");
			}
			System.out.println();
		}
	}

}
