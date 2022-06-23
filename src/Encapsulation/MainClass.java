package Encapsulation;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {

		User u1=new User();
		u1.name="Ram";
		u1.age=43;
		
		u1.setSalary(44.50);
		ArrayList<String> devList= new ArrayList<String>();
		devList.add("macbook pro");
		devList.add("iphone 12");
		u1.setDeviceList(devList);
		
		System.out.println(u1.name+" "+u1.age+" "+u1.getSalary()+" "+u1.getDeviceList());

		//App login
		AppLogin app=new AppLogin();
		app.setUsername("rad@gmail.com");
		app.setPassword("admin");
		
		//application getting username and pwd
		app.doLogin(app.getUsername(),app.getPassword());
	
		AppLogin app1=new AppLogin();
		app1.setUsername("tom@gmail.com");
		app1.setPassword("admin");
		app1.doLogin(app1.getUsername(),app1.getPassword());

		
		//browser class
		
		BrowserClass br= new BrowserClass();
		br.launchChrome();
		
	    //customer: POST(RestAPI)
		// constructor : helps to initialize variables for the first time
		Customer cus = new Customer("Ram",22,true); //is this encapsulation? yes,assigning values through constructors
		
		//GET(to get the data using getters)
		System.out.println(cus.getName()+" "+cus.getAge()+" "+cus.isActive());
		
		//PUT
		// to update some data,for existing user,setters will be useful
		cus.setName("das");
		cus.setAge(56);
		
		System.out.println(cus.getName()+" "+cus.getAge()+" "+cus.isActive());

		cus.setActive(false);
		System.out.println(cus.getName()+" "+cus.getAge()+" "+cus.isActive());

	
	}

}
