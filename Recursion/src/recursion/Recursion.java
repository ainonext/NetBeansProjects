package recursion;

public class Recursion {

    static int mSuperPow(int num, int pow) {
        if (pow == 0) {
            return num = 1;
        }
        pow--;
        return mSuperPow(num, pow) * num;
    }

    static int numbers(int n) {
        if (n == 0) {
         return 1;
      }
                           
            return n*numbers(n-1);
        
    }

    public static void main(String[] args) {
       
        System.out.println("Number " + mSuperPow(2, 3));
        System.out.print(numbers(5));
    }
}
