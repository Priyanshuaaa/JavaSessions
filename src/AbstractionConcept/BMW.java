package AbstractionConcept;

public class BMW implements Car{
//you have to define the logic of all the hidden methods to achieve 100% abstraction.

	@Override
	public void start() {
	System.out.println("Car---Start");
	}

	@Override
	public void stop() {
	System.out.println("Car----Stop");
	}

	@Override
	public void refuel() {
	System.out.println("Car-----Refuel");
	}
	
	public void theftsafety()
	{
		System.out.println("BMW----theft safety");

	}
	
	

}
