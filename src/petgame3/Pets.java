package petgame3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public abstract class Pets {

    Scanner scan = new Scanner(System.in);
    static String name;
    static int age;
    int day = 1;
    String pettype;

    public Pets(String name, int age) {                                            
        Pets.name = name;
        Pets.age = age;
    }

    Random rand = new Random();
    int full = 100;
    int mood = 100;
    int energy =100;

    public abstract void feed() ;                                                    //These methods are overrided in the classes for each individual pet.

    public abstract void sleep() ;

    public abstract void play() ;

       
    public abstract void talk();

    public static void pets() {                                                        //this is reading the file that has instuctions
        try {
            File file = new File("Pets.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            while ((st = br.readLine()) != null) {
                System.out.println(st);
            }
        } catch (IOException e) {
            System.out.println("This file doesn't exist"+e);
        }

    }

    public void actions() {                                                            //generates prompts for the user to pick an action.
       
        String[] s = {"" + name + ":I'm Hungry", "" + name + ":I'm Sleepy", "" + name + ":I'm Bored"};

        Random ran = new Random();
        String s_ran = s[ran.nextInt(s.length)];
        System.out.println(s_ran);
        System.out.println("Hey," + Player.username + " Please choose an action 1.feed 2.play 3.sleep 4.talk");
    }

    public void petInfo(String petType) {                                              //Gets the pets status and also where the day changes in the game
        this.pettype = petType;

        Scanner sc = new Scanner(System.in);

        for (int n = 0; n < 3; n++) {
            System.out.println("Day " + day++ + " Begins!");
            for (int i = 0; i < 3; i++) {
                
                actions();
                int select = sc.nextInt();
                if (select == 1) {
                    System.out.println("Your " + petType + " " + name + " is eating");
                    System.out.println( " " + name + ":Yummmm");
                    feed();
                }
                if (select == 2) {
                    System.out.println("Your " + petType + " " + name + " is playing");
                    System.out.println( " " + name + ":Yayyyyyy");
                    play();
                }
                if (select == 3) {
                    System.out.println("Your " + petType + " " + name + " is sleeping");
                    System.out.println( " " + name + ":ZZZZZzzzz");
                    sleep();
                }
                if (select == 4) {
                    System.out.println("Your " + petType + " " + name + " is talking");
                
                    talk();
                }
            }
            
            System.out.println("************************************************************************");
            System.out.println("Its the end of the day :) Your Hamster is sleeping");
            sleep();
            System.out.println(" " +name+ " is " + Pets.age++ + " years old now :)");
 
        }System.out.println("GAME OVER");
    }
}
