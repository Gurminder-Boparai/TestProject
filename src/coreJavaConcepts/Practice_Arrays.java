package coreJavaConcepts;

public class Practice_Arrays {
	public void arr() {
		int a []=new int[5];
		for(int i=0;i<a.length;i++) {
			for(int j=5;j>i;j--) {
				System.out.print("*");
			}
			a[i]=i;
			System.out.println();
		}	
	}
	
	public void arr2() {
		int a[]={1,2,5,6,3,2};
		int size, temp;
		size=a.length;
		System.out.println("Sorted Array:");
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
			System.out.print("  "+a[i]);
		}
		//System.out.println("2nd Largest element::"+a[size-2]);
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice_Arrays a1= new Practice_Arrays();
		Practice_Arrays a2= new Practice_Arrays();
		//a1.arr();
		a2.arr2();
	}
}
