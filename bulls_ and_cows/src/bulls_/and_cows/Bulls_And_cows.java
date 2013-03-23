package bulls_.and_cows;

import java.util.Scanner;

public class Bulls_And_cows {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 4;
        int[] PC = new int[n];
        int[] USR = new int[n];

        System.out.println("Компьютер загадывает 4 цифры от 0 до 10");
        for (int i = 0; i < n; i++) {
            PC[i] = (int) (Math.random() * n * 2);
            if (PC[i] > 10) {
                PC[i] = 10;
            }
            System.out.print(PC[i] + " ");
        }
        System.out.println();
        System.out.println("Введите ваши цифры ");
        for (int i = 0; i < n; i++) {
            USR[i] = in.nextInt();
            System.out.print(USR[i] + " ");
        }
         System.out.println();
        for (int counter = 0; counter < n; counter++) {
            if (PC[counter] != USR[counter]) {
                System.out.println("Несовпадающие элементы");
                return ;
            }
           
        }
       System.out.println("Одинаковые эелементы!"); 
    }
}
