package petgame3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;
import static petgame3.Pets.name;

public class Player {

    static String username;

    public static void writeFile() throws IOException {                                //writes the players username, dogs name and age to a file
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name:");
        username = scan.nextLine();
        System.out.println("Hello " + Player.username + " give your new pet a name :D");
        Pets.name = scan.nextLine();
        System.out.println("" + name + ":Thank you!, How old am i owner");
        Pets.age = scan.nextInt();      
        System.out.println("I'm" + " " + Pets.name + " & " + Pets.age + " years old");
        System.out.println("************************************************************************");
        try (BufferedWriter w = new BufferedWriter(new FileWriter("files.txt", true))) {
            Formatter f = new Formatter(w);  // allows to format the userinput in file
            //doesn't appened.

            w.write("Owner username:" + username);
            w.newLine();
            w.write("Pets name:" + Pets.name);
            w.newLine();
            w.write("Pets age:" + Pets.age);
            w.newLine();
        } catch (IOException e) {
        }
    }

}
