package AbstractionConcept;

public class TestCar {
	
	public static void main(String[] args) 
	{
	   //static Polymorphism-Compile Time Polymorphism.
	   BMW bm=new BMW();
	   bm.refuel();
	   bm.start();
	   bm.stop();
	   bm.theftsafety();
	   
	   //Dynamic Polymorphism-Run Time Polymorphism.
	   Car cc=new BMW();
	   cc.start();
	   cc.stop();
	   cc.refuel();
	   //cc.theftsafety();----not allowed

	   
	}

}
