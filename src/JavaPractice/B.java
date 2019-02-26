package JavaPractice;

public class B extends A {

	public B() {
		// scope of super would be only inside another constructor
		// Super keyword is used to call the parent class constructor,by default it will
		// call the constructor with no params since while creating the object you
		// haven't passed any parameter.
		// super keyword should be the 1st statement in child class constructor and
		// should be used in child class constructor only.
		super(10, 20);
		// super(10);--this is not allowed,you cannot have super twice within the same
		// constructor.
		System.out.println("child class constructor");
	}

	public B(int i) {
		super(i);
	}

	public B(int i, int j) {
		super(i, j);
	}

	public static void main(String[] args) {
		B obj = new B();// when you create an object of B,both parent and child class constructor will
						// be called since you are extending
		// A-First it will jump to parent constructor then to child constructor
		// You cannot initialize the parent class constructor using the object of child
		// class.,you will have to create the object of parent class.
		B obj1 = new B(10);
		B obj2 = new B(10, 20);
	}

}