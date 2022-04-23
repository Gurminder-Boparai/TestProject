package coreJavaConcepts;



public class StringTest {
	public static void main(String args[]){
		String s="gurminder";
		String n="";
		char c;
		for(int i=0;i<s.length();i++) {
			c=s.charAt(i);
			n=c+n;
		}
		System.out.println("Reverse   "+n  );
		
//		if(s.equals(n)) {
//			System.out.println("string is palindrome ");
//		}
//		else {
//			System.out.println("string is not palindrome");
//		}
//		
		
		//swapping two numbers:
//		int a=2;
//		int b=7;
//		int c;
//		c=a;
//		a=b;
//		b=c;
//		System.out.println("Value of a is "+a);
//		System.out.println("Value of b is "+b);
//		
	}

}


