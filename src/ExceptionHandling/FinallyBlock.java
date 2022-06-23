package ExceptionHandling;
/*
 Finally Block:
 =============
 Exception is coming or not, it will execute statements in Finally block.
 
 multiple return values in try,catch,finally block
 the values gets overwritten by the value of finally block.
 
 in which case finally block will not be executed?
 only in case of System.Exit(1);
 
 Use cases:
 ----------
 For database connection, when the connection is done, the DB connection 
 should terminate,in case of Exception it might not happen,hence finally block
 execute irrespective of execption comes or not.
 
 DB server gets high with 100s of connection request and queries.
 if connection is not terminated then server gets loaded with open connections.
 the connection is open for that user forever if not terminated.
 
DB connection
1. make the DB connection
2. hit your URL
3. send the SQL to server
4. Get the results from DB server
5. Use the data
finally
{
  6. Close the DB connection
}


File Handling:
 1. open the file
 2. perform operations
 finally
 {
 3. close the file
 }
 
 What is System.exit( 0 or 1)
 0 -> Partial shutdown
 1 -> complete shutdown
 
 We don't use this in real time coding.
 
 
 */
public class FinallyBlock {

	public static int getMarks(String name)
	{
		System.out.println("Getting marks for: "+ name);
		if(name.equals("Jaya"))
		{
			try {
				int i=9/0;
				System.exit(1); // terminate java immediately.
				return 90;
			}
			catch(ArithmeticException e)
			{
				System.out.println("Some Exception is coming..");
				return 91;
			}
			finally 
			{
				System.out.println("Inside finally block..");
				return 92;
			}
			
		}
		else if(name.equals("Tom"))
		{
			return 95;
		}
		else if(name.equals("Naveen"))
		{
			return 80;
		}
		else {
			System.out.println("Student is not found..");
			return -1;
		}
	}
	
	public static void main(String[] args) {

//		System.out.println("A");
//		try {
//			int i=9/0;
//		}
//		catch(ArithmeticException e)
//		{
//			e.printStackTrace();
//		}
//		finally
//		{
//			System.out.println("This is finally block.....");
//		}
		
		int score = getMarks("Jaya");
		System.out.println(score);
	}

}
