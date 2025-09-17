package LogicBuilding;

public class reverseindifferentway {
	String str="You are very very good students";
	public static void main(String[] args) {
		 reverseindifferentway o=new  reverseindifferentway();
		 o.first_reverse();
	}
	void first_reverse() {
		String word[]=str.split(" ");
		for(int i=word.length-1;i>=0;i--) {
			System.out.print(word[i]+" ");
		}
	}

}
