package matrixbeggining;

import java.util.Scanner;

public class MatrixBeggining {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размерность матрицы mxm");
        int m = in.nextInt();
        int tmp = 0;
        int sum = 0;
        int[][] matrix = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = (int) (Math.random() * 10 * m);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i] == matrix[j]) {
                    tmp = matrix[i][j];
                    sum = sum + tmp;
                }
            }
        }
        System.out.println("Сумма по главное диагонали " + sum);
    }
}
