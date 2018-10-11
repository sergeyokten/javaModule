package demo29;

public class Main {
    public static void main(String[] args) {

        User kokos = User.builder()
//                .id(123)
//                .name("kokos")
                .email("asasd@asd.com")
                .build();

        System.out.println(kokos);

    }
}


class User {

    private int id;
    private String name;
    private String email;


    public static UserBuilder builder() {
        return new UserBuilder();
    }

    static class UserBuilder {
        private User user = new User();

        public UserBuilder id(int id) {
            user.id = id;
            return this;
        }

        public UserBuilder name(String name) {
            user.name = name;
            return this;
        }

        public UserBuilder email(String email) {
            user.email = email;
            return this;
        }

        public User build() {
            return user;
        }

    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
