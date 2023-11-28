//Triangle Validator
import java.util.Scanner;

public class Q1 {
    // Create a Scanner object to read input from the console
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Prompt the user to input three sides of a triangle
        System.out.println("3 sides triangle:");
        int a = input.nextInt();  // Read the first side
        int b = input.nextInt();  // Read the second side
        int c = input.nextInt();  // Read the third side

        // Check if the entered sides can form a triangle and print the result
        boolean result = can_form_triangle(a, b, c);
        System.out.println(result);
    }

    // Function to check if three given sides can form a triangle
    public static boolean can_form_triangle(int a, int b, int c) {
        // The function returns true if the sum of any two sides is greater than the third side for all combinations
        // This is a basic condition for the sides to form a valid triangle
        return a < b + c && b < a + c && c < a + b;
    }
}
———————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————
import java.util.Scanner;

public class Q2 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give distance in kilometers");
        double distance = input.nextDouble();
        System.out.println("Total: "+ taxi(distance));




    }
    public static double taxi(double distance){
        int basefare = 400;// in cents for easier calculation
        int pricepermeter = 25; //also in cents but made it int for easier calc
        int distanceinmeters = (int) (distance * 1000);
        int fare = basefare + pricepermeter * (distanceinmeters / 140);
        return fare / 100;

    }
}

———————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————
import java.util.Scanner;

public class Q3 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Conversion factors
        double inchestocm = 2.54;
        int feettocm = 30;
        double yardstometers = 0.91;
        double milestokm = 1.6;

        // Display menu for unit conversion options
        System.out.println("Choose one of 4 options" +
                "1.Inches to centimeters (Input inches)\n" +
                "2.feet to centimeters (Input feet)\n" +
                "3. yards to meters (input yards)\n" +
                "4.miles to kilometers (input miles):\n");
        int choice = input.nextInt();  // Read user's choice

        // Perform the chosen conversion based on user's input
        if (choice == 1) {
            System.out.println("How many inches do you want to input:");
            double inches1 = input.nextDouble();
            System.out.println(inches(inches1));
        } else if (choice == 2) {
            System.out.println("How many feet do you want to input:");
            double feet1 = input.nextDouble();
            System.out.println(feet(feet1));
        } else if (choice == 3) {
            System.out.println("How many yards do you want to input:");
            double yards1 = input.nextDouble();
            System.out.println(yards(yards1));
        } else if (choice == 4) {
            System.out.println("How many miles do you want to input:");
            double miles1 = input.nextDouble();
            System.out.println(miles(miles1));
        }
    }

    // Convert inches to centimeters
    public static String inches(double inches) {
        double inchestocm = 2.54;
        double calculate = inches * inchestocm;
        return "You have " + calculate + " centimeters";
    }

    // Convert feet to centimeters
    public static String feet(double feet) {
        double feettocm = 30;
        double calculate = feet * feettocm;
        return "You have " + calculate + " centimeters";
    }

    // Convert yards to meters
    public static String yards(double yards) {
        double yardstometers = 0.91;
        double calculate = yards * yardstometers;
        return "You have " + calculate + " meters";
    }

    // Convert miles to kilometers
    public static String miles(double miles) {
        double milestokm = 1.6;
        double calculate = miles * milestokm;
        return "You have " + calculate + " kilometers";
    }
}

———————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————

import java.util.Scanner;

public class Q4 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input 3 cities:");
        String first_city = input.nextLine();
        String second_city = input.nextLine();
        String third_city = input.nextLine();
        System.out.println(cities(first_city, second_city, third_city));
    }
    // Really easy problem, just take in 3 cities, find the length of the cities and then add them all up and divide by 3 to find average
    public static int cities(String first_city, String second_city, String third_city){
        int length_firstcity = first_city.length();
        int length_secondcity = second_city.length();
        int length_thirdcity = third_city.length();

        return (length_firstcity + length_secondcity + length_thirdcity)/3;
    }
}

———————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————
//Another Average problem also simple
import java.util.Scanner;

public class Q5 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input 3 scores:");
        int s1 = input.nextInt();
        int s2 = input.nextInt();
        int s3 = input.nextInt();
        System.out.println(score(s1, s2, s3));
    }
  //take in 3 inputs, sum and divide by 3 for average EASY EASY stuff
    public static boolean score(int s1, int s2, int s3){
        System.out.println("Input 3 scores:");
        return ((s1 + s2 + s3) / 3) >= 25;
    }
}

———————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————

import java.util.Scanner;

public class Q6 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("input length:");
        int length = input.nextInt();
        System.out.println("input width");
        int width = input.nextInt();

        System.out.println(size1(length, width));
    }
    // Checks if the size is applicable for certain requirements
    // in this case greater than or equal to 2600 and less than 10000 otherwise false
    public static boolean size1(int length, int width){
       int calculate = length * width;
       return 2600 <= calculate && calculate < 10000;


    }
}

———————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————


import java.util.Scanner;

public class Q7 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Prompt the user to enter the cost of the purchase
        System.out.print("Enter the cost of the purchase: $");
        double cost = input.nextDouble();

        // Prompt the user to enter the amount tendered
        System.out.print("Enter the amount tendered: $");
        double amountTendered = input.nextDouble();

        // Calculate the change and display it
        double change = calculateChange(cost, amountTendered);
        displayChange(change);
    }

    // Function to calculate the change by subtracting the cost from the amount tendered
    public static double calculateChange(double cost, double amountTendered) {
        return amountTendered - cost;
    }

    // Function to display the optimal change in terms of different coin denominations
    public static void displayChange(double change) {
        System.out.println("Optimal Change:");

        // Calculate the number of toonies (a $2 coin)
        int toonies = (int) (change / 2);
        change %= 2;

        // Calculate the number of loonies (a $1 coin)
        int loonies = (int) (change);
        change %= 1;

        // Calculate the number of quarters
        int quarters = (int) (change / 0.25);
        change %= 0.25;

        // Calculate the number of dimes
        int dimes = (int) (change / 0.1);
        change %= 0.1;

        // Calculate the number of nickels
        int nickels = (int) (change / 0.05);
        change %= 0.05;

        // Calculate the number of pennies
        int pennies = (int) (change / 0.01);

        // Display the calculated change in terms of different coin denominations
        System.out.println("Toonies: " + toonies);
        System.out.println("Loonies: " + loonies);
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);
    }
}
———————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————

import java.util.Scanner;

public class Q8 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double payment;
        
        // Prompt the user to enter the monthly payment
        System.out.println("Enter monthly payment: ");
        payment = input.nextDouble();
        
        // Call the displayBalance method with an initial balance of $1000 and the user-entered monthly payment
        displayBalance(1000, payment);
    }

    // Method to display the balance over time
    public static void displayBalance(double currentBalance, double monthlyPayment) {
        int months = 1;

        // Continue looping until the current balance is paid off
        while (currentBalance > 0) {
            // Calculate the new balance after applying an interest rate
            currentBalance = calculateNewBalance(currentBalance);
            
            // Subtract the monthly payment from the current balance
            currentBalance = currentBalance - monthlyPayment;
            
            // Display the month and current balance
            System.out.println("Month: " + months);
            months = months + 1;
            System.out.println("Current Balance: $" + currentBalance);
        }
    }

    // Method to calculate the new balance after applying a 1.5% interest rate
    public static double calculateNewBalance(double currentBalance) {
        return currentBalance * 1.015;
    }
}
———————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————
