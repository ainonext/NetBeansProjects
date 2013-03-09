package arraymove;

import java.util.Scanner;

public class ArrayMove {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int min;
        int max;
        int s;
        System.out.print("Размерность массива = ");
        int n = in.nextInt();
        int[] arr = new int[n];
        s = min = max = arr[0] = (int) (Math.random() * 5 * n);
        System.out.print(arr[0] + " ");
        for (int i = 1; i < n; i++) {
            arr[i] = (int) (Math.random() * 5 * n);
            System.out.print(arr[i] + " ");
            s = s + arr[i];
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Минимум " + min + "\nМаксимум " + max);
        System.out.println("Среднее арифметическое " + (s - (min + max)) / n);
    }
}
