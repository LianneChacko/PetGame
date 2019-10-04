package petgame3;

public class Rabbit extends Pets {

    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public void talk() {
        mood = mood- Math.abs(rand.nextInt(5+1));
        energy = energy -Math.abs(rand.nextInt(5+1));

        System.out.println(name + "kekekeke");
        System.out.println("Mood:" + mood + " Energy:" + energy + " Full:" + full);

    }

    @Override
    public void feed() {
        full = full + Math.abs(rand.nextInt(10 + 1));
        energy = energy + Math.abs(rand.nextInt(7 + 1));
        mood = mood + Math.abs(rand.nextInt(5 + 1));
        System.out.println("Mood:" + mood + " Energy:" + energy + " Full:" + full);

    }

    @Override
    public void sleep() {
        full = full - Math.abs(rand.nextInt(5 + 1));
        energy = energy + Math.abs(rand.nextInt(10 + 1));
        mood = mood + Math.abs(rand.nextInt(7 + 1));
        System.out.println("Mood:" + mood + " Energy:" + energy + " Full:" + full);

    }

    @Override
    public void play() {
        full = full - Math.abs(rand.nextInt(7 + 1));
        energy = energy - Math.abs(rand.nextInt(5 + 1));
        mood = mood + Math.abs(rand.nextInt(10 + 1));
        System.out.println("Mood:" + mood + " Energy:" + energy + " Full:" + full);
    }

}
