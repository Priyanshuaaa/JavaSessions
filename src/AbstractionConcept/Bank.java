package AbstractionConcept;

public abstract class Bank {
//When you define a abstract class,atleast one method should be abstract.
//Can have non-abstract method as well.
//You cannot create the object of abstract classes
//It can have static and non static variables both
//It can have only final variables,no need to write final.

	static int a=100;
	int b=200;
	

public abstract void loan();//only method declaration,no body.

//non-abstract method.
public void credit()
{
	System.out.println("Bank---Credit");

}

public void debit()
{
	System.out.println("Bank--Debit");

}

}
