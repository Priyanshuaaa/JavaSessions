package oOPSConceptsPART1;

public class Car {
	
	int mod;
	int wheel;

	public static void main(String[] args) {
		Car a=new Car();
		Car b=new Car();
		Car c=new Car();
		a.mod=2015;
		a.wheel=4;
		b.mod=2014;
		b.wheel=5;
		c.mod=2019;
		c.wheel=6;
        System.out.println(a.mod);
        System.out.println(b.mod);
        System.out.println("After Changing the references");
		a=b;
		b=c;
		c=a;
        System.out.println(a.mod);
        System.out.println(b.mod);
        System.out.println(c.mod);


	}
	
	

}
