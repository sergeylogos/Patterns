package observer.example;

public class Main {
    public static void main(String[] args) {

        MeteoStation meteoStation = new MeteoStation();
        AfricanMan africanMan = new AfricanMan();
        ChukotkaMan chukotkaMan = new ChukotkaMan();

        meteoStation.addObserver(africanMan);
        meteoStation.addObserver(chukotkaMan);
        meteoStation.setMesurements(35,750);


    }
}
