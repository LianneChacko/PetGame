package petgame3;

import java.io.IOException;
import java.util.Scanner;

public class Mainclass {

    public static void main(String[] args) throws IOException {
        Pets dog = new Dog(Pets.name, Pets.age);
        Pets cat = new Cat(Pets.name, Pets.age);
        Pets rabbit = new Rabbit(Pets.name, Pets.age);
        Pets hamster = new Hamster(Pets.name, Pets.age);

        Pets.pets();
        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();
        if (choice.equals("1") || choice.equalsIgnoreCase("dog")) {
            Player.writeFile();
            dog.petInfo("Dog");
        }
        if (choice.equals("2") || choice.equalsIgnoreCase("Cat")) {

            Player.writeFile();
            cat.petInfo("Cat");

        }
        if (choice.equals("3") || choice.equalsIgnoreCase("Rabbit")) {
            Player.writeFile();
            rabbit.petInfo("Rabbit");
        } 
        if (choice.equals("4") || choice.equalsIgnoreCase("Hamster")) {

            Player.writeFile();
            hamster.petInfo("Hamster");

        }
    }
}
