package OOP_Interface.Assignment;

public interface IndianUniversity extends WorldUniversity{

	public void CommerceStreamCourses();
	
	public void ScienceStreamCourses();
	
	public void ArtsStreamCourses();
	
	public static void CommerceFee() {
		System.out.println("Commerce Fee structure");
	}
	
	public default void ScienceFee() 
	{
		System.out.println("Science fee structure");
	}
}
