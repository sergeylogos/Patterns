package composite;

public class TShirt implements Component {
    private String size;
    private String type;

    @Override
    public void wear() {
        System.out.println("this tshirt of size " + size + " and type " + type);
    }

    public TShirt(String size, String type) {
        this.size = size;
        this.type = type;
    }


    @Override
    public String toString() {
        return "TShirt{" +
                "size='" + size + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
