package sorts;

public class Sorts {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 4, 3};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int len = array.length;
        int tmp;
        int f;
        for (int i = 0; i < len - 1; i++) {
            f = 0;
            for (int j = 0; j < (len - 1); j++) {
                if (array[j] > array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    f = 1;
                }
            }
            if (f == 0) {
                break;
            }
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
