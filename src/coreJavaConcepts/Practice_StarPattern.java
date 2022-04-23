package coreJavaConcepts;

public class Practice_StarPattern {
	public void Pattern1() {
		int r=5;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}
	
	public void Pattern2(){
		int r=5;
		for(int i=0;i<=r;i++) {
			for(int j=5;j>i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void Pattern3() {
		int r=5;
		for(int i=0;i<r;i++) {
			for(int j=0;j<r;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice_StarPattern P1= new Practice_StarPattern();
		Practice_StarPattern P2= new Practice_StarPattern();
		Practice_StarPattern P3= new Practice_StarPattern();
		P1.Pattern1();
		P2.Pattern2();
		//P3.Pattern3();
		}
}
