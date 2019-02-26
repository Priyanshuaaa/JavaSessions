package oOPSConceptsPART1;

public class LocalandGlobalvariables {
	
	//These are global variables,also known as instance variables
	String name="TOM";
	int age=25;
	

	public static void main(String[] args) {
		//these are local variables of the main() method.
		//i is local variables for the main() method
		int i=10;
        System.out.println(i);
        LocalandGlobalvariables ob=new LocalandGlobalvariables();
        //When the object of a particular class has been created,a copy of all the static methods and global(instance) variables is given to 
        //an object.
        System.out.println(ob.name);
        System.out.println(ob.age);
	}
	
	public void sum()
	{
		//i is local variables for the Sum() method
		int i=10;
		int j=20;
		int age=35;
	}
	

}
