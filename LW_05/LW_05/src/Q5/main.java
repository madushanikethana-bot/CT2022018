package Q5;

import Q1.Pet;
import Q4.Dog;
import Q4.Cat;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pet[] petArray = new Pet[100];
        int petCount = 0;
        int dogCount = 0;

        // Reuse input approach from Q4
        while (true) {
            System.out.print("Enter pet name (or 'STOP' to finish): ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("STOP")) {
                break;
            }
            System.out.print("Enter type ('c' for cat, 'd' for dog): ");
            char type = scanner.nextLine().toLowerCase().charAt(0);

            if (type == 'c') {
                Cat cat = new Cat();
                cat.setName(name);
                System.out.print("Enter coat color: ");
                cat.setCoatColor(scanner.nextLine());
                petArray[petCount++] = cat;
            } else if (type == 'd') {
                Dog dog = new Dog();
                dog.setName(name);
                System.out.print("Enter weight: ");
                dog.setWeight(scanner.nextDouble());
                scanner.nextLine();
                petArray[petCount++] = dog;
                dogCount++;
            }
        }

        // Create secondary Dog array explicitly
        Dog[] dogArray = new Dog[dogCount];
        int index = 0;
        for (int i = 0; i < petCount; i++) {
            if (petArray[i] instanceof Dog) {
                dogArray[index++] = (Dog) petArray[i];
            }
        }

        // Calculate metrics over the Dog array
        if (dogCount > 0) {
            double totalWeight = 0;
            double minWeight = dogArray[0].getWeight();
            double maxWeight = dogArray[0].getWeight();

            for (int i = 0; i < dogCount; i++) {
                double weight = dogArray[i].getWeight();
                totalWeight += weight;
                if (weight < minWeight) minWeight = weight;
                if (weight > maxWeight) maxWeight = weight;
            }

            double avgWeight = totalWeight / dogCount;

            System.out.println("\n--- Dog Weight Statistics ---");
            System.out.println("Average Weight: " + avgWeight);
            System.out.println("Minimum Weight: " + minWeight);
            System.out.println("Maximum Weight: " + maxWeight);
        } else {
            System.out.println("\nNo dogs were entered.");
        }
    }
}