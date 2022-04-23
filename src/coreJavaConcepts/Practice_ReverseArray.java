package coreJavaConcepts;

import java.util.*;

public class Practice_ReverseArray {
	static void ReverseArray(int b[]) {
		System.out.println();
		System.out.println("Reverse of an array");
		for(int i=b.length-1;i>=0;i-- ) {
			System.out.print(b[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[]= {1,2,3,4,5};
		//ReverseArray(a);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of an array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter number at index ["+i+"]");
			arr[i]=sc.nextInt();
		}
		System.out.println("Entered array:");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		ReverseArray(arr);
		//Printing using for each loop
		//for (int r:arr) {
		//System.out.print(r+" ");
		//}
	}
	}
