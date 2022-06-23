package Strings;

public class IncrementalDecrementalConcept {

	public static void main(String[] args) 
	{
		//++ and --
		//1. post increment:
		int a = 1;
		int b = a++; //original value of a to b and increment later
		System.out.println(a); //2
		System.out.println(b); //1
		
		
		int m = -99;
		int n = m++;
		System.out.println(m); //-98
		System.out.println(n); //-99
		
		//2. pre increment: first increase and then assign
		int c =1;
		int d = ++c;
		System.out.println(c); //2
		System.out.println(d); //2
		
		int p = -101;
		int q = ++p;
		System.out.println(p); //-100
		System.out.println(q); //-100
		System.out.println(p+q); //-200
		
		//3. post decrement:
		int h = 2;
		int g= h--;
		System.out.println(h); //1
		System.out.println(g); //2
		
		int l = -49;
		int u = l--;
		System.out.println(l); //-50
		System.out.println(u); //-49
		
		//4. pre decrement
		int v = 2;
		int z= --v;
		System.out.println(v); //1
		System.out.println(z); //1
		
		int t = 2;
		System.out.println(t++); //2 first the value is printed and only then value is increatsed.
		System.out.println(t); //3
		System.out.println(++t); //4
		
		int o=3;
		System.out.println(++o); //4
		System.out.println(o); //4
		
		int k = 2;
		System.out.println(100 + (k++)); //102

		System.out.println(100 + (++k)); //104
	}

}
