package OOPs_Inheritance;

/*
 new BMW(); //no reference object
 Every BMW is also a car, hence the BMW class object can be referred by 
 parent class reference variable.
 
 Reference type check -> if the reference variable pointing to the same class object, then
 it has access to all the methods.
 
 java will create a security layer for that individual methods,so that it cannot
 be accessed by other class referene variable pointing to another class object
 
 But if the object reference is pointing to different class object, then it has access to only
 reference type class and not the object class.
 
 BMW has done lot of effort to develop autoParking method, hence cannot be
 given access to other type of classes like car.
 
 
 At compile time there is no error. At runtime we get classCastException.
 
 BMW b1 = (BMW) new Car(); // every car is not BMW, giving type mismatch to avoid that, saying this is of type BMW

		b1.start(); //Exception in thread "main" java.lang.ClassCastException: class OOPs_Inheritance.Car cannot be cast to class OOPs_Inheritance.BMW (OOPs_Inheritance.Car and OOPs_Inheritance.BMW are in unnamed module of loader 'app')
	    //at OOPs_Inheritance.TestCar.main(TestCar.java:48)


Diamond problem --> multiple inheritance is not allowed. it creates confusion with common methods and variables
when called in child class.

Sibling class methods cannot accessed though having same parent.

Method hiding:-
--------------
Static method cannot be overridden from parent to child. But can have the same method name as an individual method in child class
this is called method hiding.

 
Cannot override a private method defined inside the parent class. 

cannot override a final method.


 */
public class TestCar {

	public static void main(String[] args) {

		BMW b = new BMW();
		b.start(); //BMW--start  Overridden method
		b.stop();  //Car--stop   Inherited method
		b.refuel();  //Car--refuel  Inherited method
		b.autoParking(); //BMW--autoParking Individual method
		b.engine(); //Vehicle -- engine inherited
		b.fuelReading(); //BMW -- fuel reading overridden
		BMW.getPrice(); //BMW -- get price, if comment the BMW static method, then can access/inherit the static method from parent.
		Car.getPrice(); //Car -- get price
		b.billing(); //car -- billing  final method
		b.breakingSystem(); //Car - Break Mechanism
		
		
		Car c = new Car();
		c.start(); // Car--start
		c.stop();  // Car--stop
		c.refuel(); // Car--refuel.
		c.engine(); //Vehicle -- engine
		c.fuelReading(); // car -- fuel reading
		c.breakingSystem(); //Car - Break Mechanism
		c.wheelBalance(); //Car -- Wheel balance 
		c.speedLaw(); //speed law (Science)
		c.breakingSystem(); //break  details (Physics)
		
		
		
		//Top-casting or upcasting:
		//new BMW(); //no reference object
		// child class object can be referred by parent class reference variable
		//individual methods of child class is not allowed to be accessed by parent class object reference
		Car c1 = new BMW(); //every bmw is a car
		c1.start(); //BMW--start
		c1.stop();  //Car--stop
		c1.refuel(); //Car--refuel
		
		
		Car c2 = new Audi();
		
		//Down casting
		//parent class object is referred by child class ref variable?
		//BMW b1 = (BMW) new Car(); // every car is not BMW, giving type mismatch to avoid that, saying this is of type BMW
		//b1.start(); //Exception in thread "main" java.lang.ClassCastException: class OOPs_Inheritance.Car cannot be cast to class OOPs_Inheritance.BMW (OOPs_Inheritance.Car and OOPs_Inheritance.BMW are in unnamed module of loader 'app')
	    //at OOPs_Inheritance.TestCar.main(TestCar.java:48)

		//child class object can be referred by grand parent class ref variable
		Vehicle v1 = new BMW();
		v1.engine();
		
		//sibling to sibling casting is not possible even with forceful casting.
		//Audi a1 = new BMW(); //cannot convert from BMW to audi
		
		Science s = new Car();
		s.speedLaw(); //(Science)
	
		Physics p = new Car();
		p.breakingSystem(); //(Physics)
		p.speedLaw();
		
		Mechanical m = new Car();
		m.speedLaw();
		m.breakingSystem();
		m.wheelBalance();
	
		
		AutoMobile a = new Car();
		a.breakingSystem();
		a.speedLaw();
		a.wheelBalance(); //mechanical class
		a.clutchSystem(); //individual method of AutoMobile class
		
	}

}
