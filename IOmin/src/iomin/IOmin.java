package iomin;

import java.util.Scanner;

public class IOmin {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int min;
        int first;
        int num = in.nextInt();
        first = num;
        min = num;
        System.out.println("First number " + first);
        while (num != 0) {
            num = in.nextInt();
            if (num < min && num != 0) {
                min = num;
            }
        }
        System.out.print("Minimum " + min);
        int dif = first - min;
        System.out.println("Result " + dif);
    }
}
