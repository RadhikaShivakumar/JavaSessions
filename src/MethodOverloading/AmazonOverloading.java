package MethodOverloading;

public class AmazonOverloading {

	//Amazon login
	public void doLogin()
	{
		
	}
	public void doLogin(String un, String pwd)
	{
	}
	
	public void doLogin(String un, String pwd,String role)
	{
		
	}
	
	public void doLogin(String un, String pwd, String ph,int otp)
	{
		
	}
	
	//Search feature
	public void doSearch()
	{
	}
	
	public void doSearch(String productName,String brandName)
	{
		
	}
	
	public void doSearch(String productName,String brandName,String color)
	{
		
	}
	
	public void doSearch(String productName,String brandName,String color,int price)
	{
		
	}
	
	//payment
	public void makePayment(String cc, int cvv)
	{
		
	}
	
	public void makePayment(String cc, int cvv,int otp)
	{
		
	}
	
	public void makePayment(String cc, String pwd)
	{
		
	}
	
	public void makePayment(String upi)
	{
		
	}
	
	public static void main(String[] args) {
	
		AmazonOverloading ao = new AmazonOverloading();
		ao.doSearch("T-shirt", "Polo");

	}

}
