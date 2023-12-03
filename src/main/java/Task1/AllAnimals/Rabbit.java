package Task1.AllAnimals;

import Task1.InterfaceAllAnimals.Jumpable;

public class Rabbit extends Animal implements Jumpable {
    @Override
    public void run() {
        System.out.println("Бежит");
    }

    @Override
    public double getRunSpeed() {
        return Jumpable.super.getRunSpeed();
    }

    @Override
    public void jump() {
        System.out.println("Прыгает");
    }

    @Override
    public double getJumpUp() {
        return Jumpable.super.getJumpUp();
    }
}
