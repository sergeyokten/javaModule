package demo27;

public class Main {
    public static void main(String[] args) {


        User<Integer> integerUser = new User<>(123, "kokos");
        User<Short> stringUser = new User<>((short) 13, "asdgfasfdhgas");

        integerUser.greeting("ashdahsgfd");
        fooBar(new User<Number>(new Double(3.14), "sad"));

        fooBar2(new User<Integer>(123, "qyafsd"));
    }

    public static void fooBar(User<? super Integer> user) {
    }

    public static void fooBar2(User<? extends Number> user) {
    }


}

class User<T /*extends Number*/> {

    public <X> void greeting(X x) {
        //some action
    }

    private T id;
    private String name;

    public User(T id, String name) {
        this.id = id;
        this.name = name;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}