package Loops;

/*
 Loops - repetitive tasks to perform.
 put those tasks in multiple iteration 
 */
public class WhileLoop {

	public static void main(String[] args) {
		// print 1..10
		// below is the bad practice
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);

		System.out.println("Using While loop to print 1..10");
		int i=1;
		while(i<=10)
		{
			System.out.println(i);
			i++; //1,2,3,4,5,6,7,8,9,10
			//i = i+1;  //1,2,3,4,5,6,7,8,9,10
			//++i; ////1,2,3,4,5,6,7,8,9,10
		}
		
		//infinite loop: practically we should avoid this kind of loop.
//		while(true)
//		{
//			System.out.println("Hello!!");
//		}
		
		
		int k=1;
		while(true)
		{
			System.out.println(k); //1
			break; //break the loop and come out of while loop
		}
		
		
		System.out.println("--------------");
		k=1;
		while(k<=100)
		{
			System.out.println(k); //1
				if(k % 5==0) //break the loop and come out of while loop
				{
				System.out.println("Hi!!!");
				break;
				}
			k++;
		}
		
		
		System.out.println("-------print even numbers 1 to 100 -------");
		k=1;
		while(k<=100)
		{
			if(k % 2==0) //break the loop and come out of while loop
			{
				System.out.println(k);
			}
			k++;
		}
		
		
		System.out.println("-------print odd numbers 1 to 100 -------");
		k=1;
		while(k<=100)
		{
			if(k % 2!=0) //break the loop and come out of while loop
			{
				System.out.println(k);
			}
			k++;
		}
		
		System.out.println("----Print 10 to 1-----");
		k=10;
		while(k>=1)
		{
			System.out.println(k);
			k--;
		}
		
		//
		System.out.println("-------");
		
//		while() //Syntax error
//		{
//			
//		}
		
//		while(flase) //unreachable code
//		{
//			
//		}
		
//		boolean flag= false;  //This is allowed
//		while(flag)
//		{
//			
//		}
		
		
		boolean flag= false;
		int p=11;
		while(p<=100 && p>=10)
		{
			System.out.println(p);
			p++;
		}
		
		System.out.println("------using byte -------");
		byte b=1;
		while(b<=5)
		{
			System.out.println(b);  //1,2,3,4,5
			b++;
		}
		
		System.out.println("------using double -------");
		double d=1.0;
		while(d<=5.0)
		{
			System.out.println(d);//1.0,2.0,3.0,4.0,5.0
			d++;
		}
		
		System.out.println("------using long -------");
		double l=1.0;
		while(l<=5.0)
		{
			System.out.println(l);//1.0,2.0,3.0,4.0,5.0
			l++;
		}
		
		System.out.println("------using char -------");
		char c='a';
		while(c<='z')
		{
			System.out.println(c); //a,b,c,d,e...z
			c++;
		}
		
		System.out.println("------using char -------");
		char c1='a';
		while(c1<='z')
		{
			System.out.println(c1 +" : " +(int)c1); //Ascii value from a to z
			c1++;
		}
		
		System.out.println("------using upper case letters -------");
		char c2='A';
		while(c2<='Z')
		{
			System.out.println(c2 +" : " +(int)c2); //Ascii value from a to z
			c2++;
		}
		
	}

}
