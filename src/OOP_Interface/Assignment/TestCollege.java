package OOP_Interface.Assignment;

public class TestCollege {

	public static void main(String[] args) {

		JNCCollege jnc = new JNCCollege();
		
		jnc.Streams(); //from grand Parent interface implemented method
		jnc.ArtsStreamCourses(); //overriden method
		jnc.CommerceStreamCourses(); //overriden method
		jnc.ScienceStreamCourses(); //overriden method
		jnc.ExtraCurricularActivites(); //individual method
		System.out.println(USUniversity.maxStudentsPerClass); //10
		jnc.ScienceFee(); // jnc-fee strucure
		IndianUniversity.CommerceFee(); // Commerce Fee structure
		jnc.CommerceFee();
		
		//Top-casting
		IndianUniversity in = new JNCCollege();
		in.ScienceFee(); //Science fee structure
		in.ArtsStreamCourses();
		in.CommerceStreamCourses();
		in.ScienceStreamCourses();
		in.Streams();
		
	}

}
