package petgame3;

public class Cat extends Pets {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void talk() {                                                                 //generates random numbers to express the Cat's EXP whe it talks
        mood = mood - Math.abs(rand.nextInt(5 + 1));
        energy = energy - Math.abs(rand.nextInt(5 + 1));
        System.out.println("Meow Meow");
        System.out.println("Mood:" + mood + " Energy:" + energy + " Full:" + full);
    }

    @Override
    public void feed() {                                                                  //generates random numbers to express the Cats's EXP whe it gets fed
        full = full + Math.abs(rand.nextInt(20 + 1));
        energy = energy + Math.abs(rand.nextInt(10 + 1));
        mood = mood + Math.abs(rand.nextInt(5 + 1));
        System.out.println("Mood:" + mood + " Energy:" + energy + " Full:" + full);
    }

    @Override
    public void sleep() {
        full = full - Math.abs(rand.nextInt(5 + 1));
        energy = energy + Math.abs(rand.nextInt(20 + 1));
        mood = mood + Math.abs(rand.nextInt(7 + 1));
        System.out.println("Mood:" + mood + " Energy:" + energy + " Full:" + full);
    }

    @Override
    public void play() {
        full = full - Math.abs(rand.nextInt(20 + 1));
        energy = energy - Math.abs(rand.nextInt(7 + 1));
        mood = mood + Math.abs(rand.nextInt(20 + 1));
        System.out.println("Mood:" + mood + " Energy:" + energy + " Full:" + full);
    }
}
