package builder;

public class Main {

    public static void main(String[] args) {
        User user = User.getBuilder().name("vasya").age(1221).build();
        System.out.println(user);
    }
}
