package programs;

import java.util.HashMap;
import java.util.Set;

//Write a java program to find the duplicate words and their number of occurrences in a string
public class Duplicate {

	public static void main(String[] args) {
		String str="Java is java again java";
		String strLower=str.toLowerCase();
		String words[]=strLower.split(" ");
		HashMap<String,Integer> hm=new HashMap<>();
		for(String st:words){
			if(hm.containsKey(st)){
				hm.put(st, hm.get(st)+1);
			}
			else{
				hm.put(st, 1);
			}
			
		}
		Set<String> s=hm.keySet();
		for(String s1:s){
			if(hm.get(s1)>1){
				System.out.println(s1+" : "+hm.get(s1));
			}
		}

	}

}
