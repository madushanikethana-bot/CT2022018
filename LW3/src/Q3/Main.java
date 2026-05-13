package Q3;

import java.util.Scanner;

public class Main { public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    // Get input from user
    System.out.print("Enter a power of 10 (6, 9, 12, etc.): ");
    int power = scanner.nextInt();

    // Check corresponding word
    switch (power) {
        case 6:
            System.out.println("Million");
            break;

        case 9:
            System.out.println("Billion");
            break;

        case 12:
            System.out.println("Trillion");
            break;

        case 15:
            System.out.println("Quadrillion");
            break;

        case 18:
            System.out.println("Quintillion");
            break;

        case 21:
            System.out.println("Sextillion");
            break;

        case 30:
            System.out.println("Nonillion");
            break;

        case 100:
            System.out.println("Googol");
            break;

        default:
            System.out.println("No corresponding word for this power of 10.");
    }

    scanner.close();
}
}
