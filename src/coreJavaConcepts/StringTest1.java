package coreJavaConcepts;

public class StringTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="gurminder";
		char [] chars=s.toCharArray();
		int right=chars.length-1;
		int left=0;
		while(left<=right) {
			swap(chars,left,right);
			left++;
			right--;
			
		}
		s=chars.toString();
		//System.out.println(s);
		for(int i=0;i<chars.length;i++) {
			System.out.print(chars[i]);
		}
//		for(int i=0;i<s.length();i++)
//		{
//			System.out.println(chars[i]);
//		}
//		for(int i=s.length()-1;i>=0;i--){
//			System.out.println(chars[i]);
//		}

	}

	public static void swap(char[] str, int i, int j)
	{
		char temp= str[i];
		str[i]=str[j];
		str[j]=temp;
	}
}
