package Task1.InterfaceAllAnimals;

public interface Flyable {
     final String  type = "Flyable";
    void fly();
    default double getFlySpeed(){
        return  5.5;
    }
}
