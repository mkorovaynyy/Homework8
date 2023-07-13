import Service.ArrayCreatorForHw;
import Service.ArrayReverserForHw;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача1");
        int[] array1 = ArrayCreatorForHw.createIntArray();
        double[] array2 = ArrayCreatorForHw.createDoubleArray();
        int[] array3 = ArrayCreatorForHw.createRndIntArray();
    }

    public static void task2() {
        System.out.println("Задача2");
        int[] array1 = ArrayCreatorForHw.createIntArray();
        double[] array2 = ArrayCreatorForHw.createDoubleArray();
        int[] array3 = ArrayCreatorForHw.createRndIntArray();
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
    }

    public static void task3() {
        System.out.println("Задача3");
        int[] array1 = ArrayCreatorForHw.createIntArray();
        double[] array2 = ArrayCreatorForHw.createDoubleArray();
        int[] array3 = ArrayCreatorForHw.createRndIntArray();
        System.out.println(Arrays.toString(ArrayReverserForHw.reverseArray(array1)));
        System.out.println(Arrays.toString(ArrayReverserForHw.reverseArray(array2)));
        System.out.println(Arrays.toString(ArrayReverserForHw.reverseArray(array3)));
    }

    public static void task4() {
        System.out.println("Задача4");
        int[] array1 = ArrayCreatorForHw.createIntArray();
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 > 0) {
                array1[i]++;
            }
        }
        System.out.println(Arrays.toString(array1));
    }

}