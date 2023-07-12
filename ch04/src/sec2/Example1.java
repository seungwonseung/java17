package sec2;

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
        int a = 0;
        int[] intArr = new int[3];
        double[] doubleArr = new double[3];
        boolean[] booleanArr = new boolean[3];
        String[] StringArr = new String[3];

        System.out.println("a="+a);
        System.out.println();
        for(int b:intArr){
            System.out.println(b);
        }

        System.out.println("\n ------------------------------------\n");
        System.out.println("intArr : "+ Arrays.toString(intArr));
        System.out.println("intArr : "+Arrays.toString(intArr));
        System.out.println("intArr : "+Arrays.toString(intArr));
        System.out.println("intArr : "+Arrays.toString(intArr));

    }

}
