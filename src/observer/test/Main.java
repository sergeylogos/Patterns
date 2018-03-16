package observer.test;

public class Main {
    public static void main(String[] args) {

        Chanel chanel = new Chanel();
        chanel.setChanelName("ictv");
        chanel.setChanelNumber(11);

        chanel.addSubscribers(new Subscriber("sergey.okten@gmail.com", "serjokten"));
        chanel.addSubscribers(new Subscriber("sergey.logos@gmail.com", "serjLogos"));
        chanel.addSubscribers(new Subscriber("sergey.z873@gmail.com", "serjz873"));


        chanel.postNews("poroshenko dead");

    }
}
