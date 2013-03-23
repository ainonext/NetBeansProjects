package sorts;

public class Sorts {

    public static void main(String[] args) {
        int[] array = new int[]{4, 3, 2, 1};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int len = array.length;
        int choose = 3;
        switch (choose) {
            case 1: {
                // boolean key = false;
                // if (key == true) {
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
                break;
            } //else {
            case 2: {
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
                break;
            }
            case 3: {
                int keys;
                System.out.println();
                System.out.println("Сортировка вставками");
                for (int i = 1; i < len; i++) {
                    keys = array[i];
                    int j = i - 1;
                    while (j >= 0 && keys < array[j]) {
                        array[j + 1] = array[j];
                        j = j - 1;
                    }
                    array[j + 1] = keys;
                }
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + " ");
                }
            }
            break;
        }
    }
}
