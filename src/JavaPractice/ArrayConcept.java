package JavaPractice;

public class ArrayConcept {

	public static void main(String[] args) {
    //Advantage-Array is used to store the similar data type values into an array variable
	//All these below array are 1 dimensional array
	//Disadvantages of Array-1.Size is fixed,you cannot increase the size of an array-also known as Static Array-it will give you "Index out of bound exception"
	//2-It store similar data type values-to overcome this problem we use object array,it will store different data type values but the size will always be fixed. 
	//We use collections like hash table,array list--dynamic array--we can change the size in dynamic array.
		
		
	//1.int array
	
		int i[]=new int[4];//It will store the 4 int vales into an array
		//in Java memory,a location will be given to this array and then would be divided into 4 parts and address of 1st location will be 0 
		//and 2nd location will be given to 1(in the form of index 0,1,2,3 for 4 int data type values
		i[0]=100;
		i[1]=22;
		i[2]=25;
		i[3]=30;
		//i[3]=40.33;//i cannot store double data type since this is an int array,it will throw an error
		//lowest bound/index=0
		//upper bound/index=n-1(n is the size of array)
		System.out.println(i[2]);
		//System.out.println(i[4]);//if you want to print the values of the invalid index,then it will throw an error "java.lang.ArrayIndexOutofBoundsException"
        //like this-Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4
		System.out.println(i.length);
		for(int j=0;j<i.length;j++)
		{
			System.out.println(i[j]);
		}
		//2.Double Array
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXDOUBLE ARRAYXXXXXXXXXXXXXXXXXXXXXXXXXX");
		double x[]=new double[4];
		x[0]=100.23;
	    x[1]=200.489;
	    x[2]=300.693;
	    x[3]=400.123;
		System.out.println(x[2]);
		//System.out.println(x[4]);
	
	//3.Boolean Array
	System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXCHAR ARRAYXXXXXXXXXXXXXXXXXXXXXXXXXX");
	char b[]=new char[4];
	b[0]='A';
    b[1]='B';
    b[2]='C';
    b[3]='D';
	System.out.println(b[2]);
	
	//4.String Array
	System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXSTRING ARRAYXXXXXXXXXXXXXXXXXXXXXXXXXX");
	String s[]=new String[4];
	s[0]="Welcome";
	s[1]="Back";
	s[2]="To";
	s[3]="World";
	System.out.println(s.length);
	System.out.println(s[1]);
	
	//5.Object Array-object is a superclass available in JAVA--Object is class
	//used to store different data type values
	System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXOBJECT ARRAYXXXXXXXXXXXXXXXXXXXXXXXXXX");
	Object ob[]=new Object[5];
    ob[0]="Priyanshu";
    ob[1]=30;
    ob[2]=12.33;
    ob[3]="14/09/1988";
    ob[4]='W';
	System.out.println(ob[2]);
	System.out.println(ob.length);
	for(int z=0;z<ob.length;z++)
	{
		System.out.println(ob[z]);
	}
	}
}
