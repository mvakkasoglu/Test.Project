package testPackage;

import java.util.Scanner;

public class HackerRankDay6 {
	/*
	 * Task
Given a string,S , of length N that is indexed from 0 to N-1 , 
print its even-indexed and odd-indexed characters as 2 space-separated strings 
on a single line.*/
	public static class Solution {
		
		public static String newString(String s) {
			String a="";
			String b="";
			for(int i=0; i<s.length(); i++) {
				if(i%2==0) {
					a=a+s.charAt(i);
				}
				else b=b+s.charAt(i);
			}
			return a+ " " + b;
			
		}

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	    	Scanner scan = new Scanner(System.in);
	    	int n = scan.nextInt();
	        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        
	        
	        
	        for(int i=1; i<=n; i++) {
	        	String S = scan.next();
	        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        System.out.println(newString(S));
	        
	        	
	        }
	        

	    	
	    	scan.close();
	    }
	}

}
