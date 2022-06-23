package ArrayConcepts;

import java.util.ArrayList;

/*
 ArrayList
 Dynamic array.
 
 ArrayList ar = new ArrayList();
 This is not wrong declaration of ArrayList, but java has to make extra effort to store data.
 Hence it gives warning to declare the ArrayList with the generics such as Integer,character,Double,String,Object type
 
 		ArrayList<Object> empData = new ArrayList<Object>();


 it will create arrayList segments. By default it will create 10 segments
 
 Default virtual capacity of Array List is 10
 Physical capacity is 0 [how many elements added physically]
  //ar.size always gives physical capacity
 
 once all 10 physical capacity is filled, it will add 5(10 physical capacity/2) more segments. 
 In the next round we get 15/2=7 virtual segments, 22/2 = 11 segments
 
 
 it will always check the current physical capacity which is filled and divide by 2 to add more segments.
 
 why java has provided virtual segment: For better memory management and optimization.
 
 can we change the virtual segments -> yes. 
 ArrayList ar = new ArrayList(5); //now virtual capacity isi 5 now.
 
 ArrayList is always a continuous memory allocation 
 
 ArrayList allows blank values, null and duplicate values.
 
 Usecases:
 1. Total number of links/images
 2. Total number of WebElements 
 3. dynamic drop downs
 4. dynamic web tables
 5. footer list
 6. top menu list
 7. child menu
 
 
 
 
 
 */
public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList ar = new ArrayList();  
		System.out.println(ar.size());
		System.out.println(ar);
		ar.add(100); // 0 index
		ar.add(200); // 1 index
		
		System.out.println("ArrayList size: " +ar.size());
		
		ar.add(300);
		ar.add(400);
		System.out.println("ArrayList size: " +ar.size());
		System.out.println(ar);
		
		System.out.println("Lowest index: "+0);
		System.out.println("Size: "+ar.size());
		System.out.println("Highest index: "+ (ar.size()-1));
		
		
		System.out.println(ar.get(0)); //100
		System.out.println(ar.get(3)); //400
		//System.out.println(ar.get(4)); //IndexOutOfBoundException
		ar.add(4, 600);
		System.out.println(ar.get(4)); //cannot add to any random index, its a continuous memory location
		
		ar.add(1, 1100);
		System.out.println(ar.get(1)); //1100
		
//		ar.remove(2); //Entire segment will be deleted.
//		System.out.println(ar.size()); //3
//		System.out.println(ar.get(2)); //400
		
		//to print all the values from arrayList
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		/*
		 100
		1100
		200
		300
		400
		600
		 */
		
		System.out.println("--------------");
		for(Object e: ar) {
			System.out.println(e);
		}
		
		//Generics in Arraylist
		// define type of data i.e. stored in ArrayList
		ArrayList<String> names=new ArrayList<String>();
		names.add("Tom");
		names.add("Ravi");
		names.add("Chitra");
		
		ArrayList<String> empNames=new ArrayList<String>();
		names.add("Naveen");
		names.add("Monica");
		names.add("Prasanna");
		

		System.out.println("--------------");
		System.out.println(names.size()); //3
		
		for(String e: names) {
			System.out.println(e);
			if(e.equals("Ravi"))
			{
				System.out.println("Hi Ravi");
				break;
			}
		}
			
		/*
		 Tom
         Ravi
         Chitra
		 */
		
		System.out.println(names); //[Tom, Ravi, Chitra]
		
		//addAll method used to combine two different ArrayList
		System.out.println("\n--------addAll method---------");
		names.addAll(empNames);
		System.out.println(names);
		
		names.addAll(ar);
		System.out.println("\n After adding another ArrayList"+names);
		
		
		
		
		
		
		
		
		//integer type of ArrayList
		ArrayList<Integer> marksList = new ArrayList<Integer>();
		
		marksList.add(100);
		marksList.add(12);
		
		
		//Double type of ArrayList
		ArrayList<Double> priceList = new ArrayList<Double>();
		
		priceList.add(100.568);
		priceList.add(12.33);

		//character type of ArrayList
		ArrayList<Character> charList = new ArrayList<Character>();
		
		charList.add('a');
		charList.add('b');
		
		//Object type of ArrayList
		
		ArrayList<Object> empData = new ArrayList<Object>();
		
		empData.add("Sanjay");
		empData.add(30);
		empData.add(34.55);
		empData.add('m');
		empData.add(true);
		
		System.out.println("------------------------");
		System.out.println(empData); //[Sanjay, 30, 34.55, m, true]
		
		System.out.println("\nPrint Empdata");
		for(Object e: empData)
		{
			System.out.println(e);
		}
		
		System.out.println("\nPrint Empdata in reverse order");
		for(int c=empData.size()-1;c>=0;c--)
		{
			System.out.println(empData.get(c));
		}
		
		//Doubt
		System.out.println("\nPrint Empdata in reverse order using foreach loop");
		int counter=empData.size()-1;  //not working
		
		for(Object e: empData) {
			System.out.println(e);
			counter--;
		}
	
	

	
	
	
	}
	
}
