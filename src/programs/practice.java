package programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;
import java.util.*;  
import java.util.regex.*;  

public class practice {
	 
		  
		  public static void main (String args[])  
		  {  
			  String s = "i am Geeks for Geeks and a Geek"; 
			  // Splits Str into all possible tokens 
		        for (String word : s.split(" ")) 
		        	// if length is even 
		            if (word.length() % 2 == 0) 
		  
		                // Print the word 
		                System.out.println(word); 
		    
		  }  
		}  