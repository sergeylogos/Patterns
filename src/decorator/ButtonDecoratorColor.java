package decorator;

public class ButtonDecoratorColor implements ButtonInterface {
    private ButtonInterface buttonInterface;
    private String color;

    public ButtonDecoratorColor(ButtonInterface buttonInterface, String color) {
        this.buttonInterface = buttonInterface;
        this.color = color;
    }

    @Override
    public void press() {
        System.out.println("i add to button some " + color + " color");
        buttonInterface.press();
    }

    public ButtonInterface getButtonInterface() {
        return buttonInterface;
    }

    public void setButtonInterface(ButtonInterface buttonInterface) {
        this.buttonInterface = buttonInterface;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
