package demo5;

public class User {
    public int id;
    private String name;
    public int age;
    public int cash;

    public User() {
    }

    public User(int id, String name, int age, int cash) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.cash = cash;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", cash=" + cash +
                '}';
    }
}
