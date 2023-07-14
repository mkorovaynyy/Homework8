package Service;

public class ArrayPrintReverserForHw {
    public static void printReverseArray(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println();
    }

    public static void printReverseArray(double[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println();
    }
}
