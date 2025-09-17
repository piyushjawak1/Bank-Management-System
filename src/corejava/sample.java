package corejava;

public class sample {
 sample(){
	 System.out.println("Hello");
 }
 sample(int r){
	 sample oo=new sample();
	 System.out.println("Everyone");
 }
 
 public static void main(String[] args) {
	sample o=new sample(5);
	//sample ob=new sample();
}
}
