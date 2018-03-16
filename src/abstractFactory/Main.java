package abstractFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = AbstractFactory.buildFactory("plane");
        Technika technika = factory.createTypeOne();
        technika.doSome();
    }
}
