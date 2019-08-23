
package petgame3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public abstract class Pets 
{
    //Player play = new Player();
    Scanner scan = new Scanner(System.in);
    static String name;
    static int age;
    int day = 1;
    public Pets (String name,int age)
    {
       Pets.name = name;
       Pets.age = age;
    }
    
    Random rand = new Random();
    int full = Math.abs(rand.nextInt(100));
    int mood = Math.abs(rand.nextInt(100));
    int energy = Math.abs(rand.nextInt(100));
  
    public  void feed(){
       
        mood += Math.abs(rand.nextInt(100));
        energy += Math.abs(rand.nextInt(100));
        full += Math.abs(rand.nextInt(100));
        System.out.println(name+":Yummm");
        System.out.println("Mood:" +mood+  "Energy:" +energy+ "full:"+full);
    }
    
    public void sleep(){
        
        mood += Math.abs(rand.nextInt(100));
        energy += Math.abs(rand.nextInt(100));
        full += Math.abs(rand.nextInt(100));
        System.out.println(name+"ZZZZzzz..");
        System.out.println("Mood:" +mood+  "Energy:" +energy+ "full:"+full );
   }
    
    public void play(){
       
        mood += Math.abs(rand.nextInt(100));
        energy -= Math.abs(rand.nextInt(100));
        full -= Math.abs(rand.nextInt(100));
        System.out.println(name+"YAyyyy");
        System.out.println("Mood:" +mood+  "Energy:" +energy+ "full:"+full );
   } 
   public abstract void talk (); 
    
//   public  void call() throws IOException
//   {
//        //Player.writeFile();
//        
//         System.out.println("Hello " +Player.username+ " give your new pet a name :D");
//         name = scan.nextLine();
//         Player.writeFile();
//         System.out.println(""+name+":Thank you!, How old am i owner");
//         Pets.age = scan.nextInt();
//         System.out.println("I'm"+" " + Pets.name + " & " + Pets.age + "years old");      
//         //Player.writeFile();
//   }
   
       public static void pets() 
       {
           try {
        File file = new File("Pets.txt"); 
        BufferedReader br = new BufferedReader(new FileReader(file)); 
        String st; 
        while ((st = br.readLine()) != null) 
        System.out.println(st); 
       }catch (IOException e) {}
       
       }
       public void actions(){
       String[] s = {""+name+":I'm Hungry", ""+name+":I'm Sleepy", ""+name+":I'm Bored"};

        Random ran = new Random();
        String s_ran = s[ran.nextInt(s.length)];
        System.out.println(s_ran);
        System.out.println("Hey," +Player.username+ "Please choose an action 1.feed 2.play 3.sleep 4.talk");
       }
       
}
            


     
     
    

