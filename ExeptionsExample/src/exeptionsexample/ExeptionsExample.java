package exeptionsexample;

public class ExeptionsExample {

    public static void main(String[] args) {
        int num[] = {2, 4, 9};
        int mas[] = {0, 2, 3};
        for (int i = 0; i < num.length; i++) {
            try {

                System.out.println("Делим массив на массив. Результат = " + num[i] / mas[i]);
                num[5] = 10;
                System.out.println("Попытаемся обратится к несуществующему элементу массива 5 " + num[5]);

            } catch (ArithmeticException e) {
                System.out.println("Деление на ноль");
            } catch (ArrayIndexOutOfBoundsException exp) {
                System.out.println("Обращение к несуществующему элементу " + exp.getMessage());
            }
        }
        System.out.println("Программа продолжается");

    }
}
