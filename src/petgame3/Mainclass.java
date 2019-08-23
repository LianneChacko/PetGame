
package petgame3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Mainclass 
        
{
  static String username;
  
    public static void main(String[] args) throws IOException
    {
        Dog dog = new Dog (Pets.name,Pets.age);
        Cat cat = new Cat (Pets.name,Pets.age);
        Rabbit rabbit = new Rabbit (Pets.name,Pets.age);
        Hamster hamster = new Hamster (Pets.name,Pets.age);
       
        Pets.pets();
        Scanner scan = new Scanner (System.in);
        String choice = scan.nextLine();
        if (choice.equals("1")||choice.equalsIgnoreCase("dog")) 
        {
            
           
            Player.writeFile();
           
            dog.DogInfo();
        }
         if (choice.equals("2")||choice.equalsIgnoreCase("Cat"))
        {
            
            Player.writeFile();
            cat.CatInfo();
            
        }
         if (choice.equals("3")||choice.equalsIgnoreCase("Rabbit"))
        {
            Player.writeFile();
            rabbit.RabbitInfo();
        }
         else if (choice.equals("4")||choice.equalsIgnoreCase("Hamster"))
        {
            
           Player.writeFile();
            
            hamster.HamsterInfo();
     
        }
    }
}