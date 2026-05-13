package Q1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read three integers
        System.out.print("Enter first integer: ");
        int a = input.nextInt();

        System.out.print("Enter second integer: ");
        int b = input.nextInt();

        System.out.print("Enter third integer: ");
        int c = input.nextInt();

        // Assume the first number is the smallest
        int smallest = a;

        // Compare with second number
        if (b < smallest) {
            smallest = b;
        }

        // Compare with third number
        if (c < smallest) {
            smallest = c;
        }

        // Display the smallest number
        System.out.println("The smallest number is: " + smallest);

        input.close();
    }
}