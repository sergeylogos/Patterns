package factoryMethod;

public class Main {
    public static void main(String[] args) {

        Watch watch = factory("digit").createWatch();
        watch.showTime();

    }

    public static WatchMaker factory(String type) {


        WatchMaker watchMaker = null;
        if (type.equalsIgnoreCase("digit")) {
            watchMaker = new DigitalWatchMaker();
        }

        if (type.equalsIgnoreCase("arrow")) {
            watchMaker = new ArrowWatchMaker();
        }

        return watchMaker;
    }
}
