package Q6;

public class Main {

    public static void main(String[] args) {

        for (int i = 10; i <= 49; i++) {

            System.out.print(i + " ");

            // Move to next line after every 10 numbers
            if (i % 10 == 9) {
                System.out.println();
            }
        }
    }
}