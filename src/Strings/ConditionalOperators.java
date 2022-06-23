package Strings;

public class ConditionalOperators {

	public static void main(String[] args)
	{
		int a = 11;
		int b = 20;
		
		if(a==b)
		{
			System.out.println("both are equal");
		}
		else 
		{
			System.out.println("Both are not equal");
		}

		
		if(a>=10)
		{
			System.out.println("This is greater than or equal to 10");
		}
		
		// interview - e.g. for Dead code
		// Here, true is passed directly to if condition and the 
		
		if(true)
		{
			System.out.println("Hi");
		}
		//else 
	//	{
			System.out.println("Bye");   //Dead code - a code that never runs.
		//}
		
		//Entire logic is dependent on variable 'flag' which can change
			boolean flag = true;
			if(flag)
			{
				System.out.println("Hello");
			}
			else 
			{
				System.out.println("Bye");
			}
			
		// nested if
			int marks = 65;
			if(marks<=100)
			{
				System.out.println("Hi Student");
				if(marks>=90)
				{
					System.out.println("Grade A");
					if(marks>=95)
					{
						System.out.println("Eligibile for Scholorship");
					}
				}
				else if(marks >=70)
				{
					System.out.println("Grade B");
				}
				else if(marks>=40)
				{
					System.out.println("Grade C");
				}
			}
			else 
			{
				System.out.println("Poor marks..");
			}
		
		
			
		// if - else if
			int number =25;
			if(number <=10)
			{
				System.out.println("Hi");
			}
			else if(number <=20)
			{
				System.out.println("Hello");
			}
			else 
			{
				System.out.println("bye");
			}
			
			
			String name = "Ram";
			if(name.equals("Tom"))
			{
				System.out.println("Hi Tom");
			}
			else if(name.equals("Ram"))
			{
				System.out.println("Hi Ram");
			}
			else if(name.equals("Ravi"))
			{
				System.out.println("Hi Ravi");
			}
			else
			{
				System.out.println("No Match");
			}
			
			//eventhough one condition is matched, it will still check all 
			// if conditions 
			String name1="Tom";
			if(name1.equals("Tom"))
			{
				System.out.println("Hi Tom");
			}
			
			if(name1.equals("Ravi"))
			{
				System.out.println("Hi Ravi");
			}
			else 
			{
				System.out.println("Student is not found");
			}
	}

}
