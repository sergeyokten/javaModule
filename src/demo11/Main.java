package demo11;

public class Main {
    public static void main(String[] args) {

        User user = new User(1, "ashgdfhafsgd");
        user.setId(99);
        System.out.println(user.getId());

        user.setId(user.getId() + 10);
        System.out.println(user);

    }
}
