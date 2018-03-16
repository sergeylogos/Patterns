package observer.test;

import java.util.ArrayList;
import java.util.List;

public class Chanel {
    public List<Subscriber> subscriberList = new ArrayList<>();
    private String chanelName;
    private int chanelNumber;


    public void addSubscribers(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    public void postNews(String news) {
        sendEmails(news);

    }


    private  void sendEmails(String news) {
        this.subscriberList.forEach(subscriber -> System.out.println("new " + news + " and send to email - " + subscriber.getEmail()));

    }

    public List<Subscriber> getSubscriberList() {
        return subscriberList;
    }

    public void setSubscriberList(List<Subscriber> subscriberList) {
        this.subscriberList = subscriberList;
    }

    public String getChanelName() {
        return chanelName;
    }

    public void setChanelName(String chanelName) {
        this.chanelName = chanelName;
    }

    public int getChanelNumber() {
        return chanelNumber;
    }

    public void setChanelNumber(int chanelNumber) {
        this.chanelNumber = chanelNumber;
    }
}
