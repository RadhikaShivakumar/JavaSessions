package ClassAndObjects;

/*
 one object can have multiple references.
 Here u1, u3 pointing to same object.
 
 */
public class User2 {

	String name;
	int age;
	String city;
	

	
	public static void main(String[] args)
	{
	

		User2 u1 = new User2();
		u1.name="Garima";
		u1.age=25;
		u1.city="Pune";
		
		User2 u2 = new User2();
		u2.name="Swapna";
		u2.age=34;
		u2.city="Bangalore";
		
		User2 u3 = new User2();
		u3.name="Prashant";
		u3.age = 45;
		u3.city="LA";
		
		User2 u4 = new User2();
		u4.name="john";
		u4.age=44;
		u4.city="Newyork";
		
		System.out.println(u1.name+" "+ u1.age+" "+ u1.city);
		System.out.println(u2.name+" "+ u2.age+" "+ u2.city);
		System.out.println(u3.name+" "+ u3.age+" "+ u3.city);
		System.out.println(u4.name+" "+ u4.age+" "+ u4.city);
		/*
		Garima 25 Pune
		Swapna 34 Bangalore
		Prashant 45 LA
		john 44 Newyork
		 */
		u1 = u2;  // u2 will point to u1, hence same output as u1
		
		System.out.println(u1.name+" "+ u1.age+" "+ u1.city);
		System.out.println(u2.name+" "+ u2.age+" "+ u2.city);
		System.out.println(u3.name+" "+ u3.age+" "+ u3.city);
		System.out.println(u4.name+" "+ u4.age+" "+ u4.city);
		/*
		Swapna 34 Bangalore
		Swapna 34 Bangalore
		Prashant 45 LA
		john 44 Newyork

		 */
		u2=u3; //u1 points to u3
		
		System.out.println(u1.name+" "+ u1.age+" "+ u1.city);
		System.out.println(u2.name+" "+ u2.age+" "+ u2.city);
		System.out.println(u3.name+" "+ u3.age+" "+ u3.city);
		System.out.println(u4.name+" "+ u4.age+" "+ u4.city);
	
		/*
		Swapna 34 Bangalore
		Prashant 45 LA
		Prashant 45 LA
		john 44 Newyork

		 */

		u3=u4; //u1 points to u3
		
		System.out.println(u1.name+" "+ u1.age+" "+ u1.city);
		System.out.println(u2.name+" "+ u2.age+" "+ u2.city);
		System.out.println(u3.name+" "+ u3.age+" "+ u3.city);
		System.out.println(u4.name+" "+ u4.age+" "+ u4.city);
		/*
		Swapna 34 Bangalore
		Prashant 45 LA
		john 44 Newyork
		john 44 Newyork


		 */
		
		
		  u4=u1; 
		  System.out.println(u1.name+" "+ u1.age+" "+ u1.city);
		  System.out.println(u2.name+" "+ u2.age+" "+ u2.city);
		  System.out.println(u3.name+" "+ u3.age+" "+ u3.city);
		  System.out.println(u4.name+" "+ u4.age+" "+ u4.city);
		
		
		 /*
       Swapna 34 Bangalore
		Prashant 45 LA
		john 44 Newyork
		Swapna 34 Bangalore

		 */
	}


}
