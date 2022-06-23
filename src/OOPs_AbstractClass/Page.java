package OOPs_AbstractClass;

/*
 Abstract Class: class having abstract methods and non-abstract methods, partial abstraction

 we can have only abstract methods. Hence we can create 100% abstraction
 
 We can have only non-abstract methods -> 0% abstraction
 Abstract method - method with no body and abstract keyword.
 
 Final -> to prevent method overriding.
 
 
 cannot create object of Abstract class like Interface
 
 we can create the constructor of abstract classes. It will be
 called when you create the object of child class.
 When have child class constructor as well, then it will call parent class
 constructor and then the child class constructor.
 
 Preference -> Parent and then child class for constructor execution.
 
 Even have parameterized constructor, default will be called.
 
 When to use abstract class:
 ===========================
 when we have common system, eg: webPage development
 where for every class, we have login page,myaccount page, search page, they can override some methods
 but can keep some methods like footer,pageTimeouts,ColorSchemes across all pages.
 
 
 When to use Interface:
 =======================
 It cannot implement business logic.
 when we have multiple systems and talking to each other,then use interface
 
 like USMedical and FortisHospital
 
 */
public abstract class Page {

	public Page()
	{
		System.out.println("Page Class Constructor.....");
	}
	
	public Page(int a)
	{
		System.out.println("Page Class Constructor....."+a);
	}
	
	public abstract void title();
	public abstract void header();
	public abstract void url();
	

	public void pageTimeOut() {
		System.out.println("Page time out -- 20 secs");
	}
	
	public void footer() {
		System.out.println("Page footer");
	}
	
	public final void logo() {
		System.out.println("app Logo");
	}
	
}
