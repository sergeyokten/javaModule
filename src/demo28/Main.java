package demo28;

public class Main {
    public static void main(String[] args) {

//        class Foo {
//            private int i;
//            private String s;
//
//            public Foo(int i, String s) {
//                this.i = i;
//                this.s = s;
//            }
//
//            //....commom
//        }
//
//        Foo foo = new Foo(1, "asgdfasgd");


        ForNested.Nested nested = new ForNested(123).new Nested("agsdhagf");
        ForStaticNested.StaticNested staticNested = new ForStaticNested.StaticNested("sadgasd");
    }


}
