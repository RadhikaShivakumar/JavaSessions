package MethodOverloading;
/*
 * Video: Java_10_MethodOverloading
 * 
 * Method overloading: Giving flexibility to user
 * within the same class you have different methods:
 * 1. with the same name
 * 2. with different parameters
 * 3. with different sequence of the parameters
 * Method overloading is also called polymorphism.(compile time polymorphism,static polymorphism,early binding)
Method overriding is also called dynamic polymorphism
 
 compile time polymorphism:
 Decision is already taken by the compiler as to which method of overloaded methods need to be called
 hence it is called compile time polymorphism.
 
 80% in java are decision is taken by the compiler(JVM).
 Java is much faster than python.(No compilation)
 for faster aplication, prefer java
 
 In python,everything happens at run time and results provided.(pvm- python virtual machine)
 python is preffered for applications where speed does not matter.


comma separated values in method overloading -> max 255 times(integers)
double (126)
String (255)

Never pass high number of comma separated values.

 */
public class MethodOverloadingDemo {

	public int test()
	{
		System.out.println("Test method..");
		return 10;
	}
	
	public String test(int a)
	{
		System.out.println("Test method.." + a);
		return "naveen";
	}
	
	public void test(int a,int b)
	{
		System.out.println("Test method.." + a +b);
	}
	
	public void test(int a, String b)
	{
		System.out.println("test method.."+a+b);
	}
	
	
	public static void main(String[] args) {

		MethodOverloadingDemo md = new MethodOverloadingDemo();
		md.test(10);
		
	}

}
