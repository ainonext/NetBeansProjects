package recursion;

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
        int[][] matrix = new int [5][5];
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                matrix[i][j]=(int)(Math.random()*10*5);
                
            }
        }
        System.out.println("Number " + mSuperPow(2, 3));
        numbers(5);
    }
}
