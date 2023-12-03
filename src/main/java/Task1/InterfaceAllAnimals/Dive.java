package Task1.InterfaceAllAnimals;

public interface Dive extends Swimable{
    static String type = "Dive";

    default double getDive() {
        return -20.0;
    }
}
