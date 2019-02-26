package oopsConceptsPART2;

public interface USBankInterface {
//There is no main method in an Interface.
//We cannot give method body in an Interface.
//We can give only method declaration i.e prototype.
//We can declare variables into interface and default is static,
//Vars value willn't be changed.,it will be constant in nature
//No static methods in an interface because they comes under OOP concepts. 
//You cannot create the object of an Interface.
//Interfaces are abstract in nature.
	int min_balance=100;
	public void credit();
	public void debit();
	public void transfermoney();
	

}
