package Loops;

/*
 In for loop: 
 1. First i value initialized to 1
 2. check for condition i<=10
 3. execute statements
 4. increment the value of i
 
 keep repeating, until condition is false then exit the loop.
 
	for(int i=1;i<=10;i++)
	{
		System.out.println(i);
	}
		
if remove i++, it generate a infinite loop, printing 1 on the console
 */
public class ForLoop {

	public static void main(String[] args) {

		//1. print 1..10
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		
		//2. 
		
		//different ways for loop can be written
		int j=1;
		for(;j<=10;)
		{
			System.out.println(j);
			j++;
		}
		
		
		for(int k=1;k<=10;)
		{
			System.out.println(k);
			k++;
		}
		
		System.out.println("print 10 to 1");
		//print 10 to 1
		for(int l=10;l>=1;l--)
		{
			System.out.println(l);
		}
		
		// (intv) prints Bye!! in a infinite loop
//		for(;;)
//		{
//			System.out.println("Bye!!");
//		}
//		for(;true;)
//		{
//			System.out.println("Bye!!");
//		}
		
//		for(;false;)   >>> unreachable code.
//		{
//			System.out.println("Bye!!");
//		}

		System.out.println("------");
		for(byte b=1; b<=5;b++)
		{
			System.out.println(b); //1,2,3,4,5
		}
		
		System.out.println("-----");
		for(double d=1.0;d<10.0;d++)
		{
			System.out.println(d); //1.0,2.0,3.0,4.0..10.0
		}
		
		System.out.println("-----------");
		for(char c='a'; c<='z';c++)
		{
			System.out.println(c); //a,b,c...z
		}
		
		System.out.println("-----------");
		for(char c='a'; c<='z';c++)
		{
			System.out.println(c+ " : "+ (int)c); // Ascii value
		}
		
		System.out.println("-----------");
		for(char c='A'; c<='Z';c++)
		{
			System.out.println(c+ " : "+ (int)c); // Ascii value
		}
		
		
	}

}
