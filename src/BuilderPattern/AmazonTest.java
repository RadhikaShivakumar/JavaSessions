package BuilderPattern;

// builder object pattern: since every method returns the current object class(in this case ap)
// through which we can call other methods. hence can create workflow.
// also called method chaining.

// selenium eg:  action.moveToElement().build().perform();

//disadvantage: we dont use in page object class,as it violates page object pattern
public class AmazonTest {

	public static void main(String[] args) {

		AmazonApp ap = new AmazonApp();
		ap.doLogin("naveen@gmail.com","admin")
			.doSearch("macbook pro")
				.addToCart("macbook pro")
					.makePayment("2534767865",234)
						.generateOrderID()
							.logout();
		
		
		//
		ap.doLogin("naveen@gmail.com","admin")
			.doSearch("Nike shoes",5000,"nike")
				.addToCart("Nike shoes")
					.logout();
		
		//
		ap.doLogin("naveen@gmail.com","admin")
			.makePayment("abc@hdfc")
				.generateOrderID()
					.logout();
		
		//
		ap.doLogin("naveen@gmail.com","admin")
			.doSearch("iphone 13")
					.logout();

		ap.doLogin("naveen@gmail.com","admin")
			.logout();
				
	}

}
