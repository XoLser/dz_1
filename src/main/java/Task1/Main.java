package Task1;

import Task1.AllAnimals.*;
import Task1.InterfaceAllAnimals.Dive;
import Task1.PersonalCliniks.Doctor;
import Task1.PersonalCliniks.Nurse;
import Task1.PersonalCliniks.Personal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(); //экземпляр класса
        cat.setName("barsic");
        Dog dog = new Dog("max",new Chumka("chumka"), "petr",
                LocalDate.of(3,12,21));
        //System.out.println(dog.getName());
        //System.out.println(dog.getIllness());
        //dog.getIllness().heal();
        Duck duck = new Duck();
        duck.setName("Donald");
        Bear bear;
        bear = new Bear();
        bear.setName("Kosolap");
        System.out.println(bear);
        System.out.print("Скорость ходьбы : ");
        System.out.println(bear.getRunSpeed());
        System.out.print("Скорость плавания : ");
        System.out.println(bear.getSwimSpeed());
        Rabbit rabbit = new Rabbit();
        rabbit.setName("Jon");
        System.out.println(rabbit);
        System.out.print("Скорость ходьбы : ");
        System.out.println(rabbit.getRunSpeed());
        System.out.print("Высота прыжка : ");
        System.out.println(rabbit.getJumpUp());
        Fish fish = new Fish();
        fish.setName("Lo");
        System.out.println(fish);
        System.out.print("Скорость плавания : ");
        System.out.println(fish.getSwimSpeed());
        System.out.print("Глубина ныряния : ");
        System.out.println(fish.getDive());
        Doctor doctor = new Doctor();
        doctor.setName("Dr.Who");
        System.out.println(doctor);
        doctor.workDayDoctor();
        Nurse nurse = new Nurse();
        nurse.setName("Eli");
        nurse.workDayNurse();



//        dog.toWakeUp("13:22");
//        cat.toWakeUp();
        ArrayList <Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(duck);
        animals.add(bear);
        animals.add(fish);
        ArrayList <Personal> personals = new ArrayList<>();
        personals.add(doctor);
        personals.add(nurse);
    }
}
