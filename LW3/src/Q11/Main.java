package Q11;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // Generate random number between 1 and 100
        int numberToGuess = rand.nextInt(100) + 1;

        int guess = 0;
        int attempts = 0;

        System.out.println("Welcome to the Guess the Number Game!");
        System.out.println("I have chosen a number between 1 and 100.");

        // Loop until correct guess
        while (guess != numberToGuess) {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Higher! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Lower! Try again.");
            } else {
                System.out.println("Correct! You guessed the number.");
                System.out.println("Total attempts: " + attempts);
            }
        }

        input.close();
    }
}