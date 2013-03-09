package testing1;

class Math {

    static public int add(int a, int b) {
        return a + b;
    }

    static public int subtraction(int a, int b) {
        return a - b;
    }

    static public int multiplication(int a, int b) {
        return a * b;
    }

    static public int division(int a, int b) {
        return a / b;
    }
    
    public boolean myMethod(int a, boolean flag) {
        if (a > 0) {
            return true;
        }
        if (flag) {
            return true;
        }
        return false;
    }
}

public class Testing1 {

    public static void main(String[] args) {
        Math matematic = new Math();
        System.out.println("Результат сложения " + matematic.add(5, 2));
        System.out.println("Результат вычитания " + matematic.subtraction(7, 5));
        System.out.println("Результат умножения " + matematic.multiplication(10, 10));
        System.out.println("Результат деления " + matematic.division(1000, 10));
    }
}
