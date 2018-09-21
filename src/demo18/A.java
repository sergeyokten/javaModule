package demo18;

public interface A {


    int X = 100;

    void aaa1();

    void aaa2();

    void aaa3();

    void aaa4();

    void aaa5();


    static void testA() {
        System.out.println("TEST");
    }

    default String greet() {
        return "hello oktenweb";
    }


}
