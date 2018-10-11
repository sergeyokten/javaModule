package demo30;

public class Main {
    public static void main(String[] args) throws ArithmeticException {
//        System.out.println("start");
//
//        //.....
//
////        int i = 0;
////        int[] mas = new int[3];
////        try {
//////            System.out.println(10 / i);
////            System.out.println(mas[100]);
////
////        } catch (ArithmeticException e) {
////            i++;
////            System.out.println(10 / i);
////        } catch (ArrayIndexOutOfBoundsException e) {
////            //....some actions
////        } finally {
////            System.out.println("ahashgdfhhad");
////        }
//
//
//        System.out.println("end");
        try {
            divide(10, 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

    }


    public static void divide(int a, int b) throws ArithmeticException {

        if (b == 0) {
            throw new ArithmeticException();
        }
        //.....500
        System.out.println(a / b);
    }

}
