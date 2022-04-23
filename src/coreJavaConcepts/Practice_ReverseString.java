package coreJavaConcepts;

public class Practice_ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I am a genius";
		String n="";
		char c;
		
		/*
		 * for(int i=s.length()-1;i>=0;i--) { c=s.charAt(i); n=n+c; }
		 * System.out.println("Reverse   "+n );
		 */
		for(int i=0;i<s.length();i++) {
			c=s.charAt(i);
			n=c+n;
		}
		System.out.println("Reverse   "+n );
	}

}
//Take an input from user ,
//user should give input out of these range, 
//with in this range (1-6)
//you have taken that input
//using math.random()
//math.random(1,6);
//you need to compare that your input should be greater 
//than the output which you are getting from the random function
//again your code should ask from user please give another input
//at the total score s4
//Create one project with the name of calculator - 
//Inside that create a class , 
//what kind of operation you wants?
//inside the class create multiple methods - Addition(1,2), 
//Addition(1,2,3), Addition(n numbers), 
//subtraction, division, multiplication,
//After wards - export and create a jar file.
//Create a new project - now you are great - whether to addition , 
//subtraction , multiplication -
//
//2 project

// first project calculator: one class or multiple classes
//import this to other project.