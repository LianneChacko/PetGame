
package petgame3;

import java.io.IOException;
import java.util.Scanner;

public class Dog extends Pets {

    public Dog(String name, int age) {
        super(name, age);
    }
   @Override
    public  void talk()
    {
        mood = Math.abs(rand.nextInt(100));
        energy =Math.abs(rand.nextInt(100));
        System.out.println("Woof Woof");
        System.out.println("Mood:" +mood+  "Energy:" +energy+ "full:"+full );

    }
    
     public void DogInfo()
     {
        
         Scanner sc = new Scanner(System.in);
         for(int i = 0; i < 3; i++){
         actions();
         int select = sc.nextInt();
         
         if(select == 1){
             System.out.println("Your Dog," +name+" is eating");
             
             feed();
         }
         if(select == 2)
         {   
             System.out.println("Your Dog," +name+ " 1s playing");
             play();
         }
         if(select == 3)
         {   
             System.out.println("Your Dog,"+name+" is sleeping");
             sleep();
         }
         if(select == 4)
         {   
             System.out.println("Your Dog," +name+ "is Barking");
             talk();
         }
         }
         sleep();
         System.out.println("Its the end of the day :) Your Dog" +name+ " is sleeping");
         
    
   }
}
