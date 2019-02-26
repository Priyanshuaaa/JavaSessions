package oOPSConceptsPART1;

public class FunctionsinJava {

	public static void main(String[] args) {
		FunctionsinJava x=new FunctionsinJava();
		x.test();
		int z=x.PQR();
        System.out.println(z);
		int v=x.ABC(10,20);
        System.out.println(v);
	}
	
	//functions are like a factory-there are different factories and every factory will have it's own behaviour.
	//Non Static Methods
	//void doesn't return any value.
	//Functions are parallel to each other.
	//Functions are independent to each other.
	
	
	public void test()//No Input and No Output
	{
        System.out.println("test method");

	}

	public int PQR()//No Input and Some Output.
	{
		int a=80;
		int b=40;
		int c=a+b;
		return c;
	}
	
	public int ABC(int a,int b)//Some Input and Some Output.
	{
		int c=a+b;
		return c;
	}
	}

