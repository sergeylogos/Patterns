package decorator;

public class Main {
    public static void main(String[] args) {
        //добавлять поведение до  или после основной работы, но при этом не меняя его тип


        Button button = new Button("round");
        ButtonInterface anInterface= new ButtonDecoratorBorder("2px ", button);
//        anInterface.press();

        ButtonInterface anInterface2 = new ButtonDecoratorColor(anInterface, "red");
        anInterface2.press();


    }
}
