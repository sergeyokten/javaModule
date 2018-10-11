package demo28;

public class ForNested {

    private int i;


    public ForNested(int i) {
        this.i = i;
    }

    class Nested {
        private String s;

        public Nested(String s) {
            this.s = s;
            System.out.println(i);
        }
    }

}
