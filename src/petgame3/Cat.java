package petgame3;

import java.util.Scanner;
    public class Cat extends Pets
{

    public Cat(String name, int age) {
        super(name, age);
    }
    @Override
    public void talk(){
        mood = Math.abs(rand.nextInt(100));
        energy =Math.abs(rand.nextInt(100));

        System.out.println(name+"Meeeow");
        System.out.println("Mood:" +mood+  "Energy:" +energy+ "full:"+full );

    }
     public void CatInfo()
     {
         
         Scanner sc = new Scanner(System.in);
         for(int i = 0; i < 3; i++){
         int select = sc.nextInt();
         
         if(select == 1)
         {
             
             System.out.println("Your Cat"+Pets.name+" is eating");
             feed();
         }
         if(select == 2)
         {   
             System.out.println("Your Cat"+name+"is playing");
             play();
         }
         if(select == 3)
         {   
             System.out.println("Your Cat"+name+"is sleeping");
             sleep();
         }
         if(select == 4)
         {   
             System.out.println("Your Cat"+name+" is Meowing");
             talk();
         }
         }
         sleep();
         System.out.println("Its the end of the day :) Your Cat" + name + "is sleeping");
         
     }
}
