package WrapperClass;

/*
 int i =10;
 
 wrapper object on top of primitive data type. -> Integer
 
 Wrapper classes are helpful for data conversion like String to int
 integer to String.
 
 */
public class DataConversion {

	public static void main(String[] args) {

		int i = 10;
		System.out.println(Integer.MAX_VALUE); //2147483647
		System.out.println(Integer.MIN_VALUE);//-2147483647
	
		System.out.println(Byte.MAX_VALUE); //127
		System.out.println(Byte.MIN_VALUE); //-127
	
		System.out.println(Short.MAX_VALUE); //32767
		System.out.println(Short.MIN_VALUE); //-32767
	
		//use case,value fetched from selenium for price
		String x = "100";
		System.out.println(x+20); //10020
	
		//convert string to int
		int xInt = Integer.parseInt(x);
		System.out.println(xInt+20); //120
		
		String y = "100test"; //cannot pass alphanumeric string to parseInt
	
		String y1 = y.split("test")[0];
		
		int j = Integer.parseInt(y1); //100
		System.out.println(j+20); //120
		/*
		 Exception in thread "main" java.lang.NumberFormatException: For input string: "100a"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	at java.base/java.lang.Integer.parseInt(Integer.java:668)
	at java.base/java.lang.Integer.parseInt(Integer.java:786)
	at WrapperClass.DataConversion.main(DataConversion.java:32)
		 */
		
		System.out.println("----------");
		String p = "12.33";
		System.out.println(p+20); //12.3320
		
		double d = Double.parseDouble(p);
		System.out.println(d+20); //32.33
		
		
		//String to boolean:
		String remote = "true";
		
		if(remote.equals("true")) {
			System.out.println("run testcases on Docker AWS machne");
     	} 
		
		if(Boolean.parseBoolean(remote)) {
			System.out.println("run testcases on Docker AWS machne");
		} //performance wise this is better. 
		
		//int to String:
		int g = 100;
		System.out.println(g+20); //120
		
		String bill = String.valueOf(g); //"100"
		System.out.println(bill+20); //10020
		
		// boolean to String
		boolean isActive = true;
		
		if(isActive) {
			System.out.println("emp is active");
		}
		
		String check = String.valueOf(isActive);
		System.out.println(check+20); //"true", true20
		
		byte b1 = 100;
		byte b2 = 120;
		
		//byte b3 = b1+b2; //type mismatch byte to int
		int b3 = b1+b2; // cannot use short b3 also, because addition may result in higher value, to avoid this it converts to int
		System.out.println(b3);
		
	}

}
