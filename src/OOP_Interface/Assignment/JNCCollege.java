package OOP_Interface.Assignment;

public class JNCCollege implements IndianUniversity,USUniversity,UKUniversity {

	@Override
	public void Streams() {
		
		System.out.println("Sceience, commerce,Arts");
	}

	@Override
	public void CommerceStreamCourses() {
		System.out.println("Commerce courses");
		
	}

	@Override
	public void ScienceStreamCourses() {
		
		System.out.println("Science courses");
	}

	@Override
	public void ArtsStreamCourses() {
		
		System.out.println("Arts courses");
	}

	public void ExtraCurricularActivites() {
		System.out.println("ExtraCurricularActivites: Yoga,dance,music");
	}
	
	//Default method overriding:
//	public  void ScienceFee() 
//	{
//		System.out.println("JNC -Science fee structure");
//	}
//	
	
	//can have the same method name as that static method in interface but cannot override
	public static void CommerceFee() {
		System.out.println("JNC - Commerce Fee structure");
	}
	
}
