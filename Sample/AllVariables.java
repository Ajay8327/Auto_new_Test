package day3.variableexamples;

public class AllVariables {

	static int result;
	int num1=10,num2;
	public static void main(String[] args) {		
		System.out.println("Program starts");
		char grade='A';
		System.out.println("local variable grade: "+grade);
		System.out.println("static global variable,result: "+result);
		
		AllVariables ref1=new AllVariables();
		System.out.println("Non-static global variable, num1 with ref1: "+ref1.num1);
		System.out.println("Non-static global variable, num2 with ref1: "+ref1.num2);
		
		ref1.num1=55;
		ref1.num2=45;
		result=ref1.num1+ref1.num2;
		System.out.println("updated, Non-static global variable, num1 with ref1: "+ref1.num1);
		System.out.println("updated, Non-static global variable, num2 with ref1: "+ref1.num2);
		System.out.println("static global variable,result: "+result);
		
		AllVariables ref2=new AllVariables();
		System.out.println("Non-static global variable, nun1 with ref2: "+ref2.num1);
		System.out.println("Non-static global variable, num2 with ref2: "+ref2.num2);
		result=ref2.num1+ref2.num2;
		System.out.println("static global variable,result: "+result);
		System.out.println("Program ends");
	}

}
