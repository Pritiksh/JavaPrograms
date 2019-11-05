package programs;

import java.util.HashSet;
//program to find duplicate character in a string
public class DuplicateCharacter {

	public static void main(String[] args) {
		String s="indonesiain";
		char[] ch = s.toCharArray();
		HashSet<Character> hs=new HashSet<>();
		for(Character c:ch)
		{
			if(hs.add(c)==false){
				System.out.print(c+" ");
			}
		}
	}

}
