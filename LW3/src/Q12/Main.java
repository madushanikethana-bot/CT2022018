package Q12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the sentence from the user
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        // Get the word to replace
        System.out.print("Enter the word to replace: ");
        String oldWord = input.nextLine();

        // Get the replacement word
        System.out.print("Enter the replacement word: ");
        String newWord = input.nextLine();

        // Replace the word
        String updatedSentence = sentence.replace(oldWord, newWord);

        // Display result
        System.out.println("\nUpdated sentence:");
        System.out.println(updatedSentence);

        input.close();
    }
}