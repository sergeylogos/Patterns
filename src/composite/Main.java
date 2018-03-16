package composite;

public class Main {
    public static void main(String[] args) {

        TShirt polo = new TShirt("XL", "polo");
        TShirt tShirt = new TShirt("XL", "jacket");

        Sveter sveter = new Sveter("winter", "XL");

        Bag bag = new Bag();
        bag.addComponent(polo);
        bag.addComponent(tShirt);
        bag.addComponent(sveter);

        bag.wear();
    }
}
