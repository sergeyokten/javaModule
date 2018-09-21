package demo18;

public class Main /*implements B */ {
    public static void main(String[] args) {


        A.testA();

        A a = new A() {
            @Override
            public void aaa1() {

            }

            @Override
            public void aaa2() {

            }

            @Override
            public void aaa3() {

            }

            @Override
            public void aaa4() {

            }

            @Override
            public void aaa5() {

            }
        };
        a.greet();

        a.aaa1();

        System.out.println(A.X);
        System.out.println(a.X);

    }

//    @Override
//    public void aaa1() {
//
//    }
//
//    @Override
//    public void aaa2() {
//
//    }
//
//    @Override
//    public void aaa3() {
//
//    }
//
//    @Override
//    public void aaa4() {
//
//    }
//
//    @Override
//    public void aaa5() {
//
//    }
//
//    @Override
//    public void bbb() {
//
//    }
}
