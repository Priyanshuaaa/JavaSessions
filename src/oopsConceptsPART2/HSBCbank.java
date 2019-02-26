package oopsConceptsPART2;

public class HSBCbank implements USBankInterface,Brazilbank
//Achieving multiple inheritance-also known as "is-a-relationship".
{
//Created 5 methods,out of which 3 methods are implemented through the USBANK Interface and 2 methods are specific to the HSBC Bank.
//if a class is implementing any interface,it's mandatory to override all the methods and a class can have their separate methods.
//US Bank Methods
	public void credit()
	{
		System.out.println("credit transfer");
		
	}
	
	public void debit()
	{
		System.out.println("debit transfer");
	}
	
	public void transfermoney() {
		System.out.println("Money Transfer");

	}
	//HSBC Bank Methods
	public void educationloan()
	{
		System.out.println("Education loan Request");

	}
	
	public void carloan()
	{
		System.out.println("Car Loan Request");

	}
	
	//BrazilBank Method
	public void mutualfund()
	{
		System.out.println("Brazil Bank Method");		
	}
}
