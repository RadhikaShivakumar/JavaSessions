package Encapsulation;

//pojo: plain old java object  ---> class where private variables,const.., public getters and setters
//POM: page classes: encapsulation
public class Customer {

	private String name;
	private int age;
	private boolean isActive;
	
	public Customer(String name, int age, boolean isActive) {
		
		this.name = name;
		this.age = age;
		this.isActive = isActive;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
}
