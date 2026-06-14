import Q1.Pet;
import  Q1.Dog;
import  Q1.Cat;
import java.util.Scanner;
import java.util.*;

public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Pet pet = new Pet();
        System.out.println("Enter a Pet type : ");
        String petType =  scanner.nextLine();
        String name;
        if(petType.charAt(0) == 'c'){
            Cat cat = new Cat();
            System.out.println("Enter the Name of your Cat :");
            name = scanner.nextLine();
            pet.setName(name);
            System.out.println("HI ! , I'm "+pet.getName());
            System.out.println(cat.speak());
        }
        else if(petType.charAt(0) == 'd'){
            Dog dog = new Dog();
            System.out.println("Enter the Name of your Dog :");
            name = scanner.nextLine();
            pet.setName(name);
            System.out.println("HI !,I 'm "+pet.getName() );
            System.out.println(dog.speak());

        }



    }
}