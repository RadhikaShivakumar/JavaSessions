package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {

		FortisHospital fh = new FortisHospital();
		fh.cardioServices();
		fh.dentalServices();
		fh.emergencyServices();
		fh.ENTServices();
		fh.medicalTraining();
		fh.neuroServices();
		fh.oncologyServices();
		// USMedical.min_fee=100; --> cannot change the variable value of Interface, because it is final (constant)
		System.out.println(USMedical.min_fee); //10
		
		System.out.println(FortisHospital.min_fee); //10  (Can access Inteface variable using Child class name)
		
		USMedical.billing(); //US -- billing
		//FortisHospital.billing(); -- Not accessible
		
		FortisHospital.billing(); //Fortis Hospital -- billing
		
		fh.covid19Vaccination(); //Fortis Hospital -- covid19Vaccination
		fh.medicalHistory(); //fortis hospital -- MedicalHistory, if this method not overriden in child class, then get interface implementation
		fh.medicalRD(); //Fortis Hospital --Medical R&D
		
	    //Top casting:
	    //child class object can be referred by parent interface reference variable
	    
	    
		USMedical us = new FortisHospital(); //type of USMedical Interface.
		//4 methods of USMedical
		System.out.println("---------------------");
		us.cardioServices();
		us.emergencyServices();
		us.ENTServices();
		us.physioServices();
		us.covid19Vaccination(); //Fortis Hospital -- covid19Vaccination
		
		//us.oncologyServices(); //The method oncologyServices() is undefined for the type USMedical
	
		//Down casting: at compile time? Not Applicable
		// create an object reference of child class by referring to Parent class Object
		//FortisHospital fh1 = new USMedical();  //error cannot instantiate
		
		
		WHO who = new FortisHospital();
		who.covid19Vaccination(); //Fortis Hospital -- covid19Vaccination
		
		
	}

}
