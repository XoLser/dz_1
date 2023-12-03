package Task1.InterfaceAllAnimals;

public interface Jumpable extends Goable{
    static String type = "Jumpable";
    void jump();
    default double getJumpUp() {
        return 10.0 ;
    }
}
