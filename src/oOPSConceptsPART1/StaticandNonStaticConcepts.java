package oOPSConceptsPART1;

public class StaticandNonStaticConcepts {

	//scope of variable will be applicable accross all the functions with some conditions i.e depends on static and non-static.
	int age=25;//non-static global variable.
	static String name="Tom";//static global variable.
	
public static void main(String[] args) {
    //how to call static methods,you can call them directly in a class.
	//1.Direct Calling.
	sum();
	System.out.println(name);
	//2.call by classname
	StaticandNonStaticConcepts.sum();
	System.out.println(StaticandNonStaticConcepts.name);
    //how to call non-static methods and vice versa.
    StaticandNonStaticConcepts obj=new StaticandNonStaticConcepts();
    System.out.println(obj.age);
    obj.sendemail();
    //you can access static methods by using the object reference.
    obj.sum();
    //you cannot access static variables by object reference.
    //obj.name;
	
		}

public void sendemail()
{
	System.out.println("send email");
}

public static void sum()
{
	System.out.println("Sum");
}
}
