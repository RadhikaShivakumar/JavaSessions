package StringConcept;

public class StringReverse {

	public static String reverseString(String str)
	{
		if (str == null) {
			System.out.println("This is null string...");
			return null;
		}
		
		int len = str.length();
		String rev = "";
		
		if(len == 1) {
			return str;
		}
		for(int i=len-1; i>=0;i--)
		{
			rev = rev+str.charAt(i);
		}
		return rev;
		
	}
	
	public static void isPalindrome(String str)
	{
		if(reverseString(str).equalsIgnoreCase(str))
		{
			System.out.println("String is palindrome");
		} 
		else 
		{
			System.out.println("String is not palindrome");
		}
	}
	
	public static String lineReverse(String str)
	{
		String words[] = str.split(" ");
		String reverseWord = "";
		
		for(String w: words) {
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			reverseWord += sb.toString()+" ";
		}
		return reverseWord;
	}
	
	public static void lineReverseStringBuilder(String str)
	{
		StringBuilder reverseString = new StringBuilder();
		String words[] = str.split(" ");
		for(String word: words)
		{
			String reverseWord = new StringBuilder(word).reverse().toString();
			reverseString.append(reverseWord+" ");
		}
		System.out.println(reverseString.toString().trim());
	}
	
	public static String reverseWordsInMyString(String str) {
		String words[] = str.split(" ");
		String reversedString = "";
		for(int i=0;i<words.length;i++) {
			String word = words[i];
			String reverseWord = "";
			for(int j=word.length()-1;j>=0;j--)
			{
				reverseWord += word.charAt(j);
			}
			reversedString += reverseWord+ " "; 
		}
		return reversedString;
	}
	
	
	public static void main(String[] args) {

		//No s.reverse function -
		String s = "Selenium";
		System.out.println(reverseString(null));
		System.out.println("testing"); //
		
		isPalindrome("level");
		isPalindrome("Malayalam");
		
		String st = "This is my Selenium Code";
		//edoC  muineleS ym si sihT
		//split on the basis of space and reverse the 
		
		System.out.println(lineReverse(st));
		System.out.println(reverseWordsInMyString(st));
		lineReverseStringBuilder(st);
	}

	
	
}
