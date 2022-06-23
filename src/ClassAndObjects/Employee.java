package ClassAndObjects;
/*
  Class is a template
  BMW from car category(Blue print)
  Horse from Animal category
  
  laptop -from Electronics category
  laptop color,ram,ssd etc are attributes
  
  Employee -> can create n number of Employees
  but each employee will have his name,job title,salary etc.
  
  object can have no reference variable.
  
  when we create object of the class, it will create photocopy of the class variables,methods and assigns to the object created.
  
  Never declare the class variable its a bad practice.
  
  JVM keep checking the memory usage,if feel it is over used then garbage collector
  will destroy all those objects which are having no reference or null reference object. -> called deallocation of memory
  
  
  Memory is divided into   Heap and Stack.
  Heap -> Objects are stored here
  Stack -> Here the reference variable gets stored.
  
  what if we have valid objects with reference variables but running out of memory then garbage collector cannot do
  anything with this.
  
  This is something related to hardware with better machine,infracture.
  
  HeapDump -> will tell you statistics of how many objects created,memory usage etc.
  
  
  
 */

public class Employee {

	String name;  //class variables
	int age;
	double salary;
	boolean isPermanent;
	
	public static void main(String[] args)
	{
		
		String name = "Naveen"; //Local variable -> created inside the method.
		
		//To create an object of the class, use new keyword
		
		Employee e1 = new Employee();  //e1 is the object reference variable.type of e1 is Employee(non-primitive) class
		
		e1.name="Tom";
		e1.age=20;
		e1.salary=12.35;
		e1.isPermanent=true;
		
		System.out.println(e1.name+" "+e1.age+" "+e1.salary+" "+e1.isPermanent); //e1.name=Tom
		
		//can we create more objects -> yes we can create n number of objects,but reference variable has to be different
		// in side memory,one more object created and is referred by e2. one more photocopy of variables,methods given to e2
		// Need not fill in all the class variable values.
		Employee e2 = new Employee(); 
		e2.name="Peter";
		e2.isPermanent=false;
		System.out.println(e2.name+" "+e2.age+" "+e2.salary+" "+e2.isPermanent); //default values of those data types.
		//null 0 0.0 false
		
		//object without reference - is possible
		new Employee(); //no one is referring to this object but gets photocopy of class variables and methods
		// not a good practice.
		
		//With the below approach unnecessarily we are creating many objects without reference.
		new Employee().name="Rina";  //the value of name = null and not Rina  
		new Employee().age=25; //the value of age is zero and not 25
		
		//Java will destroy these above objects by use of garbage collector
		
		
		//null reference type object:
		Employee e3 = new Employee();
		e3=null; // e3 is earthing which means it is pointing to null.
		e3.name="Lisa"; //warning: null pointer access, e3 is nothing it is null,through which we cannot access any variable.
		System.out.println(e3.name); //NullPointerException
		/*
		 Exception in thread "main" java.lang.NullPointerException: Cannot assign field "name" because "e3" is null
	at ClassAndObjects.Employee.main(Employee.java:67)

		 */
		
		
		

	}

}
