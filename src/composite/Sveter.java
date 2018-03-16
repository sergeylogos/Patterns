package composite;

public class Sveter implements Component {
    private String seazon;
    private String size;

    @Override
    public void wear() {
        System.out.println("this sveter of size " + size + " for " + seazon);
    }

    public Sveter(String seazon, String size) {
        this.seazon = seazon;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Sveter{" +
                "seazon='" + seazon + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
