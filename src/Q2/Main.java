package Q2;

import javax.swing.JFrame;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String first = input.nextLine();

        System.out.print("Enter Last Name: ");
        String last = input.nextLine();

        JFrame frame = new JFrame(first + " " + last);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}