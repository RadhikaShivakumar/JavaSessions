package ExceptionHandling;
/*
 Throw keyword:
 To generate our own exception.
 
 java.lang.Exception: SomeExceptionIsComing
	at ExceptionHandling.ThrowKeyword.main(ThrowKeyword.java:13)

Use cases:
==========
String data = null; [ Test data is null] 

Some Exception is coming..
java.lang.Exception: DataNotFoundException
	at ExceptionHandling.ThrowKeyword.main(ThrowKeyword.java:32)

 */
public class ThrowKeyword {

	
	public static void fetchData() throws Exception
	{
		String data = null;
		if(data==null)
		{
			throw new Exception("DataNotFoundException");
		}
	}
	
	public static void useExcelData()
	{
		try
		{
			fetchData();
		}
		catch(Exception e)
		{
			System.out.println("Some Exception is coming..");
			e.printStackTrace();
		}
		
		
	}
	public static void main(String[] args) {

		try
		{
			throw new Exception ("SomeExceptionIsComing");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		useExcelData();

	}

}
