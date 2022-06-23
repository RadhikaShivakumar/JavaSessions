package ExceptionHandling;
/*
 ArithmeticException is also a class, e is the reference given to the class
 
 Object(Super class of all classes)
 
 -->  Throwable (Parent)
Error (child of Throwable)  --> Exception class :  All these below are children.
code is wrong
(stack overflow error)			 -- ArithmeticException
runtime errors					 -- NullpointerException
memory errors,hardware errors	 -- ArrayIndexOutofBound exception
 
 Since all exception is parent of Exception Class,writing (Exception e) in catch block handles
 all kind of exceptions
 
 
 (Throwable e)  --> when expecting error and exception both.
 
 if only exception then its a good practice to write multiple catch blocks.
 
 
 Catch block with (Exception e) and (NPE e) is not allowed as Exception can handle all kind of
 exception
 
 catch block with duplicate exception is not allowed.
 
 Catch block with exception and error block is allowed --> (NPE e) (AE e) (Error e)
 
 Single try block cannot be written. if need to write just write a single try block, it should
 be accompanied by finally block.
 
 
 */
public class ExceptionHandling {

	String name;
	
	public static void main(String[] args) {
		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		try
		{
			int i =9/0; //Execution stops here itself
			ExceptionHandling obj = new ExceptionHandling();
			obj=null;
			obj.name="naveen";
		}
		catch(ArithmeticException e) 
		{
			System.out.println("AE is coming..");
			e.printStackTrace(); //To print exception reason,in which file and at which line
		}
		
		catch(NullPointerException e) 
		{
			System.out.println("NPE is coming..");
			e.printStackTrace(); 
		}
		
		System.out.println("Bye");
		System.out.println("Bye");

	}

}
