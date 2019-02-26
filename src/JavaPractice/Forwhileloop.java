package JavaPractice;

public class Forwhileloop {
	
	public static void main(String args[])
	{
	//looping is you want to write code over and over again,to avoid the repetitive lines printing you should use FOR Loop
	//1.While loop-if you want top 10 int numbers
		//Disadvantages of while loop- 
	int i=0;//initialization
	while(i<10)//conditional path
	{
		System.out.println(i);
		i=i+1;//-if you comment this line,loop will run infinite times.//also this statement is known as incremental/decremental path
	}
	
	System.out.println("******************Go to For loop*************");
	//2.For loop:
	for(int j=10;j>=1;j--)//or use j=j+1-both of them does the same thing.
		//Initialization,conditional and incremental
		//if you want to print in reverse
	{
		System.out.println(j);

	}
	
	System.out.println("******************Go to For loop in reverse*************");

	
	for(int k=10;k>=-10;k--)//Initialization,conditional and decremental
	{
		System.out.println(k);

	}

}
}
