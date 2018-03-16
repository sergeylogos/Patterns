package decorator;

public class Button implements ButtonInterface {
    private String type;


    public Button(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void press() {
        System.out.println(type + " button was pressed");
    }


}
