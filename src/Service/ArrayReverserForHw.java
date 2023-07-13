package Service;

public class ArrayReverserForHw {
    public static int[] reverseArray(int[] array) {
        int[] a = new int[array.length];
        int j = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            a[j] = array[i];
            j--;
        }
        return a;
    }

    public static double[] reverseArray(double[] array) {
        double[] a = new double[array.length];
        int j = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            a[j] = array[i];
            j--;
        }
        return a;
    }
}
