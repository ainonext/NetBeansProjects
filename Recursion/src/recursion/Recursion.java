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
        System.out.println("Number " + mSuperPow(2, 3));
        numbers(5);
    }
}
