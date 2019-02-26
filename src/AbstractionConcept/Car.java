package AbstractionConcept;

public interface Car {
//In order to achieve full abstraction,we need to use interface.
//cannot create the objects of interfaces either.
//No need to write abstract keywords.
//only static(it is default static) and final variable are allowed and defined.
	
	int a=100;
	public void start();//no method body,only declaration.
	public void stop();
	public void refuel();

}

