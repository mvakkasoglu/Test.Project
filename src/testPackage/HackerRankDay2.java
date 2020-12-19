package testPackage;

import java.util.Scanner;

public class HackerRankDay2 {
	// Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip = meal_cost*((double)tip_percent)/100.0;
        System.out.println("tip: " + tip);
        double tax = meal_cost*((double)tax_percent)/100.0;
        System.out.println("tax: " + tax);
        meal_cost = meal_cost + tip + tax;
        System.out.println("meal: " + meal_cost);
//        System.out.print((int)(meal_cost + 0.5));
        System.out.println("You will pay: " + (int)Math.round(meal_cost));


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	System.out.println("Enter meal cost(double)");
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        System.out.println("Enter tip percent(int)");
        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println("Enter tax percent(int)");
        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }

}
