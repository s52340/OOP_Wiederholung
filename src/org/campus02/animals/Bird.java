package org.campus02.animals;

public class Bird extends  Animal implements Flyable{
    public Bird(String color, int countEyes, String name) {
        super(color, countEyes, name);
    }

    @Override
    public void walk() {
        System.out.println(getName() + " wackelt auf den Beinen");
    }

    @Override
    public void makeNoise() {
        System.out.println(getName() + " macht ein >>piiiep<<");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " fliegt im Käfig herum");
    }
}
