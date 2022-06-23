package ExceptionHandling;

/*
 * 
 * Throws keyword always pass the exception from one method to another method.
 * Need to read the exception from bottom up.
 * 
 Exception in thread "main" java.lang.ArithmeticException: / by zero
	at ExceptionHandling.ThrowsKeyword.m3(ThrowsKeyword.java:24)
	at ExceptionHandling.ThrowsKeyword.m2(ThrowsKeyword.java:20)
	at ExceptionHandling.ThrowsKeyword.m1(ThrowsKeyword.java:16)
	at ExceptionHandling.ThrowsKeyword.main(ThrowsKeyword.java:30)

methods all throws the exception and main method also throws the exception to JVM.

This is not exception handling,it just throws the exception.
For exception handling, we should write try/catch block.


In main method, we should not do error handling.

Exception handling should be at method level.

@Test method should not contain the exception handling. it should 
be just for calling the methods and assertions
Exceptions should be handled within the page classes.


 */
public class ThrowsKeyword {
	
	public void m1() {
		m2();
	}

	public void m2() {
		try
		{
			m3();
		}
		catch(ArithmeticException e)
		{
			System.out.println("AE is coming");
			e.printStackTrace();
		}
		
	}
	
	public void m3() throws ArithmeticException {
		int i=9/0;
	}
	
	public static void main(String[] args) {
		
		ThrowsKeyword obj = new ThrowsKeyword();
		obj.m1();
		System.out.println("Bye");
		
		
		
		
		
	}

}
