package petgame3;

import java.util.Scanner;

public class Rabbit extends Pets{

    public Rabbit(String name, int age) {
        super(name, age);
    }
    @Override
    public void talk(){
        mood = Math.abs(rand.nextInt(100));
        energy =Math.abs(rand.nextInt(100));

        System.out.println(name+"kekekeke");
        System.out.println("Mood:" +mood+  "Energy:" +energy+ "full:"+full );

    }
     public void RabbitInfo()
     {
         Scanner sc = new Scanner(System.in);
         for(int i = 0; i < 3; i++){
         actions();
         int select = sc.nextInt();
         
         if(select == 1){
             System.out.println("Your Rabbit," +name+ "is eating");
             feed();
         }
         if(select == 2)
         {   
             System.out.println("Your Rabbit," +name+ "is playing");
             play();
         }
         if(select == 3)
         {   
             System.out.println("Your Rabbit," +name+ "is sleeping");
             sleep();
         }
         if(select == 4)
         {   
             System.out.println("Your Rabbit," +name+ "is Barking");
             talk();
         }
         }
         sleep();
         System.out.println("Its the end of the day :) Your Rabbit is sleeping");
         System.out.println("Its a new day");
     }
     
}