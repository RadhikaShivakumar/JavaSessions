package AccessModifiers;

/*
  should not use default keyword in normal class. should be 
  used inside the Interface.
  
 */
public class Car {

	
	public String name;
	private int price;
	protected String color;
	int plateNumber; 
	
	
	public static void main(String[] args) {

		Car c = new Car();
		c.name="sfd";
		c.color = "balck";
		c.price = 100;
	}

}
