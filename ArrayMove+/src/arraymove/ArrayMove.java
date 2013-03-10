package arraymove;

import java.io.IOException;
import java.util.Scanner;

public class ArrayMove {

    public static void main(String[] args) throws IOException {
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
        int[] tmp = new int[num];
        System.out.println("Введите шаг для сдвига ");
        int k = in.nextInt();
        System.out.println("Исходный массив ");
        for (int i = 0; i < num; i++) {
            array[i] = (int) (Math.random() * 5 * num);
            System.out.print(array[i] + " ");
        }
        /*System.out.println("Сдвиг вправо или влево? r/l");
         char c;
         c = (char)System.in.read();*/
        System.out.println("Массив после сдвига");
        int len = array.length;
        // switch (k) {
        if (k > 0) {
            // case 'r':
            //сдвиг вправо
            for (int i = 0; i <= len - 1; i++) {
                // tmp[0] = array[len - 1];
                int offset = i + k;
                if (offset >= len) {
                    offset = offset - len;
                    while (offset >= len) {
                        offset = offset - len;
                    };
                }
                tmp[offset] = array[i];
            }
        } else {
            k = Math.abs(k);
            //   break;
            //  case 'l':
            //сдвиг влево
            for (int i = len - 1; i >= 0; i--) {
                int offset = i - k;
                if (offset < 0) {
                    offset = offset + len;
                    while (offset < 0) {
                        offset = offset + len;
                    };
                }
                tmp[offset] = array[i];

            }
            //   break;
        }
        for (int i = 0; i < num; i++) {
            System.out.print(tmp[i] + " ");
        }

        /*Сдвиг пошаговый
         * int prev = array[0];
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
         }*/

    }
}
