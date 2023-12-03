package Task1.AllAnimals;

import Task1.Illness;

import java.time.LocalDate;

public class Cat extends Animal {
    public Cat() {
        super();
    }

    public Cat(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }

}
