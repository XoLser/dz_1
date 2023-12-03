package Task1.AllAnimals;

import Task1.Illness;

import java.time.LocalDate;

public class Dog extends Animal {
    public Dog() {
        super();
    }

    public Dog(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }
}
