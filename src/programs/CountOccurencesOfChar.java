package programs;

import java.util.HashMap;

//Java Program To Count Occurrences Of Each Character In String 
public class CountOccurencesOfChar {

	public static void main(String[] args) {
		  String str="Java J2EE Java JSP J2EE";
		  HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		  char[] strArray=str.toCharArray();
		  for(char c:strArray){
			  if(hm.containsKey(c)){
				  hm.put(c, hm.get(c)+1);
			  }
			  else
			  {
				  hm.put(c, 1);
			  }
		  }
		  System.out.println(hm);

	  }  
	} 
