package ArrayConcepts;

/*
 		//Static Array: 
		// 1. size is fixed and hence the name static array 
		// use case: where data is fixed like product categories in amazon 
		//store time and date 
		
		//limiations of Array:
		//1. size is fixed to over come this, we use dynamic array
		//2. it takes only similar types of data, to overcome this, we can use static object array or dynamic array ArrayList
	
	Array is not a continuos memory allocation as its size is already fixed, data type default value
	will be given.
 */
import java.util.Arrays;

public class StaticArrayDemo {

	public static void main(String[] args) {

		//Array: collection of similar type of data
		
		int i =10;
		i=20;
		i=30;
		
		System.out.println(i); //30, primitive data type cannot hold multiple values
		

		int arr[]=new int[5]; //declaration
		//size 20 bytes -> 4 byte for 1 integer
		// first index =0
		//length = 5
		//highest index = length-1 -> 4
		//length = highest index +1  ->5
		
		arr[0] = 10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		//arr[4]=50;
		//arr[5]=60; //AIOB
		System.out.println(arr); //[I@515f550a -> memory location
	
		//Another way to print the arrays
		System.out.println(Arrays.toString(arr)); //[10, 20, 30, 40, 0]
		
		
		System.out.println(arr[0]);
		System.out.println(arr[0]+arr[2]);
		System.out.println(arr[4]); //0
		//System.out.println(arr[5]);  AIOB index out of range -> cannot access index 5, highest index is 4
		
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
		//at ArrayConcepts.StaticArrayDemo.main(StaticArrayDemo.java:31)

		//System.out.println(arr[-1]); //AIOB, no negative indexing in java.
		
		System.out.println("Lowest index: "+ 0);
		int len = arr.length;
		System.out.println("Length of array: "+ len);
		System.out.println("Highest index:" + (len-1));
		
		//print the values of array:
		System.out.println("\nprint the values of array");
		for(int j=0;j<arr.length;j++)
		{
			System.out.println(j+ ": "+ arr[j]); //10 20 30 40 0
		}
		
		//for each loop: 'e' value is auto initialized and looped through the array by increasing value
		System.out.println("Enhanced for loop");
		int c=0;
		for(int e: arr)
		{
			System.out.println(c+":"+ e); 
			c++;  //c is for index
		}
		
		/*
		0:10
		1:20
		2:30
		3:40
		4:0
		 */
		
		//double array
		System.out.println("double Array");

		double d[] = new double[3];
		
		d[0]=11.23;
		d[1]=25.67;
		d[2]=78.55;
		
		System.out.println("------------------");
		for(double e:d)
		{
			System.out.println(e);
			if(e==25.67)
			{
				System.out.println("Bye");
				break;
			}
		}
		
		//		11.23
//		25.67
//		78.55
		
		System.out.println("------------------");
		for(int k=0;k<d.length;k++)
		{
			System.out.println(d[k]);
			if(d[k]==25.67)
			{
				System.out.println("Hi..");
				break;
				
			}
		}
		
		//Character array
		System.out.println("-------------Character Array-------");
		
		char ch[] = new char[4];
		ch[0]='a';
		ch[1]='b';
		ch[2]='c';
		ch[3]='d';
		
		for(char e: ch)
		{
			System.out.println(e); //a b c d
		}
		System.out.println(ch); //abcd inlike integer array returns memory location
		
		//String array
		System.out.println("-------String Array--------");
		
		String str[]= new String[3];
		str[0]= "Welcome";
		str[1]= "To";
		str[2]="Java";
		
		for(String e: str)
		{
			System.out.println(e); //Welcome to java
		}
		System.out.println(str); //[Ljava.lang.String;@76ccd017

		System.out.println(Arrays.toString(str)); //[Welcome, To, Java]
		
		System.out.println("-------------");
		for(int p=0; p<str.length; p++)
		{
			System.out.println(str[p]);
		}
		
		//print in reverse order
		
		System.out.println("-------------");
		System.out.println("Print array in reverse order");
		
		for(int p=str.length-1; p>=0;p--)
		{
			System.out.println(str[p]);
		}
		
		//Object Array
		System.out.println("-----------------------");
		System.out.println("Object Array");
		Object emp[] = new Object[5];
		emp[0]="Ram";
		emp[1]=25;
		emp[2]='f';
		emp[3]=34.44;
		emp[4]=true;
		
		for(Object e: emp) {
			System.out.println(e);
		}
		
		//Declaring Array using Array literals
		int num[]= {1,2,3,4,5};
		//num[5]=60;  >> still get AIOB as we cannot increase the size of array.
		System.out.println(num.length);
		
		
	}

}

