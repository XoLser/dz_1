package Task1.InterfaceAllAnimals;

public interface Goable {
    public static final String type = "Goable";
    void run();
    default double getRunSpeed(){
        return 1.1;
    }
}
