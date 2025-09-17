package Assignments;

public class TaskEncapulation {
String name;
private String email;
private String mobileno;
private double  BankBalanace;
String dob;

public void setemail(String email) {
	this.email=email;
}

public String getemail() {
	return email;
}
public void setname(String name) {
	this.name=name;
}
public String name() {
	return name;
}

public void setmobilno(String mobileno) {
	this.mobileno=mobileno;
}
public String getmobileno() {
	return mobileno;
}
public String getname() {
	return name;
}
public static void main(String[] args) {
	TaskEncapulation ob=new TaskEncapulation();
	ob.setemail("piyushjawak1@gmail.com");
	System.out.println(ob.getemail());
	ob.setmobilno("8767988048");
	System.out.println(ob.getmobileno());
	
	ob.setname("piyush");
	System.out.println(ob.getname());
	ob.setBankBalanace(900000);
	System.out.println(ob.getBankBalanace());
}

public double getBankBalanace() {
	return BankBalanace;
}

public void setBankBalanace(double bankBalanace) {
	this.BankBalanace = bankBalanace;
}



}


