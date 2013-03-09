package arraymove;

import java.util.Scanner;

public class ArrayMove {

    public static void main(String[] args) {
        //Нахождение максимального, минимального элемента и среднего арифметического 
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
        //Сдвижка массива на заданное количество позиций
        System.out.println("Введите размерность массива");
        int num = in.nextInt();
        int[] array = new int[num];
        System.out.println("Введите шаг для сдвига ");
        int k = in.nextInt();
        System.out.println("Исходный массив ");
        for (int i = 0; i < num; i++) {
            array[i] = (int) (Math.random() * 5 * num);
            System.out.print(array[i] + " ");
        }
        System.out.println("Массив после сдвига");
        int prev = array[0];
        int t, step = 0;
        do {
            for (int i = 1; i < num; i++) {
                t = array[i];
                array[i] = prev;
                prev = t;
            }
            array[0] = prev;
            step++;
        } while (step != k);
        for (int i = 0; i < num; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
