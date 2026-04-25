package Q6;

import javax.swing.JFrame;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int w = input.nextInt();
        int h = input.nextInt();
        input.nextLine();

        String title = input.nextLine();

        JFrame frame = new JFrame(title);
        frame.setSize(w, h);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}