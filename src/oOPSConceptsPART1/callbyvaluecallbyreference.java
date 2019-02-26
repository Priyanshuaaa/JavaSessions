package oOPSConceptsPART1;

public class callbyvaluecallbyreference {
	
	int p;
	int q;

	public static void main(String[] args) {
		
    callbyvaluecallbyreference ob=new callbyvaluecallbyreference();	
	//When you call a method through an object,a copy of the arguments values like 10,20 will be give to a and b.-this is known as call by value
    int x=100;
    int y=120;
    ob.sum(x,y);//Also known as pass by value or call by value
    ob.p=50;
    ob.q=60;
    ob.swap(ob);
    System.out.println("value of p after swapping is " + ob.p);
    System.out.println("value of p after swapping is " + ob.q);
	}

	public int sum(int a,int b)
	{
		//it will take the calculation based on the latest value,so x and y values won't be changed.
		a=150;
		b=200;
		int c=a+b;
		System.out.println(c);
		return c;	
	}
	
	public void swap(callbyvaluecallbyreference swapobj)
	//You are passing the value of object reference to a different object reference which refers to the same object is known as call by reference
	{
		int temp;
		temp=swapobj.p;
		swapobj.p=swapobj.q;
		swapobj.q=temp;
	}
}
