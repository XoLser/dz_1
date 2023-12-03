package Task1.PersonalCliniks;


import Task1.AllAnimals.Animal;
import Task1.InterfaceAllAnimals.*;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    private List<Animal> patients = new ArrayList<>();
    public  List<Animal> getPatients(){
        return patients;
    }
    // public void addPatient(Animal patient){
    //    patients.add(patient);
    //}
    public VeterinaryClinic addPatient(Animal patient){
        patients.add(patient);
        return this;
    }
    public void removePatient(Animal patient){
        patients.remove(patient);
    }
    public List<Goable> getGoable(){
        List<Goable> result = new ArrayList<>();
        for (Animal animal:patients){
            if (animal instanceof Goable){
                result.add((Goable) animal);
            }
        }
        return result;
    }
    public List<Dive> getDive(){
        List<Dive> result = new ArrayList<>();
        for (Animal animal:patients){
            if (animal instanceof Dive){
                result.add((Dive) animal);
            }
        }
        return result;
    }
    public List<Flyable> getFlyable(){
        List<Flyable> result = new ArrayList<>();
        for (Animal animal:patients){
            if (animal instanceof Flyable){
                result.add((Flyable) animal);
            }
        }
        return result;
    }
    public List<Jumpable> getJumpable(){
        List<Jumpable> result = new ArrayList<>();
        for (Animal animal:patients){
            if (animal instanceof Jumpable){
                result.add((Jumpable) animal);
            }
        }
        return result;
    }
    public List<Swimable> getSwimable(){
        List<Swimable> result = new ArrayList<>();
        for (Animal animal:patients){
            if (animal instanceof Swimable){
                result.add((Swimable) animal);
            }
        }
        return result;
    }
}

