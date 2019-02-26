package oopsConceptsPART2;

public class Testbank {
	
	public static void main(String[] args) {
		//USBankInterface us=new USBankInterface();--You cannot create the object of an interface,this is not allowed.
		//USBankInterface us=new HSBCbank();--You can do this but doesn't know the meaning of this ,need to do an R&D on this as it has been used whil elaunching the drivere in selenium.
		HSBCbank hsbc=new HSBCbank();
		hsbc.credit();
		hsbc.debit();
		hsbc.carloan();
		hsbc.educationloan();
		hsbc.transfermoney();
		hsbc.mutualfund();
		//this is static polymorphism,also known as compile time polymorphism.
		
	   //Dynamic polymorphism
	   //Child class object can be referred by the parent interface reference variable.
		USBankInterface us=new HSBCbank();
		us.credit();
		us.debit();
		us.transfermoney();
		int k=USBankInterface.min_balance;//you cannot change the value of the interface variables since they are final in nature.
		System.out.println(k);
	}
	
	   

}
