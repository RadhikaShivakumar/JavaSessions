package Encapsulation;

/*
 * unnecessary detail technical details not expose to user by making them private
 */
public class BrowserClass {

	public void launchChrome()
	{
		System.out.println("Launching chrome");
		checkRam();
		checkOSCompatibility();
		checkChromeVersion();
		checkNetworkConnection();
		System.out.println("chrome is launched");
	}

	private void checkRam()
	{
		System.out.println("check ram");
	}

	private void checkOSCompatibility()
	{
		System.out.println("check checkOSCompatibility");
	}

	private void checkChromeVersion()
	{
		System.out.println("check checkChromeVersion");

	}

	private void checkNetworkConnection()
	{
		System.out.println("check checkNetworkConnection");

	}
	
}
