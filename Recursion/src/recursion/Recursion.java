package recursion;

import java.util.Scanner;

public class Recursion {

    static int mSuperPow(int num, int pow) {
        if (pow == 0) {
            return num = 1;
        }
        pow--;
        return mSuperPow(num, pow) * num;
    }

    static void numbers(int n) {
        if (n == 0) {
            System.out.print(n + " ");
        }
        if (n > 0) {
            numbers(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите разморность матрицы ");
        int m = in.nextInt();
        int[][] matrix = new int[m][m];
        int pr = 1, prRev = 1;
        int det;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = (int) (Math.random() * 10 * 5);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        if (m == 1) {
            System.out.println("Определитель 1х1 " + matrix[0][0]);
        }
        if (m == 2) {
            for (int i = 0; i < m; i++) {
                pr = pr * matrix[i][i];
                prRev = prRev * matrix[i][m - 1 - i];

            }
            det = pr - prRev;
            System.out.println("Определитель 2х2 " + det);
        }

        System.out.println("Number " + mSuperPow(2, 3));
        numbers(5);

    }
}
