package Task1.InterfaceAllAnimals;

public interface Swimable {
    static final String type = "Swimable";
    void swim();
    default double getSwimSpeed(){
        return 3.3;
    }

}
