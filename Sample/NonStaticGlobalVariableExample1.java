package day3.variableexamples;

public class NonStaticGlobalVariableExample1 {
	//global variable
	int age=25;//non-static global variable
	double salary;//non-static global variable
	public static void main(String[] args) {
		System.out.println("Program starts");
		//object declaration 
		NonStaticGlobalVariableExample1 ref;
		//object initialization
		ref=new NonStaticGlobalVariableExample1();
		System.out.println("NSGV age: "+ref.age);
		System.out.println("NSGV salary: "+ref.salary);		
		System.out.println("Program ends");
	}
}
/*
Non-Static Global Variable:
	any global variable declare without static keyword known as nonstatic global variable
	* any nonstatic member will be loaded in the memory at time of execution(runtime)
	* to load them into the memory we need create an instance/object of the class using-
		classname referenanceVariable;
		referenanceVariable = new classname();
				//or
		classname referenanceVariable =new classname();
	* once object is created, we can access nonstatic member in following ways
		1. any nonstatic member can be access by another nonstatic method directly
		2. always use Object referenanceVariable to access nonstatic members of the class
	* we are allowed to create multiple object of a class for each object creation you will separate
	  memory allocation along copy of nonstatic members
*/