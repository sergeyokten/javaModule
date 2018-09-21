package demo16;

public class Main {
    public static void main(String[] args) {

        User user = new User(100, "koks", 19.8);
        Student student = new Student("bbbb", 15.78, "m101");

        Singer singer = user;
        singer.sing();

        Runner runner = user;
        System.out.println(runner.run());


    }
}
