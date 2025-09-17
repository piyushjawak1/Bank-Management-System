package corejava;

public class ArrayDeclareSecondWay {
	public static void main(String[] args) {
		String str[]=new String[8];
		str[0]="Piyush";
		str[1]="Om";
		str[2]="Anil";
		str[3]="Sameer";
		str[4]="Parag";
		str[5]="Sakshi";
		str[6]="Kiran";
		str[7]="Prajkta";
		System.out.println(str.length);
	 for(int i=0;i<str.length;i++) {
		 System.out.println(str[i]);
	 }
	
	}

}
