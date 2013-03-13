package matrixbeggining;

import java.util.Scanner;

public class MatrixBeggining {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размерность матрицы mxm");
        int m = in.nextInt();
        int tmp = 0;
        int sum = 0;
        int pr = 1;
        int[][] matrix = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = (int) (Math.random() * 10 * m);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < m; i++) {
            sum = sum + matrix[i][i];
            pr = pr * matrix[i][m - 1 - i];

        }
        System.out.println("Сумма по главное диагонали " + sum);
        System.out.println("Произведение по обратной диагонали " + pr);
    }
}
