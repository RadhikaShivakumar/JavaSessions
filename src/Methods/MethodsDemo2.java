package Methods;

/*
 Functions cannot be created inside a function(main method)
 Functions should be independent to each other
 
 Function -> A block of statements(piece of code) which can be used over and over again.
 it will perform some business logic, call it n number of times and get the result.
 */

// 1. no input and no return:
// void - does not return anything.
//return type: void
public class MethodsDemo2 {
	
	public void test()
	{
		System.out.println("Test method with no input and no return");
	}
	
	public void sum()
	{
		System.out.println("Testing method...");
		int a =10;
		int b=20;
		int c=30;
		int sum=a+b+c;
		System.out.println(sum);
	}
	
	//2.  no input but some return:
	// return type: int
	public int getMarks()
	{
		System.out.println("Get marks...");
		int marks=100;
		int bonus=50;
		int totalMarks=marks+bonus;
		return totalMarks;
	}
	
	public String getName()
	{
		System.out.println("Get name..");
		String name="Tom";
		return name;
	}
	
	public char getChar()
	{
		System.out.println("Get the char value..");
		char c = 'a';
		return c;
		
	}

	//3. Some input and some return
	// return type:int
	// parameters : a,b
	
	public int sum(int a,int b)
	{
		System.out.println("Sum method...");
		int sum = a+b;
		return sum;
	}
	
	//WAF(Write a function) : ---> getStudentMarks
	//input parameters: Student name(String)
	//return: marks of the student(int)
	// Always start with void and later change the return type accordingly.
	
	public int getStudentMarks(String studentName)
	{
		System.out.println("Geting marks of student name:" +studentName );
		if(studentName.equals("Vani"))
		{
			return 90;
		} 
		else if(studentName.equals("Garima"))
		{
			return 95;
		}
		else
		{
			System.out.println("Wrong Student name ");
			return -1;
		}
	}
	
	public static void main(String[] args) {
		
		MethodsDemo2 md = new MethodsDemo2();
		md.test();
		md.sum();
		//System.out.println(md.getMarks());
		int marks = md.getMarks(); //Good way to store in a separate variable
		System.out.println(marks-20);
	
		String name = md.getName();
		System.out.println(name);
	
		char c = md.getChar();
		System.out.println((int)c); //Ascii value of a
		
		int sum = md.sum(10, 20);
		System.out.println(sum);
		
		int mk = md.getStudentMarks("Vani");
		System.out.println(mk);
	}

}
