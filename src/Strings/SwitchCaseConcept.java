package Strings;

public class SwitchCaseConcept {

	public static void main(String[] args)
	{
		String name ="Tom";
		
		//There is a short cut to generate template  --> ctrl + space bar --> select switch statement
		switch(name)
		{
		case "Tom":
			System.out.println("10 marks");
			break;
		case "Vaibhav":
			System.out.println("20 marks");
			break;
		case "Ravi":
			System.out.println("30 marks");
			break;
		case "Peter":
			System.out.println("40 marks");
			break;
			
		default:
			System.out.println("Student name is not found");
			break;
		}
		
		
		//break is not mandatory, but it will execute all case statements.
		
		String browser = " Chrome ";
		
		switch(browser.toLowerCase().trim())
		{
		 
		case "chrome":
			System.out.println("Launch chrome");
			break;
		case "firefox":
			System.out.println("Launch firefox");
			break;
		case "safari":
			System.out.println("Launch safari");
			break;
			
		default:
			System.out.println("Pls pass the right browser" + browser);
			break;
		}
		
		// not a valid situation to write case statements to cover all 100 scenarios.
		// use a loop instead.
		int marks = 100;
		switch (marks) {
		case 100:
			System.out.println("Grade A++");
			break;
		case 90:
			System.out.println("Grade A");
			break;
		case 80:
			System.out.println("Grade B");
			break;
		default:
			System.out.println("Fail");
			break;
		}
		
		//use cases : login
		//1. Role based Access control RBAC (Admin,customer,seller,vendor,distributor)
		
		// 2. Environment for test execution: QA,dev,stage,UAT,production
		
		// case can be used only with integers, character and Strings and not double, boolean values.
		// before JDK 1.7 only integers were compatible, later to that Strings were allowed in Case
	
		char c = 'a';
		switch (c) {
		case 'a':
			System.out.println('a');
		case 'e':
			System.out.println('e');
		case 'i':
			System.out.println('i');
		case 'o':
			System.out.println('o');
		case 'u':
			System.out.println('u');

		default:
			break;
		}
		
		// short circuit operator && -> if first condition does not satisfy it will not check
		// for other conditions.
		// (x>y && x>z)
		
		// Assignment: greatest of 4 numbers:
		
		
		
		
	}

}
