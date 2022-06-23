package OOPs_Inheritance;

public class AutoMobile extends Mechanical {

	@Override
	public void wheelBalance()
	{
		System.out.println("vehicle -- Wheel balance");
	}
	
	@Override
	public void breakingSystem()
	{
		System.out.println("vehicle - Break Mechanism");
	}
	
	public void clutchSystem()
	{
		System.out.println(" Clutch system");
	}
}
