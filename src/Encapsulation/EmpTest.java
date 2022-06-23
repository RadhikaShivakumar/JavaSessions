package Encapsulation;

public class EmpTest {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setName("Ashish");
		e.setAge(30);
		e.setCity("LA");
		String eName=e.getName(); //Ashih
		System.out.println(eName);
		
		String s=e.getEmpData();
		System.out.println(s); //Ashish 30 LA
		
	}

}
