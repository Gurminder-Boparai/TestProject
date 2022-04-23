package coreJavaConcepts;
import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc= new Scanner(System.in);
		//System.out.print("Enter any number");
		//int n=sc.nextInt();
		int n=10;
		int i;
		int count=0;
		for(i=2;i<n;i++){
				if(n%i==0){
					count=count+1;
				}	
				System.out.println(" Out     "+count);	
		}
		if(count>0){
			System.out.println(n + "  is not a prime Number");
		}
		else {
			System.out.println(n+ "  is a prime Number");
		}
		
	}
}


