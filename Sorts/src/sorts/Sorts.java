package sorts;

public class Sorts {

    public static void main(String[] args) {
        int[] array = new int[]{4, 3, 2, 1};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int len = array.length;
        boolean key = false;
        if (key == true) {
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
            System.out.println("Сортировка пузырьком ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        } else {
            for (int i = 0; i < len - 1; i++) {
                int min = i;
                for (int j = i + 1; j < len; j++) {
                    if (array[j] < array[min]) {
                        min = j;
                    }

                }
                if (min != i) {
                    int tmp = array[i];
                    array[i] = array[min];
                    array[min] = tmp;

                }
            }
            System.out.println();
            System.out.println("Сортировка выбором ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
