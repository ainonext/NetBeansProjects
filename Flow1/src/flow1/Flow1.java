package flow1;

import java.util.Scanner;

public class Flow1 {

    static int N;

    static int[][] TestMatrix() {
        int dem = 5;
        int[][] arr = new int[dem][dem];
        arr[0][0] = 7;
        arr[1][0] = 10;
        arr[0][1] = 10;
        arr[1][1] = 6;
        arr[0][2] = 5;
        arr[1][2] = 6;
        arr[0][3] = 3;
        arr[1][3] = 10;
        arr[0][4] = 7;
        arr[1][4] = 9;

        arr[2][0] = 7;
        arr[3][0] = 5;
        arr[2][1] = 7;
        arr[3][1] = 1;
        arr[2][2] = 7;
        arr[3][2] = 4;
        arr[2][3] = 5;
        arr[3][3] = 7;
        arr[2][4] = 9;
        arr[3][4] = 3;//dsf

        arr[4][0] = 5;
        arr[4][1] = 10;
        arr[4][2] = 6;
        arr[4][3] = 5;
        arr[4][4] = 6;

        return arr;
    }

    static int[] MakeMinusOne(int[] victim) {
        for (int i = 0; i < N; i++) {
            victim[i] = -1;
        }
        return victim;
    }

    static int[][] InputMatrix() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = (int) (Math.random() * 10 + 1);
            }
        }
        N = n;
        return arr;
    }

    static void PrintMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int SumOfSaved(int[] saved) {
        int sum = 0;
        for (int i = 0; i < saved.length; i++) {
            sum += saved[i];
        }
        return sum;
    }

    static boolean NotForbidded(int[] forbidded, int obj) {
        for (int i = 0; i < forbidded.length; i++) {
            if (forbidded[i] == obj) {
                return false;
            }
        }
        return true;
    }

    static void ForbidIJ(int[] G_i_forbid, int[] G_j_forbid, int I, int J) {
        G_i_forbid[I] = I;
        G_j_forbid[I] = J;
    }

    public static void main(String[] args) {
        int min = 1000;
        int[][] arr, testarr;
        arr = InputMatrix();

        testarr = TestMatrix();

        int[] G_i_forbid = new int[arr.length];
        int[] G_j_forbid = new int[arr.length];
        //PrintMatrix(arr);

        G_i_forbid = MakeMinusOne(G_i_forbid);
        G_j_forbid = MakeMinusOne(G_j_forbid);

        int[] min_arr = new int[N];
        arr = testarr;
        PrintMatrix(testarr);

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                if (NotForbidded(G_i_forbid, i) || NotForbidded(G_j_forbid, j)) {
                    if (arr[i][j] <= min) {
                        min = arr[i][j];
                        ForbidIJ(G_i_forbid, G_j_forbid, i, j);
                        System.out.print(G_i_forbid[i] + " " + G_j_forbid[i] + " i = " + i + " ::: ");
                    }
                }
                System.out.println();
            }
            min_arr[i] = min;
            min = 1000;
        }

        for (int i = 0; i < min_arr.length; i++) {
            System.out.print(min_arr[i] + " " + "[ " + G_i_forbid[i] + "," + G_j_forbid[i] + " ] ");
        }

    }
}
