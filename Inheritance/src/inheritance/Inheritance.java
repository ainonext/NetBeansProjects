package inheritance;

class A {

    int i, j;

    void printij() {
        System.out.println("Поля i и j: " + i + " " + j);
    }

    void printk() {
        System.out.println("Поля k не существует!");
    }
}

class B extends A {

    int k;

    @Override
    void printk() {
        System.out.println("Поле k: " + k);
    }
}
public class Inheritance {

    public static void main(String[] args) {
        A superObj  = new A();
        superObj.i = 3;
        superObj.j = 5;
        superObj.printij();
        superObj.printk();
        B subObj = new B();
        subObj.i = 9;
        subObj.j = 10;
        subObj.k = 7;
        subObj.printij();
        subObj.printk();
    }
}
