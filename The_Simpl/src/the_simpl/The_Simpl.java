
package the_simpl;

import java.util.Scanner;

public class The_Simpl {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int sum = 0;
        for(int i=2;i<n;i++){
        int min;
        int a = i - 1;
        int b = n - i;
        if (a < b) {
                min = a;
            }
        else {
                min = b;
            }
        sum = sum + min;//сумма минимумов
        }
        sum = sum + (n - 1);//сумма минимумов да плюс поток
        System.out.println(sum);
    }
}
