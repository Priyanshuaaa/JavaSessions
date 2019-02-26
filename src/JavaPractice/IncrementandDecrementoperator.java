package JavaPractice;

public class IncrementandDecrementoperator {

	public static void main(String[] args) {
		//++
		//--
		
		System.out.println("XXXXXXXXXXXXXXXXXPOST INCREMENTXXXXXXXXXXXXXXXXXXXXXX");
		int i=1;
		int j=i++;//post increment
		System.out.println(i);
		System.out.println(j);
		
		System.out.println("XXXXXXXXXXXXXXXXXPRE INCREMENTXXXXXXXXXXXXXXXXXXXXXX");
		int a=1;
		int b=++a;//pre increment
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("XXXXXXXXXXXXXXXXXPOST DECREMENTXXXXXXXXXXXXXXXXXXXXXX");
		int x=2;
		int y=x--;//post decrement
		System.out.println(x);
		System.out.println(y);
		
		System.out.println("XXXXXXXXXXXXXXXXXPRE INCREMENTXXXXXXXXXXXXXXXXXXXXXX");
		int c=2;
		int d=--c;//pre increment
		System.out.println(c);
		System.out.println(d);

	}

}
