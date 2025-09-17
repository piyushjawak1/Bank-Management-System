package oops;

public class encapsulation {
	private long aadharNo;
	private String panNo;
public void setadharNo(long aadharNo) {
	 this.aadharNo=aadharNo;
	
}
public long getaadharNo() {
	return aadharNo;
}
public void setpanNo(String panNo) {
	this.panNo=panNo;
	
}

public String getpanNo() {
	return panNo;
}
public static void main(String[] args) {
	encapsulation o=new encapsulation();
	o.setadharNo(12355989);
	System.out.println(o.getaadharNo());
	o.setpanNo("SEPJHG0152");
	System.out.println(o.getpanNo());
}

}
