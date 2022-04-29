package coreJavaConcepts;

public class Practice_Return2 {
	private static final int MAX_NUM=10;
	private static int factorial(int n) {
		int result =1;
		for(int i=1;i<=n;i++) {
			result*=i;
		}
		return result;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<MAX_NUM;i++) {
			System.out.println(i +"!="+ factorial(i));
		}
	}
	
}
