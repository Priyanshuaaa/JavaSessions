package oOPSConceptsPART1;

public class MethodOverloading {
	
public static void main(String[] args) {
	MethodOverloading x=new MethodOverloading();
    x.sum();
    x.sum(50);
    x.sum(10);
    x.sum(10,20);
	}

//Main method can be overloaded and you can have more than 1 main method as below.
public static void main()
{
	
}

public static void main(int a)
{
	
}

	//Method Overloading-When the method name is same with different arguments and having different data types or input parameters within the same class.
    //You can't create a method inside a method
    //Duplicate Methods-i.e same method name with same number of arguments are not allowed.
public void sum()
{
    System.out.println("SUM METHOD---without param");

}

public void sum(int i)
{
    System.out.println("SUM METHOD---one param");
    System.out.println(i);

}

public void sum(int i,int j)
{
    System.out.println("SUM METHOD---tow param");
    System.out.println(i+j);

}

public void sum(double i)
{	    
	System.out.println("SUM METHOD---one param with different data type");
    System.out.println(i);
}

}