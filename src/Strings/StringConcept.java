package Strings;

/*
 String - Non-Primitive Data type:
 
 Here String is a class
 
 */
public class StringConcept {

	public static void main(String[] args) {
		String s = "Hello World";
		System.out.println(s);
		
		String s1 = "Hi this is my java code and Im so happy";
		System.out.println(s1);
		
		//String concatenation, add two strings together
		System.out.println(s+" " +s1);
		
		int a = 100;
		int b = 200;
		String x = "Hello";
		String y = "Selenium";
		System.out.println(a+b); //300
		System.out.println(x+y); //HelloSelenium
		System.out.println(a+b+x+y); //300HelloSelenium
		System.out.println(x+y+a+b);//HelloSelenium100200
		System.out.println(x+y+(a+b)); //HelloSelenium300
		System.out.println(a+b+x+y+a+b);//300HelloSelenium100200
		System.out.println(a+b+x+y+(a+b)); //300HelloSelenium300
		System.out.println("the value of a is: "+a); //the value of a is: 100
		
		System.out.println("the value of b is: " + b); ////the value of b:200
		System.out.println("the sum is: "+(a+b));//the sum is: 300
		
		double c = 12.33;
		double d = 12.44;
		System.out.println(x+y+c+d); //HelloSelenium12.3312.44
		System.out.println(a+b+c+d+x+y); //324.77HelloSelenium
		System.out.println(c+d+x+y+a+b); //24.77HelloSelenium100200
		System.out.println(a+""+b+x+y);//100200HelloSelenium
		
		char p ='a'; //97
		char q='b'; //98
		System.out.println(x+y+p+q); //HelloSeleniumty
		System.out.println(p+q+x+y); //195HelloSelenium
		
		char g = 'a';
		String h = "a";
		System.out.println(g+h); //aa
		
		System.out.println("hi Radhika here"); //hi Radhika here
		System.out.println(1000+20); //1020
		System.out.println('a'); //a
		System.out.println((int)a); //97, ASCII value of a
		System.out.println("1000"+20); //100020
		
		System.out.println(9/3); //3
		System.out.println(9/2); //4 and not 4.5, as the 0.5 is ignored as both operands are integers
		System.out.println(9/2.0); //4.5 this is because one of the operand is decimal
		System.out.println(9.0/2); //4.5
		System.out.println(9.0/2.0); //4.5
		//Exception in thread "main" java.lang.ArithmeticException: / by zero
		//at Strings.StringConcept.main(StringConcept.java:64)
		//System.out.println(9/0);
		
		System.out.println(0/9); //0
		System.out.println(9.0/0); //Infinity, when operand is decimal, this is the way java is designed
		
		System.out.println(9.0/0.0); //Infinity
		//Exception in thread "main" java.lang.ArithmeticException: / by zero
//		at Strings.StringConcept.main(StringConcept.java:72)

		//System.out.println(0/0); any number divide by zero.
		
		//(Interview)
		System.out.println(0.0/0.0); //NaN(not a number)
		
		System.out.println(0.0/0); //NaN(not a number)
		
		System.out.println(0/0.0);//NaN
		
		System.out.println(8 % 2); //0
		System.out.println(9%2); //1
		
		
	}

}
