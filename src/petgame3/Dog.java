package petgame3;

public class Dog extends Pets {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void talk() {
        mood = mood - Math.abs(rand.nextInt(5 + 1));
        energy = energy - Math.abs(rand.nextInt(5 + 1));
        System.out.println("Woof Woof");
        System.out.println("Mood:" + mood + " Energy:" + energy + " Full:" + full);
    }

    @Override
    public void feed() {
        full = full + Math.abs(rand.nextInt(30 + 1));
        energy = energy + Math.abs(rand.nextInt(20 + 1));
        mood = mood + Math.abs(rand.nextInt(15 + 1));

        System.out.println("Mood:" + mood + " Energy:" + energy + " Full:" + full);
    }

    @Override
    public void sleep() {
        full = full - Math.abs(rand.nextInt(10 + 1));
        energy = energy + Math.abs(rand.nextInt(30 + 1));
        mood = mood + Math.abs(rand.nextInt(15 + 1));
        System.out.println("Mood:" + mood + " Energy:" + energy + " Full:" + full);
    }

    @Override
    public void play() {
        full = full - Math.abs(rand.nextInt(20 + 1));
        energy = energy - Math.abs(rand.nextInt(15 + 1));
        mood = mood + Math.abs(rand.nextInt(30 + 1));
        System.out.println("Mood:" + mood + " Energy:" + energy + " Full:" + full);
    }
}
