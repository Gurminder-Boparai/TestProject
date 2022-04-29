package coreJavaConcepts;
import java.util.*;

public class Practice_ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of an array");
		int size=sc.nextInt();
		int sum=0;
		int arr[]=new int[size];
		System.out.println("Enter the elements ");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		for(int a:arr) {
			System.out.println(a);
		}
		for(int i=0;i<size;i++) {
			sum=sum+arr[i];
		}
		System.out.println("Sum of an array: "+sum);
	}

}
