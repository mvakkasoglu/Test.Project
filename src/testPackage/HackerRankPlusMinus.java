package testPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HackerRankPlusMinus {
	

	    // Complete the plusMinus function below.
	    static void plusMinus(int[] arr) {

	List<Integer> plus = new ArrayList<>();
	List<Integer> minus = new ArrayList<>();
	List<Integer> zero = new ArrayList<>();
	for(Integer i: arr){
	    if(i<0){
	        minus.add(i);
	    }
	    else if(i>0){
	        plus.add(i);
	    }
	    else zero.add(i);

	}
	System.out.println(plus.size()/arr.length);
	System.out.println(minus.size()/arr.length);
	System.out.println(zero.size()/arr.length);


	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int[] arr = new int[n];

	        String[] arrItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            int arrItem = Integer.parseInt(arrItems[i]);
	            arr[i] = arrItem;
	        }

	        plusMinus(arr);

	        scanner.close();
	    }
	}



