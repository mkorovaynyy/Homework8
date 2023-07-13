package Service;

public class ArrayCreatorForHw {
    public static int[] createIntArray() {
        int[] array1 = new int[3];
        for (int i = 1; i <= 3; i++) {
            array1[i - 1] = i;
        }
        return array1;
    }

    public static double[] createDoubleArray() {
        return new double[]{1.57, 7.654, 9.986};
    }

    public static int[] createRndIntArray() {
        return new int[]{1, 2, 3, 4, 5, 6};
    }
}

