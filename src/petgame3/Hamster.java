package petgame3;

import java.util.Scanner;

public class Hamster extends Pets
{
    
    public Hamster(String name, int age) {
        super(name, age);
    }
    @Override
    public void talk(){
        mood = Math.abs(rand.nextInt(100));
        energy =Math.abs(rand.nextInt(100));
        System.out.println(name+"munchmunch");
        System.out.println("Mood:" +mood+  "Energy:" +energy+ "full:"+full );

    }
     public void HamsterInfo()
     {    
         Scanner sc = new Scanner(System.in);
          
        for(int n =0; n<3;n++)
         {
         for( int i = 0; i < 3; i++)
         {   
            actions();
           int select = sc.nextInt();
            if(select == 1)
                
            {
                System.out.println("Your Hamster," +name+ "is eating");
                feed();
            }
            if(select == 2)
            {   
                System.out.println("Your Hamster," +name+ "is playing");
                play();
            }
            if(select == 3)
            {   
                System.out.println("Your Hamster," +name+ "is sleeping");
                sleep();
            }
            if(select == 4)
            {   
                System.out.println("Your Hamster," +name+ "is talking");
                talk();
            }
            } 
            System.out.println("Its the end of the day :) Your Hamster is sleeping");
            sleep();
            System.out.println("Day " +day++ + " Begins!");//while(select++<3);
            
        }
     }
}

     
