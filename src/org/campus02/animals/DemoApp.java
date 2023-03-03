public class DemoApp {
    public static void main(String[] args) {
        Animal fritzi = new Cat("braun", 2, "fritzi");
        fritzi.makeNoise();
        fritzi.walk();

        Animal tweety = new Bird("gelb", 2 ,"tweety");
        tweety.makeNoise();
        tweety.walk();
        // tweety.fly();

        Flyable flyable = (Flyable) tweety;
        flyable.fly();

    }
}
