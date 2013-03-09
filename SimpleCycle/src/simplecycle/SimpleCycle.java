package simplecycle;

public class SimpleCycle {

    static void print() {
        System.out.print("*");
    }

    static void print_stars(int num) {
        for (int i = 0; i < num; i++) {
            print();
        }
        System.out.println();
    }

    static void print_spaces(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print(' ');
        }
    }

    static void print_downtriangle(int num) {
        for (int i = num; i >= 1; i--) {
            print_stars(i);
        }
    }

    static void print_uptriangle(int num) {
        for (int i = 1; i <= num; i++) {
            print_stars(i);
        }
    }

    static void print_mirrored_uptriangle(int num) {
        /*
         * сторона n, n-1 пробелов, 1*
         n-2 пробелов, 2*
         ...
         n-i пробелов, i*
         ...
         0 пробелов, n*
         */
        for (int i = 1; i <= num; i++) {
            print_spaces(num - i);
            print_stars(i);
        }
    }

    static void print_hollow_square(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.print('*');
        }
        System.out.println();
        for (int i = 1; i <= num - 2; i++) {
            System.out.print('*');
            for (int j = 1; j <= num - 1; j++) {
                print_spaces(j - 2);
            }
            System.out.println('*');
        }
        for (int i = 1; i <= num; i++) {
            System.out.print('*');
        }
        System.out.println();
    }

    static void print_hollow_pyramid(int num) {
        print_stars(num + num);
        for (int i = 1; i <= num - 1; i++) {
            print_spaces(i);
            print();
            print_spaces((num - i -1) * 2);
            System.out.print('*');
            System.out.println();
        }
    }

    static void print_mirrored_downtriangle(int num) {
        for (int i = num; i >= 1; i--) {
            print_spaces(num - i);
            print_stars(i);
        }
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println("Введено количество строк " + n);
        //int i, j, b = 1;
        //int p = 0;
        print_uptriangle(n);
        print_downtriangle(n);
        print_mirrored_uptriangle(n);
        print_mirrored_downtriangle(n);
        print_hollow_square(n);
        System.out.println();
        print_hollow_pyramid(n);
        /* Вывод с помощью массива
         char[][] ch = new char[n][];
         m = ch.length;
         for (i = 0; i < m; i++) {
         ch[i] = new char[i + 1];
         }
         for (i = 0; i < m; i++) {
         for (j = 0; j < ch[i].length; j++) {
         ch[i][j] = '*';
         System.out.print(ch[i][j] + " ");
         }
         System.out.print("\n");*/
        /* for (i = 0; i < n; i++) {            
         for (j = 0; j < (b); j++) {           
         System.out.print('*');
         }
         System.out.println();
         b=b+1;
         }*/
//Вывод пирамидки
         /*while (n >= 1) {
         for (int i = 0; i < p; i++) {
         System.out.print(" ");
         }
         for (int i = 0; i < n; i++) {
         System.out.print("*");
         }
         for (int i = 0; i < p; i++) {
         System.out.print(" ");
         }
         p++;
         n = n - 2;
         System.out.println();
         }*/
        /*   Вывод треугольника
         for (i = 0; i < n; i++) {
         for (j = 0; j < (i + 1); j++) {
         System.out.print('*');
         }
         System.out.println();
         }*/
        /* Вывод квадрата
         for(i=0;i<n;i++){
         for(j=0;j<n;j++){
         System.out.print('*');
         }
         System.out.println();
         }*/

    }
}
