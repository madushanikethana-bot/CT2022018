import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        // Input word
        System.out.print("Enter an odd-length word: ");
        String word = x.nextLine();

        // Find middle position
        int middle = word.length() / 2;

        // Get middle character
        char middleChar = word.charAt(middle);

        // Output
        System.out.println("Middle character: " + middleChar);

        x.close();
    }
}