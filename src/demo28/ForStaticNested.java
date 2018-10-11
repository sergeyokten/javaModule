package demo28;

public class ForStaticNested {


    private static int i;


    public ForStaticNested() {
        this.i = i;
    }

    static class StaticNested {
        private String s;

        public StaticNested(String s) {
            this.s = s;
            System.out.println(i);
        }
    }
}
