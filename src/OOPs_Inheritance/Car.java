
package OOPs_Inheritance;
/*
 Inheritance
  Sibling to sibling inheritance is not allowed.
  Grand child can inherit properties from grandParent.
  
  Multi-level inheritance is allowed
  Multiple inheritance is allowed
  
  Diamond problem ->
  Where child having multiple parents, this will inherit properties and methods
  from all parents, if some common methods and parameters are there, it will create 
  confusion for the jvm as to which method or variable to select.
  Hence it is not allowed for multiple classes.
  
  Where as multiple inheritance can be achieved with the help of interfaces
  concept in java.
  
 */
public class Car extends Vehicle {

	public final void start()
	{
		System.out.println("Car--start");
	}
	
	public void stop()
	{
		System.out.println("Car--stop");
	}
	
	public void refuel()
	{
		System.out.println("Car--refuel");
	}
	
	
	public static void getPrice() {
		System.out.println("Car -- get price");
	}
	
	private void info() 
	{
		System.out.println("Car -- info");
	}
	
	public final void billing()
	{
		System.out.println("Car -- billing");
	}
	
	@Override
	public void wheelBalance()
	{
		System.out.println("Car -- Wheel balance ");
	}
	
	@Override
	public void breakingSystem()
	{
		System.out.println("Car - Break Mechanism");
	}
}
