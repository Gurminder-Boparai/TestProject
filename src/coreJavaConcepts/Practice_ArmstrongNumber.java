package coreJavaConcepts;
import java.util.*;

public class Practice_ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number");
		int n=sc.nextInt();
		int temp=n;
		int temp1=n;
		int rem;
		int sum=0;
		int count=0;
		while(n!=0) {
			n=n/10;
			count++;	
		}
		while(temp!=0) {
			rem=temp%10;
			sum=sum+(int)Math.pow(rem, count);
			temp=temp/10;
		}
		if(sum==temp1) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
