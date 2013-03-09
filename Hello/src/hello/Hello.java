package hello;

public class Hello {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello, JAVA!! ");
        int a = 45, b = 5, c;
        c = (int) a + b;
        System.out.print(c);
        System.out.println();
        /*Приложение по Васильеву 1.1 */
        byte age = 34;
        char sex = 'm';
        double weight = 103.4;
        int lenght = 182;
        System.out.println("Персональные данные");
        System.out.println("возраст=" + age);
        System.out.println("пол = " + sex);
        System.out.println("вес =" + weight);
        System.out.println("Рост =" + lenght);
        System.out.println();
        /*Ряд Фибоначи*/
        int end = 9;
        int p = 1, pp = 1, res = 0;
        for (int n = 3; n <= end; n += 1) {
            res = p + pp;
            pp = p;
            p = res;
        }
        System.out.println("Член ряда Фебоначи №" + end + "=" + res);

        a = 1;
        b = 1;
        System.out.print("Ряд Фебоначи");
        int N = 15;
        System.out.print(" " + a + " " + b);
        for (int i = 3; i <= N; i++) {
            b = a + b;
            a = b - a;
            System.out.print(" " + b);
        }
        System.out.println(res);
        // вычисление корня уравнения
        double a1 = 5, b1 = 3, c1 = 1, alpha1;
        boolean state;
        alpha1 = Math.asin(a1 / Math.sqrt(a1 * a1 + b1 * b1));
        state = a1 * a1 + b1 * b1 >= c1 * c1;
        System.out.println("Уравнение a*cos(x)+b*sin(x)=c");
        System.out.println("Параметры");
        System.out.println("a=" + a1);
        System.out.println("b=" + b1);
        System.out.println("c=" + c1);
        System.out.println("Решение для х: ");
        System.out.println(state ? Math.asin(c1 / Math.sqrt(a1 * a1 + b1 * b1)) - alpha1 : "решений нет!");
        System.out.println();
        //Кодирование символов
        int number;
        char symA = 'А', symB = 'ы';
        char SymA, SymB;
        number = ((int) symB << 16) + ((int) symA);
        System.out.println("Исходные буквы: \'" + symA + "\' и \'" + symB + "\'.");
        System.out.println("Кодовое число " + number);
        SymB = (char) (number >>> 16);
        SymA = (char) (number ^ ((int) SymB << 16));
        System.out.println("Обратное преобразование ");
        System.out.println("Буквы \'" + SymA + "\' и \'" + SymB + "\'.");
        System.out.println();
        //оптимальное подключение резисторов
        double R1 = 3, R2 = 5, R3 = 2, Ro = 1;
        double r1, r2, r3;
        boolean A, B;
        r1 = R2 * R3 / (R2 + R3) + R1 * Ro / (R1 + Ro);
        r2 = R1 * R3 / (R1 + R3) + R2 * Ro / (R2 + Ro);
        r3 = R2 * R1 / (R2 + R1) + R3 * Ro / (R3 + Ro);
        A = (r1 <= r2) && (r1 <= r3);
        B = (r2 <= r1) && (r2 <= r3);
        System.out.println("Значения сопротивлений резисторов ");
        System.out.println("R1 = " + R1 + "Ом");
        System.out.println("R2= " + R2 + "Ом");
        System.out.println("R3= " + R3 + "Ом");
        System.out.println("Основной Резистор= " + Ro + "Ом");
        System.out.print("Во второй блок подключается ");
        System.out.print(A ? "первый" : B ? "второй" : "третий");
        System.out.println(" резистор!");
        System.out.println();
    }
}
