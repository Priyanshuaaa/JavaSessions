package AbstractionConcept;

public class HDFCbank extends Bank{
	//Whenever you extend any abstract class,it's child class responsibility to give the implementation logic.
	//Abstract means to hide the implementation logic.
	//In order to achieve partial abstraction,we need abstraction.

	public void loan() {
	//Here we are writing the business logic of the abstract method.
	System.out.println("Bank---loan");//also known as method overriding.
	}
	
	public void funds()
	{
		System.out.println("HDFC---Funds");

	}
	
	

}
