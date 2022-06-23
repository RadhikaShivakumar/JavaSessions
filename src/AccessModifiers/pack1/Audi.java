package AccessModifiers.pack1;

/*
 * Only public variable and methods are accessible from 
 * different package.
 * 
 * default,private, protected variables cannot be accessible from different package
 * child class or non-child class.
 */
import AccessModifiers.Car;

public class Audi extends Car{

	public static void main(String[] args) {

		Car c = new Car();
		c.name = "kin";
		
		Audi a = new Audi();
		a.color = "orange";
		a.name = "pol";
		
		
		
	}

}
