package Loops;

public class doWhileLoop {

	public static void main(String[] args) {

		// ctrl+space to generate the do while loop

		int p=1;
		do {
			
			System.out.println(p);
			p++;
		} while (p<=10);
	
		// infinite loop printing 1..
//		int p=1;
//		do {
//			
//			System.out.println(p);
//			//p++;
//		} while (p<=10);
//	
	
		p=1;
		do {
			
			System.out.println(p);
			p++;
		} while (p>=10);  //in this case p is not greater than 10, but value of p printed atleast once.
	
	
		p=1;
		do {
			
			System.out.println(p);
		} while (p>=10);  // 1, not an infinite loop.
	
		p=1;
		do {
			
			System.out.println(p);
		} while (false);  // 1
	
	}
}
