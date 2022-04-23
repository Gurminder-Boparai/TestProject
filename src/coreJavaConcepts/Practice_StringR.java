package coreJavaConcepts;

public class Practice_StringR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I AM A GENIUS";
	 
	    String words[]=s.split("\\s");

       //for (String a : words)
       //System.out.print(a);
       //System.out.println(words.length);
	    
	    String r="";
	    for(int i=0;i<words.length;i++) { 
	            if(i==words.length-1) 
	              r=words[i]+r; 
	            else
	              r=" "+words[i]+r; 
	        } 
	    System.out.print("Reversed string : "+r);
	  }

	}


