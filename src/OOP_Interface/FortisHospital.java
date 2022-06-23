package OOP_Interface;

public class FortisHospital  extends Medical implements USMedical,UKMedical,IndianMedical {

	//US
	//its not mandatory, but a good practice to add
	// to say overridden method
	@Override 
	public void physioServices() {
		System.out.println("FH -- PhysioServices");
	}

	@Override
	public void cardioServices() {
		System.out.println("FH -- cardioServices");
		
	}

	@Override
	public void ENTServices() {
		System.out.println("FH -- ENTServices");
	}

	@Override
	public void emergencyServices() {
		System.out.println("FH -- emergencyServices");
	}

	//UK
	@Override
	public void oncologyServices() {
		System.out.println("FH -- oncologyServices");

	}

	@Override
	public void pediaServices() {
		System.out.println("FH -- pediaServices");
		
	}

	//Indian Medical
	@Override
	public void neuroServices() {
		System.out.println("FH -- neuroServices");
		
	}

	@Override
	public void dentalServices() {
		System.out.println("FH -- dentalServices");
		
	}
	
	//Individual methods:
	public void medicalTraining()
	{
		System.out.println("FH--Medical Training");
	}
	
	public void optClinical()
	{
		System.out.println("FH-optClinical");
	}
	
     // Method hiding: can have the same name as that of static method in Interface
	// but cannot override the static method.
	public static void billing()
	{
		System.out.println("Fortis Hospital -- billing");
	}

	@Override
	public void covid19Vaccination() {
		System.out.println("Fortis Hospital -- covid19Vaccination");
		
	}
	
	
	//default method overriding:
//	@Override
//	public void medicalHistory()
//	{
//		System.out.println("Fortis Hospital -- MedicalHistory");
//	}
	
	
	//child class overriding
	@Override
	public void medicalRD()
	{
		System.out.println("Fortis Hospital --Medical R&D");
	}

	@Override
	public String physioServices(int a) {
		
		System.out.println("Fortis Hospital --physioServices overloaded");
		return "result";
	}
	
}
