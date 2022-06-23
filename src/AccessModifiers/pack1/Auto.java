package AccessModifiers.pack1;

/*
 Default cannot be accessed from the non-child class of different package
 
 */
import AccessModifiers.Car;

public class Auto {

	public static void main(String[] args) {

		Car c = new Car();
		c.name = "Auto";
		
	}

}
