package tryinterfaces;

public class TryInterfaces {

    interface BaseA {

        int funA(int n);
    }

    interface BaseB extends BaseA {

        int funB(int n);
    }
    interface One{
        void setOne(int n);
    }
    interface Two{
        void setTwo(int n);
    }
     static class ClassA{
        int number;
        void show(){
            System.out.println("Поле number "+number);
        }
    }
    static class ClassB extends ClassA implements One,Two{
        int value;
       public void setOne(int n) {
            number=n;
        }

        
        public void setTwo(int n) {
            value=n;
        }
        void show(){
            super.show();
            System.out.println("Поле value "+value);
        }
    
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
        One ref1;
        Two ref2;
        ClassB object = new ClassB();
        ref1=object;
        ref2=object;
        ref1.setOne(10);
        ref2.setTwo(-50);
        object.show();
    }
}
