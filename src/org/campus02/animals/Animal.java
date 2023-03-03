public abstract class Animal {
    private String color;
    private int countEyes;
    private String name;


    public Animal(String color, int countEyes, String name) {
        this.color = color;
        this.countEyes = countEyes;
        this.name = name;
    }

    public abstract void walk();
    public abstract void makeNoise();


    public String getColor() {
        return color;
    }

    public int getCountEyes() {
        return countEyes;
    }

    public String getName() {
        return name;
    }
}
