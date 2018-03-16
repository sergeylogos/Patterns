package abstractFactory;

public class PlaneFactory implements Factory {
    @Override
    public Technika createTypeOne() {
        return new SimplePlane();
    }

    @Override
    public Technika createTypeTwo() {
        return new SuperPlane();
    }
}
