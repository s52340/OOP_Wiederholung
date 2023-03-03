public class Cat extends Animal{

    public Cat(String color, int countEyes, String name) {
        super(color, countEyes, name);
    }

    @Override
    public void walk() {
        System.out.println(getName() + " bewegt sich langsam");
    }

    @Override
    public void makeNoise() {
        System.out.println(getName() + " macht >>miau<<");
    }
}
