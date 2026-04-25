package Q3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String first = input.nextLine();

        System.out.print("Enter Middle Name: ");
        String middle = input.nextLine();

        System.out.print("Enter Last Name: ");
        String last = input.nextLine();

        System.out.println(first + " " + middle.charAt(0) + ". " + last);
    }
}