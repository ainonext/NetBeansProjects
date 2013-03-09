package qsort;

import java.util.Scanner;

public class Qsort {

    public static void qSort(int[] A, int low, int high) {
        int i = low;
        int j = high;
        int x = A[(low + high) / 2];
        do {
            while (A[i] < x) {
                ++i;
            }
            while (A[j] > x) {
                --j;
            }
            if (i <= j) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i++;
                j--;
            }
        } while (i < j);
        if (low < j) {
            qSort(A, low, j);
        }
        if (i < high) {
            qSort(A, i, high);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Размерность массива ");
        int n = in.nextInt();
        System.out.print(n);
        int[] arr = new int[n];
        System.out.println("Исходный массив = ");
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 5 * n);
            System.out.print(arr[i] + " ");
        }
        qSort(arr, 0, n - 1);
        System.out.println("После сортировки ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
