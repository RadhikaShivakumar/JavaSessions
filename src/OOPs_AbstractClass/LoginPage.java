package OOPs_AbstractClass;

public class LoginPage extends Page {

	public LoginPage()
	{
		System.out.println("LoginPage constructor");
	}
	
	public LoginPage(int a)
	{
		System.out.println("LoginPage constructor" +a );
	}
	@Override
	public void title() {
		System.out.println("Title of the Page: Amazon Login");
    }

	@Override
	public void header() {
		System.out.println("Amazon login header");
	}

	@Override
	public void url() {
		System.out.println("https://www.amazon.com");
	}
	
	@Override
	public void pageTimeOut() 	{
		System.out.println("Page time out -- 10 secs");
	}

	
	public void doLogin(String un,String pwd)
	{
		System.out.println("login with :" + un+" :"+pwd);
	}
	
	public void forgotPwd()
	{
		System.out.println("Forgot password");
	}
}
