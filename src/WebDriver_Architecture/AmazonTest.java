package WebDriver_Architecture;

/*
 Problem with the approach:
 		//ChromeDriver driver = new ChromeDriver(); //Launching google chrome
		//FirefoxDriver driver = new FirefoxDriver();
		
		SafariDriver driver = new SafariDriver();
		
we need to comment and uncomment driver instantiation line according to the requiremnt.

Solution: Top casting of WebDriver object reference to child class object.

Reference type check will fail only for individual methods of child class.

In WebDriver interface, we do not create any individual methods in child class
as per the Selenium architecture.

Advantage: the same driver object can be pointing to multiple chidl class based
on some logic.

Help in cross browser testing,parallel execution

 */
public class AmazonTest {

	static WebDriver driver;
	
	public static void main(String[] args) {
    //run tests on chromeDriver
	
		//ChromeDriver driver = new ChromeDriver(); //Launching google chrome
		//FirefoxDriver driver = new FirefoxDriver();
		//SafariDriver driver = new SafariDriver();
		

		String browser = "firefox";
		System.out.println("Browser name is: " + browser);
		
		if(browser.equalsIgnoreCase("chrome")) {
		//	WebDriver driver = new ChromeDriver(); // this is pointing to null as all the
			//non primitive datatype default value is null.
			 driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			 driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("safari")) {
			 driver = new FirefoxDriver();
		}
		else  {
			System.out.println("Pass the right browser.." + browser);
		}
		
		
		
		driver.get("https://www.abc.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getUrl();
		System.out.println(url);
		
		driver.sendKeys("emailID", "admin@gmail.com");
		driver.sendKeys("password", "admin@123");
		driver.click("LoginBtn");
		
		driver.close();
	}

}
