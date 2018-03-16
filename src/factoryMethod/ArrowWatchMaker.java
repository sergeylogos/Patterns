package factoryMethod;

public class ArrowWatchMaker implements WatchMaker {
    @Override
    public Watch createWatch() {
        return new ArrowWatch();
    }
}
