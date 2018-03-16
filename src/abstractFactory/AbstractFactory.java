package abstractFactory;

public abstract class AbstractFactory {


    public static Factory buildFactory(String type) {
        Factory factory = null;
        if (type.equalsIgnoreCase("car")) factory = new CarFactory();
        if (type.equalsIgnoreCase("plane")) factory = new PlaneFactory();
        return factory;
    }

}
