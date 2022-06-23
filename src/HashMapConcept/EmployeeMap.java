package HashMapConcept;

/*
 * Default capacity of HashMap -> 16.
 * As the number of elements in the HashMap increases, the capacity is expanded.
 * 
 The capacity of an HashMap is the number of buckets in the hash table. 
 The initial capacity is the capacity of an HashMap at the time of its creation. 
 The default initial capacity of the HashMap is 2^4 i.e 16. The capacity of the HashMap is doubled each time it reaches the threshold. 
 i.e the capacity is increased to 2^5=32, 2^6=64, 2^7=128….. when the threshold is reached.
 
 *Hashcode = some random number it generates for a key. Hashcode is a string.
 Any random index gets filled which is calculated by java.
 
 Multiple strings can have same hashcode, this is called collision mapping. To solve this,
 Java will create another node, like a linked list for the same index and hashcode
 the last node is connected to null.
 
 if key is null, then it will stored in zeroth position.
 
put(key,value) {

String hash = hashcode(key) //123456
index = mod(hash) --> 3 , the position at which key and value is stored.

}
 0
 1
 2
 3  123456 Tom SDET1
 5  456789 Peter SDET2
 
 15
 
 
 
 Before JDK 1.8, there was no limit for Linked list nodes. After 1.8, once it reaches 8, the linked list is
 converted to binary search tree, because of performance.
 
 For strings the order is not constant. But for integers the order is same
 Hashcode calculation is not done for primitive data types like integer.
 
 with combination of string, integer the order is same.
 
 
 */
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class EmployeeMap {

	public static void main(String[] args) {

		HashMap<String,String> map = new HashMap<String,String>();
		
		map.put("Tom", "SDET1");
		map.put("Peter", "SDET2");
		map.put("Lisa", "SDET3");
		map.put("Naveen", "QA Manager");
		map.put(null, "Fresher1");
		map.put(null, "Fresher2");
		map.put("Lisa", "SDET4");
		map.put("Shifa", null);
		map.put("Ravi", null);
		
		
		System.out.println(map.get("Tom"));
		System.out.println(map.get("Peter"));
		System.out.println(map.get("Lisa"));
		System.out.println(map.get("Jay"));
		System.out.println(map.get("Shifa"));
		System.out.println(map.get("Ravi"));
		System.out.println(map.get(null));
		
		//iterate hashmp
		map.forEach((k,v) -> System.out.println(k+ " : "+v));
		
		
		HashMap<Integer,Integer> marksMap =  new HashMap<Integer,Integer>();
		marksMap.put(1, 100);
		marksMap.put(2, 200);
		marksMap.put(3, 300);
		marksMap.put(4, 400);
		marksMap.put(null, 500);
		
		
		marksMap.forEach((k,v)-> System.out.println(k+":"+v));
	
		/*
		 null:500
1:100
2:200
3:300
4:400
		 */
	
		
		HashMap<String,Double> brMap = new HashMap<String,Double>();
		
		brMap.put("chrome", 91.1);
		brMap.put("firefox", 91.1);
		brMap.put("edge", 91.1);
		brMap.put("safari", 91.1);
		
		brMap.forEach((k,v)-> System.out.println(k+":"+v));
		
		
		//Topcasting: map is the parent of HashMap
		
	    Map<String,Double> brMap1 = new LinkedHashMap<String,Double>(); // it will maintain order. 
		
		brMap1.put("chrome", 91.1);
		brMap1.put("firefox", 91.1);
		brMap1.put("edge", 91.1);
		brMap1.put("safari", 91.1);
		
		brMap.forEach((k,v)-> System.out.println(k+":"+v));
		
		//TreeMap
		Map<String,Double> brMap2 = new TreeMap<String,Double>(); // it will maintain alphabetical order. 
			
		brMap2.put("chrome", 91.1);
		brMap2.put("firefox", 91.1);
		brMap2.put("edge", 91.1);
		brMap2.put("safari", 91.1);
			
		brMap.forEach((k,v)-> System.out.println(k+":"+v));
		
		
		
		
	}

}
