package observer.example;

public class AfricanMan implements Observer {

    @Override
    public void handleEvent(int t, int p) {
        if (t < 40) {
            System.out.println("is to cold");
        }
    }
}
