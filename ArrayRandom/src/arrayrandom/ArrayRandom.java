package arrayrandom;

import java.util.Scanner;

public class ArrayRandom {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размерность массива ");
        int n = in.nextInt();
        int j = 0;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) (n - (Math.random() * 5 * n));
            System.out.print(array[i] + " ");
            if (array[i] < 0) {
                j++;
            }
        }
        System.out.println("Чисел <0 " + j + "шт.");
    }
}
