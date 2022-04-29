package coreJavaConcepts;
import java.util.*;
import java.io.*;

public class FibonacciSeries {
	public static void main(String args[]) {
		int a=0;
		int b=1;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter total number of Fibonacci numbers:  ");
		int n=sc.nextInt();
		int c=0;
		for(int i=0;i<n;i++) {
			System.out.print(" "+a);
			c=a+b;
			a=b;
			b=c;
		}
		
	}

}
