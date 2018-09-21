package demo15;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {12, 23, 34};

//        foo();

        iterate(0, numbers);


    }


    public static void iterate(int index, int[] arr) {
        System.out.println(arr[index]);
        index++;
        if (index >= arr.length) {
            return;
        }
        iterate(index, arr);

    }

//    public static void foo(){
//        System.out.println("oktenweb");
//        foo();
//    }


}
