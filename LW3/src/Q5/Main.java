package Q5;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    // Arrays for menu items and prices
    static String[] entrees = {"Tofu Burger", "Cajun Chicken", "Buffalo Wings", "Rainbow Fillet"};
    static double[] entreePrices = {3.49, 4.59, 3.99, 2.99};

    static String[] sideDishes = {"Rice Cracker", "No-Salt Fries", "Zucchini", "Brown Rice"};
    static double[] sidePrices = {0.79, 0.69, 1.09, 0.59};

    static String[] drinks = {"Cafe Mocha", "Cafe Latte", "Espresso", "Oolong Tea"};
    static double[] drinkPrices = {1.99, 1.90, 2.49, 0.99};

    // Order storage
    static String[] orderedItems = new String[100];
    static double[] orderedPrices = new double[100];
    static int[] orderedQuantities = new int[100];
    static int orderCount = 0;

    public static void main(String[] args) {

        int categoryChoice;

        do {
            displayCategories();

            System.out.print("Choose a category (1-3) or 0 to Exit: ");
            categoryChoice = scanner.nextInt();

            switch (categoryChoice) {

                case 1:
                    orderItem(entrees, entreePrices, "Entree");
                    break;

                case 2:
                    orderItem(sideDishes, sidePrices, "Side Dish");
                    break;

                case 3:
                    orderItem(drinks, drinkPrices, "Drink");
                    break;

                case 0:
                    System.out.println("\nExiting...");
                    break;

                default:
                    System.out.println("Invalid category selection!");
            }

        } while (categoryChoice != 0);

        printOrderSummary();

        scanner.close();
    }

    // Display main categories
    public static void displayCategories() {
        System.out.println("\n===== MyJava Burgers Menu =====");
        System.out.println("1. Entree");
        System.out.println("2. Side Dish");
        System.out.println("3. Drink");
        System.out.println("0. Exit");
    }

    // Display items and place order
    public static void orderItem(String[] items, double[] prices, String category) {

        System.out.println("\n--- " + category + " Menu ---");

        for (int i = 0; i < items.length; i++) {
            System.out.printf("%d. %s - $%.2f%n", i + 1, items[i], prices[i]);
        }

        System.out.print("Enter Item ID: ");
        int itemId = scanner.nextInt();

        if (itemId >= 1 && itemId <= items.length) {

            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();

            orderedItems[orderCount] = items[itemId - 1];
            orderedPrices[orderCount] = prices[itemId - 1];
            orderedQuantities[orderCount] = quantity;

            orderCount++;

            System.out.println("Item added successfully!");

        } else {
            System.out.println("Invalid item ID!");
        }
    }

    // Print bill summary
    public static void printOrderSummary() {

        System.out.println("\n========== ORDER SUMMARY ==========");

        double total = 0;

        if (orderCount == 0) {
            System.out.println("No items ordered.");
            return;
        }

        System.out.printf("%-20s %-10s %-10s %-10s%n",
                "Item", "Price", "Qty", "Subtotal");

        for (int i = 0; i < orderCount; i++) {

            double subtotal = orderedPrices[i] * orderedQuantities[i];
            total += subtotal;

            System.out.printf("%-20s $%-9.2f %-10d $%-10.2f%n",
                    orderedItems[i],
                    orderedPrices[i],
                    orderedQuantities[i],
                    subtotal);
        }

        System.out.println("-------------------------------------");
        System.out.printf("Overall Total: $%.2f%n", total);
    }
}