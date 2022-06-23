package TimeComplexity;

/*
 TimeComplexity -> how much time the program takes to run
 
 Measure of time to run program, so that it takes less time
 */
public class TimeComplexity {

	public static void main(String[] args) {
		//Big O(N)
		
		int i = 10;
		System.out.println(i);
		
		//Here program will executed only once. Time complexity of the above
		//statement is O(1) -- constant time
		
		// print 1 to 10..
		for(int k=1; k<=10;k++)
		{
			System.out.println(k);
		}
		
		//O(10) -- program runs 10 times hence time complexity is O(10)
	
		/*
		 
		 k=1, k<=10 k runs 10 times, System.out.println(k); this will be printed 10 times, k++ ->>9 times
		 it will be executed
		 >>> 1 + n(number of times) + n + n ==> 3n+1 ==> Linear equation
		 
		
		 if for loop program executes for 1 hour, in that k=1, takes less time hence not considered.
		 3n+1 ==> 3n  ==> O(n)
		 3n to create a generalized formula converted to O(n)
		 3n can be 100n in another program.
		 
		 
		 */
		for(int k=1; k<=10;k++) {
			for(int p=1;p<=10;p++) {
				System.out.println("hi");
			}
		}
		
		/*
		k=1, k <=10,k++ p=1,P<=10,System.out.println("hi"); p++
		==>(1 + n + n) (1+n+n+n) ==> (1+2n)(1+3n) ==>1+3n+2n+6n^2 ==> 6n^2 +5n +1 ==> Quadratic Equation
		 
		Again significance of 1 is negligible.
		==>  6n^2 +5n ==> n(6n+5) ==> removing 5, as it is constant.
		==> 6n^2 ==> O(n^2)
		 
		 more iterations more time
		 */
	
		for(int k=1; k<=10;k++) {
			for(int p=1;p<=10;p++) {
				for(int q=1;q<=10;q++) {
					System.out.println("hi");
				}
			}
		}
		/*
		 k=1, k<=10,k++, p=1,p<=10,p++, q=1,q<=10,syso("hi"),q++
 	    ( 1 + n+n) (1 + n+	n)	(1+n+ n + n) ==> (1+2n)(1+2n)(1+3n) ==> (1+2n+2n+4n^2)(1+3n) ==> (1+4n+4n^2)(1+3n) ==> 1+3n+4n+12n^2+4n^2+12n^3
 	    ==>1+7n+16n^2+12n^3 ==> 12n^3+16n^2+7n ==>n(12n^2+16n+7) ==> n*n(12n+16) ==>n*n*12n ==> n*n*n ==> O(n^3)
		removing all constants.
		
		https://levelup.gitconnected.com/big-o-time-complexity-what-it-is-and-why-it-matters-for-your-code-6c08dd97ad59
		
		 logn
		 let’s really quickly define what a “log” is Just like addition has an inverse (subtraction) and multiplication has an inverse (division) so does exponentiation.
		 The inverse of exponentiation is a logarithm (log).

		 An example: log ₂(8) = 3. We can read this simply as, “2 to what power equals 8?”. Well, 2 * 2 * 2 = 8. So our answer is 3.
		
		The most common “logs” you’ll see are log ₂ (pronounced “log base two”) and log ₁₀. But per our usual simplification purposes, we’re just going to shorten this to saying “log”. The reason for this being that no matter what “log” we’re dealing with, the general trend of our graph will always end up looking the same. Okay, that’s enough for now! Onto the coding.

		Here’s a classic example of a logarithm with an O(log n):
		function continuallySplit(n) {
			while (n > 0) {
				n /= 2;
			}
		}
	
	   Another common example of an algorithm that would have an O(log n) would be a search algorithm where the answer
	   space keeps getting split. This could be a binary search, where you split an ordered array in half over and over again
	   until you find the answer.
	
		 */
	
	
	}

}
