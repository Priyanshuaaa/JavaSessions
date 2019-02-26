package oOPSConceptsPART1;

public class WrapperClass {
	//wrapper classes is used for Data Conversion,from int to char,char to staring or vice versa.
	public static void main(String[] args)
	{
		//The only limitation we have is we cannot convert any data type to "Char".
		String x="100";
		System.out.println(x+20);
		//Integer.parseint is used to convert only from String to Integer.
		int i=Integer.parseInt(x);
		System.out.println(i+20);
		//Integer,char,boolean and double.
		//String to double Conversion.
		double j=Double.parseDouble(x);
		System.out.println(j+20);
		//String to char-we cannot convert string to char
		//String to boolean
		String z="True";
		boolean t=Boolean.parseBoolean(z);
		System.out.println(t);
		//int to string conversion
		int f=120;
		String s=String.valueOf(f);
		System.out.println(s+20);
		//if you are converting from string to integer,you should make sure your string is purely number otherwise it will throw 
		//"Number format exception" provided string-"100AA".
		String u="100AA";
		int gh=Integer.parseInt(u);//--Not allowed
		System.out.println(gh);
	}
	
	

}
