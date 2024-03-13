package day3.variableexamples;

public class NonStaticGlobalVariableExample3 {
	//global variable
	int age=25;//non-static global variable
	double salary;//non-static global variable
	public static void main(String[] args) {
		System.out.println("Program starts");		
		//object declaration and initialization
		NonStaticGlobalVariableExample3 ref=new NonStaticGlobalVariableExample3();
		System.out.println("NSGV age: "+ref.age);
		System.out.println("NSGV salary: "+ref.salary);		
		//update salary value
		ref.age=35;
		ref.salary=25000.56;
		System.out.println("update NSGV age with ref object: "+ref.age);
		System.out.println("update NSGV salary with ref object: "+ref.salary);	
		
		//another object of class NonStaticGlobalVariableExample3
		NonStaticGlobalVariableExample3 r1=new NonStaticGlobalVariableExample3();
		System.out.println("NSGV age with r1 object: "+r1.age);
		System.out.println("NSGV salary with r1 object: "+r1.salary);		
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