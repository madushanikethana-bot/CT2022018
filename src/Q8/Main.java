package Q8;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String text = input.nextLine();

        String[] parts = text.split("!");

        System.out.println(parts[0].trim());
        System.out.println(parts[1].trim());
    }
}
