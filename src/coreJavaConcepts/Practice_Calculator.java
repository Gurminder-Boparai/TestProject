package coreJavaConcepts;
import java.util.*;

public class Practice_Calculator {
	public double Add() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter first number:");
		double n1=sc.nextDouble();
		System.out.println("Enter second number");
		double n2=sc.nextDouble();
		double s=n1+n2;
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Practice_Calculator pc= new Practice_Calculator();
		System.out.println("Please Press 1.Addition, Press 2.Subtraction");
		int o=sc.nextInt();
		if(o==1) {
			double result=pc.Add();
			System.out.println(result);
			
		}
	}

}
