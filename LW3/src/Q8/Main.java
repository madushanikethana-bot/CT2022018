package Q8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a number: ");
        int N = scanner.nextInt();

        // Print multiplication table
        System.out.println("\nMultiplication Table for " + N);

        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + (N * i));
        }

        scanner.close();
    }
}