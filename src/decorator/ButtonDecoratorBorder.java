package decorator;

public class ButtonDecoratorBorder implements ButtonInterface {
    private String border;

    ButtonInterface buttonInterface;


    public ButtonDecoratorBorder(String border, ButtonInterface buttonInterface) {
        this.border = border;
        this.buttonInterface = buttonInterface;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    @Override
    public void press() {

        System.out.println("i add to a button some border wit " + border);
        buttonInterface.press();

    }
}
