package JavaPractice;

public class ConstructorConcept {
//Constructor refers to the state of the current object.
//Constructor are automatically when the object of a class has been created.
//Constructor are used to define class features in  the form of global variables,it looks like a function but it is not.
//It doesn't return any value,name should be same as class name.
	
	public ConstructorConcept() {
		System.out.println("Default const");
	}

	public ConstructorConcept(int i) {
		System.out.println("single param constructor");
		System.out.println("the value of i " + i);
	}

	public ConstructorConcept(int i, int j) {
		System.out.println("two params constructor");
		System.out.println("the value of i " + i);
		System.out.println("the value of j " + j);

	}

	public static void main(String[] args) {

		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(10, 20);
	}


}
