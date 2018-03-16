package prototype;

public class Main {
    public static void main(String[] args) {

        Human human = new Human("vasya", 12);
        Human copy = (Human) human.copy();
        System.out.println(copy);
    }
}
