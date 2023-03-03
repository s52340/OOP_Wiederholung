public class Frog extends Animal{

    public Frog(String color, int countEyes, String name) {
        super(color, countEyes, name);
    }

    @Override
    public void walk() {
        System.out.println(getName() + " are jumping");
    }

    @Override
    public void makeNoise() {
        System.out.println(getName() +" macht quak");
    }
}
