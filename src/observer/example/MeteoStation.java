package observer.example;

import java.util.ArrayList;
import java.util.List;

public class MeteoStation implements Observable {
    private int temp;
    private int press;
    List<Observer> observers = new ArrayList<>();

    public void setMesurements(int t, int p) {
        this.temp = t;
        this.press = p;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.handleEvent(temp, press));
    }

}
