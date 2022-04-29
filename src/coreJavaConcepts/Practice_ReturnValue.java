package coreJavaConcepts;


public class Practice_ReturnValue {
	private int test(int a, int b) {
		
		if (a>b) {
			return a;
			}
		else
			return b;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice_ReturnValue rv=new Practice_ReturnValue();
		System.out.println(rv.test(1222, 130));
		
	}

}
