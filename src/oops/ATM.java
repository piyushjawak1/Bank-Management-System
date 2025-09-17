package oops;

public interface ATM {
default void accounttype()
{
	System.out.println("Saving");
}
static void action()
{
	System.out.println("Deposit");
	System.out.println("Withdrawn");
}
abstract void atmpin();
}
