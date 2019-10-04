package petgame3;

public class Hamster extends Pets {

    public Hamster(String name, int age) {
        super(name, age);
    }

    @Override
    public void talk() {                                                                  //generates random numbers to express the Hamster's EXP whe it talks
        mood = mood - Math.abs(rand.nextInt(5 + 1));
        energy = energy - Math.abs(rand.nextInt(5 + 1));
        System.out.println("munchmunchmunch");
        System.out.println("Mood:" + mood + " Energy:" + energy + " Full:" + full);
    }

    @Override
    public void feed() {                                                                     //generates random numbers to express the Hamster's EXP when it gets fed
        full = full + Math.abs(rand.nextInt(7 + 1));
        energy = energy + Math.abs(rand.nextInt(5 + 1));
        mood = mood + Math.abs(rand.nextInt(2 + 1));
        System.out.println("Mood:" + mood + " Energy:" + energy + " Full:" + full);

    }

    @Override
    public void sleep() {                                                                    //generates random numbers to express the Hamster's EXP when it talks
        full = full - Math.abs(rand.nextInt(2 + 1));
        energy = energy + Math.abs(rand.nextInt(7 + 1));
        mood = mood + Math.abs(rand.nextInt(5 + 1));
        System.out.println("Mood:" + mood + " Energy:" + energy + " Full:" + full);

    }

    @Override
    public void play() {
        full = full - Math.abs(rand.nextInt(5 + 1));
        energy = energy - Math.abs(rand.nextInt(2 + 1));
        mood = mood + Math.abs(rand.nextInt(7 + 1));
        System.out.println("Mood:" + mood + " Energy:" + energy + " Full:" + full);
    }
}
