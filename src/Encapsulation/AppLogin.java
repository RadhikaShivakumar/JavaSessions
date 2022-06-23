package Encapsulation;

public class AppLogin {

	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public void doLogin(String un,String pwd)
	{
		System.out.println("username: "+un);
		System.out.println("password: "+pwd);
		System.out.println("user is logged in");

	}
	
	
}
