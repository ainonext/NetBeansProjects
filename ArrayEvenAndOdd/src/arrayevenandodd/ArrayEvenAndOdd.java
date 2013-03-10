package arrayevenandodd;

import java.util.Scanner;

public class ArrayEvenAndOdd {

    static void outputArray(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размерность массива ");
        int n = in.nextInt();
        int[] initial_array = new int[n];
        int[] even_array = new int[n];
        int[] odd_array = new int[n];
        for (int i = 0; i < initial_array.length; i++) {
            initial_array[i] = (int) (Math.random() * 5 * n);
            int tmp = initial_array[i] % 2;
            if (tmp != 0) {
                odd_array[i] = initial_array[i];
            } else {
                even_array[i] = initial_array[i];
            }
        }
        System.out.println("Исходный массив ");
        outputArray(initial_array, n);
        System.out.println("Массив четных элементов");
        outputArray(even_array, n);
        System.out.println("Массив нечетных элементов");
        outputArray(odd_array, n);
    }
}
