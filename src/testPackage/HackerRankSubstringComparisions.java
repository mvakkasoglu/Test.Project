package testPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HackerRankSubstringComparisions {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
	
		

	    public static String getSmallestAndLargest(String s, int k) {
	        String smallest = "";
	        String largest = "";
	        String sub="";
	        List<String> substrings=new ArrayList<>();
	        for(int i=0; i<=s.length()-k; i++){
	            sub=s.substring(i, i+k);
	            substrings.add(sub);
	        }
	        System.out.println(substrings);
	        Collections.sort(substrings);
	        System.out.println(substrings);
	        Object[] arrayOfsubs= new Object[substrings.size()];
	        arrayOfsubs=substrings.toArray();
	        smallest=(String)arrayOfsubs[0];
	        largest=(String) arrayOfsubs[substrings.size()-1];
	        
	        // Complete the function
	        // 'smallest' must be the lexicographically smallest substring of length 'k'
	        // 'largest' must be the lexicographically largest substring of length 'k'
	        
	        return smallest + "\n" + largest;
	    }


	    
	}


