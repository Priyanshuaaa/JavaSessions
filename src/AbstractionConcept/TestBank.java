package AbstractionConcept;

public class TestBank {
	public static void main(String[] args) {
	    //static Polymorphism-Compile Time Polymorphism.
		HDFCbank hd=new HDFCbank();
		hd.credit();
		hd.debit();
		hd.loan();
		hd.funds();
	
	    //Dynamic Polymorphism-Run Time Polymorphism.
		Bank bb=new HDFCbank();
		bb.credit();
		bb.debit();
		bb.loan();

	
	}
	

}
