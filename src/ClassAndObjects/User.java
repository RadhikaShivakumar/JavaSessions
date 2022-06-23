package ClassAndObjects;

/*
 one object can have multiple references.
 Here u1, u3 pointing to same object.
 
 */
public class User {

	String name;
	int age;
	String city;
	

	
	public static void main(String[] args)
	{
	

		User u1 = new User();
		u1.name="Garima";
		u1.age=25;
		u1.city="Pune";
		
		User u2 = new User();
		u2.name="Swapna";
		u2.age=34;
		u2.city="Bangalore";
		
		User u3 = new User();
		u3.name="Prashant";
		u3.age = 45;
		u3.city="LA";
		
		User u4 = new User();
		
		System.out.println(u1.name+" "+ u1.age+" "+ u1.city);
		System.out.println(u2.name+" "+ u2.age+" "+ u2.city);
		System.out.println(u3.name+" "+ u3.age+" "+ u3.city);
		
		/*
		Garima 25 Pune
		Swapna 34 Bangalore
		Prashant 45 LA
		 */
		u2 = u1;  // u2 will point to u1, hence same output as u1
		
		System.out.println(u1.name+" "+ u1.age+" "+ u1.city);
		System.out.println(u2.name+" "+ u2.age+" "+ u2.city);
		System.out.println(u3.name+" "+ u3.age+" "+ u3.city);
		
		/*
		Garima 25 Pune
		Garima 25 Pune
		Prashant 45 LA

		 */
		u1=u3; //u1 points to u3
		
		System.out.println(u1.name+" "+ u1.age+" "+ u1.city);
		System.out.println(u2.name+" "+ u2.age+" "+ u2.city);
		System.out.println(u3.name+" "+ u3.age+" "+ u3.city);
		
		/*
		Prashant 45 LA
		Garima 25 Pune
		Prashant 45 LA
		 */

		u3=u2; //u1 points to u3
		
		System.out.println(u1.name+" "+ u1.age+" "+ u1.city);
		System.out.println(u2.name+" "+ u2.age+" "+ u2.city);
		System.out.println(u3.name+" "+ u3.age+" "+ u3.city);
		
		/*
		 Prashant 45 LA
		Garima 25 Pune
		Garima 25 Pune
		 */
		
		u1=u4;
		System.out.println(u1.name+" "+ u1.age+" "+ u1.city);
		System.out.println(u2.name+" "+ u2.age+" "+ u2.city);
		System.out.println(u3.name+" "+ u3.age+" "+ u3.city);
		System.out.println(u4.name+" "+ u4.age+" "+ u4.city);
		
		/*
		 null 0 null
		Garima 25 Pune
		Garima 25 Pune
		null 0 null
		 */
	}


}
