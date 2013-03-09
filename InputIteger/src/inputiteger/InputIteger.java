package inputiteger;

import java.util.Scanner;

public class InputIteger {

    static int sum() {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int num;
        int pr = 1;
        num = in.nextInt();
        while (num != 0) {
            sum = sum + num;
            if (sum < 100) {
                pr = pr * num;
            }
            num = in.nextInt();
        }
        if (sum > 100) {
            System.out.println("Result " + sum);
        } else {
            System.out.println("Result " + pr);
        }
        return sum;
    }

    public static void main(String[] args) {
        sum();

    }
}
