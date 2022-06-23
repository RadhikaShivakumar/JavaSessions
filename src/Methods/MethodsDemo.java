package Methods;

import java.util.ArrayList;

/*
  At a time only one value from method. cannot return two things at a time.
  physical size (capacity of ArrayList) - 0,   virtual capacity =10
  
 */
public class MethodsDemo {

	public int getStudentMarks(String studentName)
	{
		int marks=-1;
				
		if(studentName.equals("Naveen"))
		{
			marks=90;
		}
		else if(studentName.equals("Ram"))
		{
			marks= 77;
		}
		else if(studentName.equals("Kamini"))
		{
			marks=88;
		}
		else {
			System.out.println("Please provide correct Student name   " + studentName);
		}
		return marks;
		
	}
	
	//getBrowserInfo()
	//input parameter: browserName(String)
	//return: some browser information, {name,version, vendor}
	// array or arrayList
	
	public ArrayList<Object> getBrowserInfo(String browserName)
	{
		System.out.println("Getting info for browser: "+browserName);
		ArrayList<Object> browserInfoList = new ArrayList<Object>();
		
		if(browserName.trim().equalsIgnoreCase("chrome"))
		{
			browserInfoList.add("Google Chrome");
			browserInfoList.add(99.9998);
			browserInfoList.add("Google INC");
		}
		else if(browserName.trim().equalsIgnoreCase("firefox"))
		{
			browserInfoList.add("Mozilla firefox");
			browserInfoList.add(89);
			browserInfoList.add("Mozilla INC");
		}		
		else if(browserName.trim().equalsIgnoreCase("safari"))
		{
			browserInfoList.add("Apple Safari");
			browserInfoList.add(77);
			browserInfoList.add("Apple Pvt Ltd");
		}	
		else
		{
			System.out.println("\nBrowser name is not found....");
		}
		return browserInfoList;
	}
	//cross browser logic:
	//WAF: launchbrowser -> input parameter -- BrowserName(String)
	//return boolean --> true/false
	
	public boolean isBrowserLaunched(String browserName)
	{
		System.out.println("Browser name: " + browserName );
		
		boolean flag = false;
		switch(browserName.toLowerCase().trim())
		{
			case "chrome":
				System.out.println("Chrome is launched");
				flag=true;
				break;
			case "firefox":
				System.out.println("firefox is launched");
				flag=true;
				break;
			case "safari":
				System.out.println("safari is launched");
				flag=true;
				break;	
			default:
				System.out.println("browser is not found: " +browserName );
				break;
		}
		return flag;
	}
	public static void main(String[] args) {
		
		MethodsDemo md = new MethodsDemo();
		System.out.println(md.getClass());
		System.out.println(md.getStudentMarks("Naveen"));
		
		System.out.println(md.getBrowserInfo("ie")); //[]
		ArrayList<Object> brList = md.getBrowserInfo(" CHROME ");
		System.out.println(brList); //[Google Chrome, 99.9998, Google INC]
		
		if(md.isBrowserLaunched("chrome"))
		{
			System.out.println("Enter URL");
		}
		
	}

}
