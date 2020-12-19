package testPackage;

import java.util.Scanner;

public class HackerRankStaircase {
//	Print a staircase of size n using # symbols and spaces.

	    // Complete the staircase function below.
	    static void staircase(int n) {
	        int star = 1, space = n-1;
	        while(n > 0){
	            for(int i = 0; i < space; i++){
	                System.out.print(" ");
	            }
	            for(int i = 0; i < star; i++){
	                System.out.print("#");
	            }
	            star = star + 1;
	            space = space - 1;
	            --n;
	            System.out.println("");
	        }

	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        staircase(n);

	        scanner.close();
	    }
	}



