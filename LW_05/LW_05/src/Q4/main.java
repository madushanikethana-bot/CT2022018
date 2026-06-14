package Q4;

import Q1.Pet;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pet[] petArray = new Pet[100];
        int petCount = 0;

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
                petArray[petCount] = cat;
            } else if (type == 'd') {
                Dog dog = new Dog();
                dog.setName(name);
                System.out.print("Enter weight (kg): ");
                dog.setWeight(scanner.nextDouble());
                scanner.nextLine();
                petArray[petCount] = dog;
            } else {
                System.out.println("Invalid type.");
                continue;
            }
            petCount++;
        }

        System.out.println("\n--- Detailed Pet List ---");
        for (int i = 0; i < petCount; i++) {
            if (petArray[i] instanceof Cat) {
                Cat c = (Cat) petArray[i];
                System.out.println("Cat -> Name: " + c.getName() + ", Coat Color: " + c.getCoatColor());
            } else if (petArray[i] instanceof Dog) {
                Dog d = (Dog) petArray[i];
                System.out.println("Dog -> Name: " + d.getName() + ", Weight: " + d.getWeight() + "kg");
            }
        }
    }
}