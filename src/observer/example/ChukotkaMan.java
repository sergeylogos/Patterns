package observer.example;

public class ChukotkaMan implements Observer {
    @Override
    public void handleEvent(int t, int p) {
        if (t > 0) {
            System.out.println("it is very hot!");
        }
    }
}
