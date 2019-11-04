package programs;

import java.util.HashSet;

//Write a java program to find duplicate elements from string array
public class DuplicateElements {

	public static void main(String[] args) {
		String[] s = { "apple", "orange", "apple", "banana" };
		HashSet<String> hs = new HashSet<String>();
		for (String dup : s) {
			if (!hs.add(dup)) {
				System.out.println(dup);
			}
		}
	}

}
