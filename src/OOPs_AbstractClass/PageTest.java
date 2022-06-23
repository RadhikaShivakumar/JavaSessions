package OOPs_AbstractClass;

public class PageTest {

	public static void main(String[] args) {

		LoginPage lp = new LoginPage(10);
		lp.header(); //Amazon login header
		lp.title(); //Title of the Page: Amazon Login
		lp.url(); //https://www.amazon.com
		lp.pageTimeOut();
		lp.doLogin("admin", "test123");
		lp.forgotPwd();
		
		lp.footer();  //Inherited method
		lp.logo();  //Inherited method
		
		//Top-casting: can access all page class methods[i.e.
		//inherited and overridden methods.
		
		//while accssing the individual method, reference type check will fail
		// hence we cannot access doLogin and forgotPwd() method
		Page p = new LoginPage(); //everytime constr. called with the instantiation of child class
		p.footer();
		p.header();
		p.logo();
		p.pageTimeOut();
		p.title();
		p.url();
		
		
		//cannot do downcasting, as every LoginPage is a Page class
		// but every page is not a LoginPage 
		
		
		
	}

}
