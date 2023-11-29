package Task1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(); //экземпляр класса
        cat.setName("barsic");
        System.out.println(cat.getName());
        Dog dog = new Dog("max",new Chumka("chumka"), "petr",
                LocalDate.of(3,12,21));
        //System.out.println(dog.getName());
        //System.out.println(dog.getIllness());
        //dog.getIllness().heal();
        Duck duck = new Duck();
        duck.setName("Donald");
        System.out.println(duck.getName());
        duck.liveCycle();
        Bear bear = new Bear();
        bear.setName("Kosolap");
        System.out.println(bear.getName());
//        dog.toWakeUp("13:22");
//        cat.toWakeUp();
        ArrayList <Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(duck);
        animals.add(bear);
        cat.liveCycle();
        dog.breathe();
    }
}
