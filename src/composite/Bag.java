package composite;

import java.util.ArrayList;

public class Bag implements Component {
    private ArrayList<Component> components = new ArrayList<Component>();


    public void addComponent(Component component) {
        this.components.add(component);
    }

    public void removeComponent(Component component) {
        this.components.remove(component);
    }

    @Override
    public void wear() {
        System.out.println("i wear a bag with this components");
        System.out.println(components);
    }

}
