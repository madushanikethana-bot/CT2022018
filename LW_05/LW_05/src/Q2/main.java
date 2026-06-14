package Q2;

import java.util.Scanner;

public class main {


    public static  void main(String[] args){
         Pet[] pets = new Pet[10];

         Scanner scanner = new Scanner(System.in);
        String name;
        char type;
        int petIndex = 0;
        while(true){
             System.out.println("Enter the Name of the Pet :");
             name = scanner.nextLine();
             if(name.equalsIgnoreCase("STOP")){
                 break;
             }
            System.out.println("Enter the Type of the Pet :");
             type = scanner.nextLine().charAt(0);
             Pet pet = new Pet();
             if(type == 'c'){
                  pet = new Cat();
             }
             else if(type == 'd'){
                 pet = new Dog();
             }

             pet.setName(name);
             pet.setPetType(type);
             pets[petIndex] = pet;
             petIndex++;

         }


        for(int j = 0; j<petIndex;j++){
            System.out.println("Pet Name :"+pets[j].getName()+ " Pet Type :"+  pets[j].getpetType());
        }




    }

}
