package Task1.AllAnimals;

import Task1.Illness;
import Task1.InterfaceAllAnimals.Goable;
import Task1.InterfaceAllAnimals.Swimable;

import java.time.LocalDate;

public class Bear extends Animal implements Goable, Swimable{
    public Bear() {
        super();
    }
    public Bear(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }
    @Override
    public double getRunSpeed() {
        return Goable.super.getRunSpeed();
    }

    @Override
    public double getSwimSpeed() {
        return Swimable.super.getSwimSpeed();
    }

    public void run() {
    System.out.println("Bear run");
    }
}
