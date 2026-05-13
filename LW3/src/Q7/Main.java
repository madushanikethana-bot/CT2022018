package Q7;

import java.util.Scanner;

public class Main {

    // Method to count digits
    public static int countDigits(int number) {

        // Special case for 0
        if (number == 0) {
            return 1;
        }

        int count = 0;

        while (number != 0) {
            number = number / 10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Enter an integer (negative to stop): ");
            int num = scanner.nextInt();

            // Stop if negative
            if (num < 0) {
                System.out.println("Program stopped.");
                break;
            }

            // Call method and display result
            int digits = countDigits(num);

            System.out.println(num + " has " + digits + " digit(s).");
        }

        scanner.close();
    }
}