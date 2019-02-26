package JavaPractice;

public class ConstructorWithThisKeyword {
	//class Vars
	//this keyword is used to initialized the class variables in a constructor
		String name;
		int age;
		
		public ConstructorWithThisKeyword(String name, int age){
			this.name = name;
			this.age = age;
			System.out.println(name);
			System.out.println(age);
		}
		
		
		
		public static void main(String[] args) {
			ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Tom",30);
		}

}
