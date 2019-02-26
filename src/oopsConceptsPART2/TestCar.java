package oopsConceptsPART2;

public class TestCar {

	public static void main(String[] args) {
		bmw b=new bmw();
		//if you are methods with the same name,same arguments on both child and parent class,preference will be given to child class method first-also
		//known as "Method Overidding".
        //start is the overridden method
		b.start();
		b.stop();
		b.refuel();
		b.theftsafety();
		b.engine();
		//above approach is known as static polymorphism or compile time polymorphism-means one to many.

	   System.out.println("XXXXXXXXXXXXXXXXXX");
		
	   Car c=new Car(); 
	   c.start();
	   c.stop();
	   c.refuel();
	   c.engine();
	   //c.theftsafety();-This is not allowed since you are not allowed to inherit the child class properties in Superclass.
	   
	   System.out.println("XXXXXXXXXXXXXXXXXX");
	   
	   //Top Casting
	   Car c1=new bmw();//child class object can be referred by superclass class reference variable known as dynamic polymorphism or run time polymorphism.
	   c1.start();
	   c1.stop();
	   c1.refuel();
	   c1.engine();
	   //c1.theftsafety();//you cannot access the properties of the object class by using the reference of the superclass,in dynamic polymorphism it's not allowed
	   //If you want to use the properties of the child class by using the child class reference,you can use compile time polymorphism.
	   
	   //Down Casting
	   //bmw x1=new Car();-Not allowed,you cannot refer the parent class object through child class reference.
	   //bmw x1=(bmw)new Car();//this is known as casting means this know becomes the object of the BMW Class
	   //bmw c2=(Car)new bmw();//you cannot do down casting in JAVA,it's possble to do down tcasting but it will throw java.lang.ClassCastException.
	}

}
