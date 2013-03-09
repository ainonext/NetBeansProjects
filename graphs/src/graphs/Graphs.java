package graphs;

import java.util.Scanner;

public class Graphs {
  static void dfs(int n){
  int[] used =new int[n];
        used[n]=1;
        for(int i=0; i<n;i++){
            if(used[i]==0) {
                dfs(i);
            }
        }
  }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = 0;
            }
        }
        int a, b, w;
        for (int k = 0; k < m; k++) {
            a = in.nextInt();
            b = in.nextInt();
            w = in.nextInt();
            matrix[a][b] = w;
        }
        dfs(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
