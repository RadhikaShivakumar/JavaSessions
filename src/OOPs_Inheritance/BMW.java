package OOPs_Inheritance;

/*
 Method Overriding: (poly+morphism -[RunTime or Dynamic])
 when you have a method in parent class as well as in child class with:
 1. Same name
 2. same number of parameters
 3. same type of parameters
 4. same parameter sequence
 5. same return type
 
 Practical uses:
 ==============
 Parent class gives flexibility to child class.
 
 */
public class BMW extends Car {

//	@Override
//	public void start() 	{
//		System.out.println("BMW--start");
//	}
	
	
	public void autoParking() {
		System.out.println("BMW--autoParking");
	}
	
	@Override
	public void fuelReading() {
		System.out.println("BMW -- fuel reading");
	}
	
	//Method hiding.
	public static void getPrice() {
		System.out.println("BMW -- get price");
	}
	

}
