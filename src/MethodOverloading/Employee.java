package MethodOverloading;

import java.util.Arrays;

public class Employee {

	//This is always a better approach to use array literals. which also saves space in memory
	public String[] getEmpDevices(String empName)
	{
		System.out.println("Employee name is: " + empName);
		if(empName.equalsIgnoreCase("Divya"))
		{
			String product[] = {"macbook pro","iphone 13","Apple mouse"};
			return product;
		}
		else if(empName.equalsIgnoreCase("Prashant"))
		{
			String product[] = {"Windows Dell","Samsung s9","Dell mouse"};
			return product;
		}
		else
		{
			System.out.println("Emp is not found..");
			return null;
		}
	}
	
	// Not a better approach, when not sure how many devices one have.
	public String[] getEmpDevices1(String empName)
	{
		System.out.println("Employee name is: " + empName);
		String product[] = new String[5];
		if(empName.equalsIgnoreCase("Divya"))
		{
			product[0]="macbook pro";
			product[1]="macbook air";
			product[2]="iphone 13";
			product[3]="ipad";
			product[4]="Apple mouse";
		}
		else if(empName.equalsIgnoreCase("Prashant"))
		{
			product[0]="Windows Dell";
			product[0]="Samsung s9";
			product[0]="Dell mouse";
		}
		else
		{
			System.out.println("Emp is not found..");
		}
		return product;
	}
	public static void main(String[] args) {
		
		Employee mo = new Employee();		
		String[] dev = mo.getEmpDevices("Divya");
		System.out.println(Arrays.toString(dev));
		
//		String[] dev = mo.getEmpDevices("kim");  //null, also null pointer exception as dev[] is empty.
//		System.out.println(Arrays.toString(dev));
		
		for(String s:dev)
		{
			System.out.println(s);
		}
		
		System.out.println("\nUsing for loop to print array");
		for(int i =0; i<dev.length;i++)
		{
			System.out.println(dev[i]);
		}
		
		String[] dev1 = mo.getEmpDevices1("aef");
		System.out.println(Arrays.toString(dev1)); //[Null,null,null,null,null]
	}

}
