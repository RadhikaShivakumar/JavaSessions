package StringConcept;

import java.util.Arrays;

/*
 We cannot have negative index. String is also like character array internally.
 
 cannot go below zero and above highest index, results in StringIndexOutOfBoundsException
 
 
 Strings are stored in string constant pool inside the heap memory after JDK 1.7, before that it was a separate memory.
 
 
 Heap and stack memory
 
 
 Inside the string constant pool we cannot have duplicate values.
 but objects can have duplicate values in heap memory. This is applicable 
 only for Strings and not for any other data types because it is the most commonly used string.
 for better memory optimization.
 
 
 String literal will always go to SCP.
 
 equals method checks content of the string.
 == --> checks based on the memory location
 
we  always use string literals to create strings. Because if we use String object to create strings, it will
create 2 objects one in heap and one in SCP. hence memory usage is more. hence we avoid that for better memory management.

Where as string literals create one object in SCP.



Strings are immutable, i.e string value cannot be changed, but
will create a new variable.

 */
public class StringManipulations {

	public static void main(String[] args) {

		String s ="Hi this is my java code";
		
		System.out.println("Length of the String: " +s.length());
		
		int len = s.length();
		int highestIndex = len-1;
		int lowestIndex = 0;
		
		System.out.println("LI= "+lowestIndex); //0
		System.out.println("HI= "+highestIndex);//22

		System.out.println(s.charAt(5)); //i
		System.out.println(s.charAt(0)); //H
		//System.out.println(s.charAt(-1)); //garbage value, StringIndexOutOfBoundsException
		System.out.println(s.charAt(22)); //e
		//System.out.println(s.charAt(23));//garbage value, StringIndexOutOfBoundsException
		
		System.out.println(s.charAt(s.length()-1)); //e
		
		//pass specific char, and get position
		
		System.out.println(s.indexOf('t')); //3
		System.out.println(s.indexOf('i')); //1, 1st occurence of i
		System.out.println(s.indexOf('i',2)); //5, 2nd occurrence of i
		System.out.println(s.indexOf('i',s.indexOf('i')+1));//5, 2nd occurence of i
	
		System.out.println("---------");
		System.out.println(s.indexOf('i',s.indexOf('i',s.indexOf('i')+1)+1)); //8, 3rd occurence of i
		System.out.println(s.indexOf("java")); //14
		System.out.println(s.indexOf("selenium")); //-1
		
		String msg = "welcome admin";
		System.out.println(msg.indexOf("admin")>0); //true
		if(msg.indexOf("admin")==-1)
		{
			System.out.println("admin user name is not displayed");
		}
		else
		{
			System.out.println("admin is present");
		}
		
		
		//trim - removes before and after space
		String s1 = "            hello java       ";
		System.out.println(s1.trim());
		
		String browser = "     chrome    ";
		if(browser.trim().equals("chrome")) {
			System.out.println("Launch chrome");
		}
		
		
		//replace
		String s2 = "      hello selenium       ";
		System.out.println(s2.replace("   ", ""));
		
		String dob = "01-01-1990";  //01/01/1990
		System.out.println(dob.replace("-", "/"));  //   01/01/1990
	
	
		//upper case and lowercase
		String sc = "hi this is test code";
		System.out.println(sc.toUpperCase()); //HI THIS IS TEST CODE
		System.out.println(sc.toLowerCase()); //hi this is test code
		
		//contains
		String st = "welcome to app testing world";
		System.out.println(st.contains("testing")); //true
	
		String url = "https://www.amazon.com?search=macbook";
		System.out.println(url.contains("macbook"));
		if(url.contains("search=macbook"))
		{
			System.out.println("correct url");
		}
	
		//equals:
		String st1="Hello Selenium";
		String st2="Hello selenium ";
		
		System.out.println(st1.equals(st2));//false
		System.out.println(st2.trim().equalsIgnoreCase(st1)); //true
		
		//String literals
		String t1 = "hello testing"; // here t1 and t2 are pointing to same value.
		String t2 = "hello testing";
		String t3 = "hello Testing";
	//	t1 = "java";
		
		
		//String heap objects
		String t4 = new String("hello java"); // 2 objects creaated (heap + scp)
		String t5 = new String("hello java"); // 1 object in heap
		
		String t6 = "hello java"; // 0 objects as it is already present in string constant pool(scp)
		
		System.out.println(t1.equals(t2)); //true, checks contents of the string.
		System.out.println(t1==t2); //true
	
		System.out.println(t4==t5); // false, here comparison works based on the memory address. they are different hence false
		
		System.out.println(t4==t6); //false
		System.out.println(t4.equals(t6)); //true
		
		String t7 ="hello java"; //0 objects created.
		String t8 = "Hello java"; //1 object created in SCP.
	
		//substring:
		String message = "your transaction id is 12345";
		System.out.println(message.substring(7)); //ansaction id is 12345  from 7th index onwards till the length of the string
		
		System.out.println(message.subSequence(23, message.length())); //12345  (23,30] here 23 included but 30 excluded.
		System.out.println(message.subSequence(message.indexOf("is")+3, message.length())); //12345
		
		//split
		String data = "java_python_Ruby_JavaScript";
		
		String dataVal[] =data.split("_");
		System.out.println(dataVal.length); //4
		System.out.println(dataVal[0]); //java
		System.out.println(Arrays.toString(dataVal)); //[java, python, Ruby, JavaScript]
		
		String pop= "xXTestingxxXSeleniumXXxXAutomationxXJavaX";
		String p[] = pop.split("xX");
		System.out.println(p[0].length()); //empty
		System.out.println(Arrays.toString(p)); //[, Testingx, SeleniumXX, Automation, JavaX]
		
		System.out.println(p[1]);
		System.out.println(p[2]);
		System.out.println(p[3]);
		System.out.println(p[4]);
		//System.out.println(p[5]); outofbound exception
		
		String sr = "testing";
		System.out.println(sr+"automation"); //testingautomation, this is pointed by no object reference
		System.out.println(sr); //testing 
		
		
		sr = sr+"automation";
		System.out.println(sr); //testingautomation
		String si="testing";
		System.out.println(si);
		
		
		String empData = "Naveen;testing;bangalore;naveen@gmail.com;9090909090;India";
		//Here we are splitting multiple times not a good practice. split once and store it in the string array.
//		System.out.println(empData.split(";")[0]); //Naveen
//		System.out.println(empData.split(";")[1]); //testing
		
		System.out.println("---------------------------");
		String emp[] = empData.split(";");
		
		for(String e: emp) {
			System.out.println(e);
		}
		
		
		//Assignment:
		// print it in the reverse order empData:  India 9090909090 naveen@gmail.com bangalore testing Naveen
		String reverseString = "";
		for(int i=emp.length-1;i>=0;i--)
		{
			String word = emp[i];
			reverseString += word+" ";
		}
		System.out.println(reverseString); //India 9090909090 naveen@gmail.com bangalore testing Naveen 

		
		
	}

}
