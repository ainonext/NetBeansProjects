package tryinterfaces;

public class TryInterfaces {

    interface BaseA {

        int funA(int n);
    }

    interface BaseB extends BaseA {

        int funB(int n);
    }

    static class MyClass implements BaseB {

        public int funA(int n) {
            if (n < 1) {
                return 1;
            } else {
                return n * funA(n - 1);
            }
        }

        public int funB(int n) {
            if (n == 1 || n == 2) {
                return n;
            } else {
                return n * funB(n - 2);
            }
        }
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        System.out.println("1 " + obj.funA(5));
        System.out.println("2 " + obj.funB(5));
    }
}
