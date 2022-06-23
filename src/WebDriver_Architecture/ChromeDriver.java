package WebDriver_Architecture;

public class ChromeDriver implements WebDriver {

	public ChromeDriver()
	{
		System.out.println("Launching google chrome");
	}
	@Override
	public void get(String url) {
		System.out.println("Entering url:" + url);
	}

	@Override
	public String getTitle() {
		return "Amazon Shopping";
	}

	@Override
	public String getUrl() {
		return "https://www.abc.com";
	}

	@Override
	public void click(String element) {
		System.out.println("clicking on element:" + element);
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("Enering the value:" + value +" "+ " to " + value);
	}

	@Override
	public void close() {
		System.out.println("Closing the browser");
	}

	
}
