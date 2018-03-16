package builder;

public class User {

    private String name;
    private int age;



    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {

        private User user = new User();

        public Builder name(String name) {
            user.name = name;
            return this;
        }

        public Builder age(int age) {
            user.age = age;

            return this;
        }

        public User build() {
            return this.user;
        }

    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
