package coreJavaConcepts;
 
class abc {
	public void add(int x,int y)
	{
		int a=x;
		int b=y;
		int s=a+b;
		System.out.println("Add fucntion of parent class:"+s);
	}	
}

public class Practice_String extends abc {
	public void add(int x1,int y1,int z1) {
		int a1=x1;
		int b1=y1;
		int c1=z1;
		int s1=a1+b1+c1;
		System.out.println("Add function of child: "+s1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice_String ps= new Practice_String();
		ps.add(3, 4, 7);
		ps.add(1,2);
		abc obj1=new abc();
		//obj1.add(1, 2);	
	}

}
