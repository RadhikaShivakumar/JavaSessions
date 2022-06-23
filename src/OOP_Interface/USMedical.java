package OOP_Interface;

/*
 Interface -> Cannot have method body
 1. Only method declaration: method prototype, no business logic.
    These are called abstract method.(not mandatory to write abstract keyword)
    By default methods are abstract
 
 2. cannot create the object of Interface
 
 3. With update of Interface like add a new method, delete an existing
 	method, then child class should change accordingly.
 
 4. (Intv) Though multiple interfaces have the same method, class has to override
    that common method only once.
    
    With the Hospital example, patients go to Hospital and not to the USMedical
    institution(only to set rules and regulations)
    
    Hence classes should implement business logic
    
 5. Why cannot create an object of Interface ?
    cannot instantiate the interface
    
    //Top casting:
    child class object can be referred by parent interface reference variable
    
 6. Interface variables are final and static in nature by default.
    (No need to specify final and static keyword while defning the variable)
    
 7. static abstract methods cannot be overridden, hence it was not allowed
 
 	//After jdk 1.8 two major changes:
 	 1. can have static methods with method body in Interface
 	public static void billing()
	{
		System.out.println("US -- billing");
	}
	
	2. can have one non-static default method with method body
		in some cases, interfaces need to take decisions and hence allowed
		default methods(default is a special keyword specifically meant to Interface)
	
 8. Interface cannot have a parent class, but can have parent interface.
 
 	 Class -class -> extends
 	 Class -- interface ->
 
 
 9. Interface can have only non-abstract methods, only abstract methods.
 	But interfaces are used for abstraction hence will have abstract methods.
 */
public interface USMedical extends WHO{

	int min_fee=10;
	
	public void physioServices();

	//overload the method in interface 
	public String physioServices(int a);
	
	public void cardioServices();

	public void ENTServices();

	public void emergencyServices();
	
	// 	 1. can have static methods with method body in Interface
	public static void billing()
	{
		System.out.println("US -- billing");
	}
	
	//2. can have one non-static default method with method body
	// can we override this method in child class-- yes we can
	public default void medicalHistory()
	{
		System.out.println("US -- MedicalHistory");

	}
	
	
}
