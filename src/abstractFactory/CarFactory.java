package abstractFactory;

public class CarFactory implements Factory{
    @Override
    public Technika createTypeOne() {
        return new SimpleCar();
    }

    @Override
    public Technika createTypeTwo() {
        return new SuperCar();
    }
}
