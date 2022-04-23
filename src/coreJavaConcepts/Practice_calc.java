package coreJavaConcepts;
import java.util.*;


class Options{
	
	public static void add(double a, double b) {
		System.out.println("You have selected Addition of two numbers:");
		double sum=a+b;
		System.out.println("Sum of two numbers: "+sum);
		
	}
	public static void add(double a,double b,double c) {
		System.out.println("You have selected addition of three numbers:");
		double sum=a+b+c;
		System.out.println("Sum of three numbers: "+sum);
	}
	public static void add() {
		System.out.println("You have selected addition of n numbers:");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total numbers for addition");
		int n=sc.nextInt();
		double sum=0;
		double arr[]= new double[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter "+i+" number :");
			arr[i]=sc.nextDouble();
		}
		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum of N numbers: "+sum);
	}
	
	public static void sub(double a, double b) {
		
		double c=a-b;
		System.out.println("Result is: "+c);
		
		
	}
	public static void multiply(double a,double b) {
		
		double c=a*b;
		System.out.println("Result is: "+c);
	}
	public static void division(double a,double b) {
		
		double c = 0;
		try {
		c=a/b;
		}
		catch(ArithmeticException e) {
			System.out.println("Can't Divide by Zero");
		}
		System.out.println("Result is: "+c);
	}	
}

public class Practice_calc extends Options {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Options: 1.ADDITION 2.SUBTRACTION 3.MULTIPLICATION 4.DIVISION ");
		int n=sc.nextInt();
		if(n==1){
			System.out.println("Enter your Options: 1. add 2 numbers 2.add 3numbers  3. add N numbers");
			int s=sc.nextInt();
			
			if(s==1) {
				System.out.println("Please enter first number");
				double n1=sc.nextDouble();
				System.out.println("Please enter second number");
				double n2=sc.nextDouble();
				add(n1,n2);
			}else if(s==2) {
				System.out.println("Please enter first number");
				double n1=sc.nextDouble();
				System.out.println("Please enter second number");
				double n2=sc.nextDouble();
				System.out.println("Please enter third number");
				double n3=sc.nextDouble();
				add();
			}else if(s==3) {
			add();
			}else {
				System.out.println("Please enter Right options");
			}
		} 
		System.out.println("Please enter first number");
		double n1=sc.nextDouble();
		System.out.println("Please enter second number");
		double n2=sc.nextDouble();
		 
			 if(n==2){
			System.out.println("You have selected Subtraction:"); 
			sub(n1,n2);
		}else if(n==3) {
			System.out.println("You have selected Multiplication:");
			multiply(n1,n2);	
		}else if(n==4) {
			System.out.println("You have selected Division:");
			division(n1,n2);
		}else {
			System.out.println("Please enter Right options");
		}

	}

}
