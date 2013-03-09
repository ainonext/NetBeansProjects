package kolesnikovkurs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
// Распределения

class MyRandom {
    //равномерное распределение

    static public Random random;

    static public double rnd(double a, double b) {
        if (b > a) {
            return a + (b - a) * random.nextDouble();
        } else {
            return b + (a - b) * random.nextDouble();
        }

    }
//Экспоненциальное распределение с параметром lambda:

    static public double rndExp(double lambda) {
        double u; // нельзя, чтобы u получилось равное 0, т.к. логарифм от нуля не существует
        u = random.nextDouble() + 0.00001;
        return Math.log(1 - u) / -lambda;

    }

    static public double rndNorm(double alpha, double sigma) {
        // получаем случайное число, имеющее стандратное нормальное распределение
        double u = random.nextGaussian();
        // приводим его к нормальному распределение с параметрами alpha и sigma
        return alpha + sigma * u;
    }
}

class generator { //генератор заявок

    private int min, max;

    void set(int min, int max) { //устанавливает верхнюю и нижнюю границы информационного объема
        this.min = min;
        this.max = max;
    }

    generator(int min, int max) { //конструктор генератора заявок
        set(min, max);
        show();
    }

    request generateRequest() { // метод который создает заявки
        int x = (int) Math.abs(max - min);
        int inf = (int) ((int) x * Math.random() + min);
        request z = new request(inf);
        return z;
    }

    void show() { //печатает параметры генератора
        System.out.println("Минимальный информационный объем заявки " + min);
        System.out.println("Максимальный информационный объем заявки " + max);
    }
}

class request { //класс заявки

    int inf;

    request(int info) { //конструктор заявки с аргументом информационного объема
        this.inf = info; //
    }

    void show() { // печатает информационный объем заявки
        System.out.println("Информационный объем заявки " + inf);
    }
}

class node { // узел

    private boolean isWorking = true;
    private int productivity = 1; //производительность
    private buffer buf = new buffer(); //создание объекта буфер
    private request nodeZ = null; // место для хранения заявки
    public int timeBeforeBreak; // время, прошедшее с начала ремонтa
    public int repairTime;
    static public stream success; // буфер знает о потоке успешной обработки
    static public stream deny; // буфер знает о потоке отказов
    static public stream error; // буфер знает о потоке ошибок

    void breakNode() {
        if (isWorking) {
            this.isWorking = false;
            System.out.println("Узел сломался! Заявка не обработана, отправлена в поток отказов!");
            if (nodeZ != null) {
                error.addToStream(nodeZ);
            }
            nodeZ = null;

        }
    }

    void add(request z) { //добавление заявки в буфер, обращение к буферу
        buf.add(z);
    }

    void print() { //печатает количество элементов буфера
        System.out.print("Буфер: ");
        buf.print();
    }

    void processRequest() { // обработка одной заявки в узле
        if (isWorking == true) {
            if (nodeZ == null) {
                return;
            }
            System.out.println("Заявка обрабатывается, оставшийся объем работ: " + nodeZ.inf);
            nodeZ.inf -= productivity;
            if (nodeZ.inf <= 0) {
                sendToSuccess();
                System.out.println("Заявка обработана! Отправлена в поток успешной обработки.");
                buf.returnZayavka();
            }
        } else {
            repairTime--;
            if (repairTime == 0) {
                isWorking = true;
            }
        }
    }

    void sendToSuccess() { // отправка в поток успешной обработки
        success.addToStream(nodeZ);
        nodeZ = null;
    }

    void sendToError(request z) { //отправка в поток ошибок
        System.out.print("Заявка ушла с ошибкой в опток ошибок ");
        error.addToStream(z);
    }

    class buffer { // внутри узла буффер

        private Queue<request> zq = new LinkedList(); //очередь заявок
        private int count = 0; //количество заявок буфера

        void add(request z) { //добавление заявки в буфер
            if (count >= 10) {
                sendToDenied(z);
            } else {
                zq.add(z);
                count++;
                returnZayavka();
            }
        }

        void returnZayavka() {
            if (nodeZ == null && count > 0) //в узле ничего не должно быть, поэтому проверяем это
            {
                nodeZ = zq.poll();
                count--;
                System.out.println("Заявка отправлена в узел!");
                print();
            }
        }

        void sendToDenied(request z) {
            deny.addToStream(z);
            System.out.println("Заявка отправлена в поток отказов! ");
        }

        void print() { //вывод количества элементов в буфере
            System.out.println("Количество элементов в буфере " + count);
        }
    }
}

class stream {

    private String name;
    private int counter;

    stream(String s) {
        name = s;
    }

    void addToStream(request z) {
        counter++;
        z = null;
    }

    void show() {
        System.out.println("Количество заявок в потоке " + name + counter);
    }
}

public class KolesnikovKurs {

    public static void main(String[] args) {


        int N = 10;
        int experiment = 1000; // время эксперимента

        MyRandom.random = new Random(System.currentTimeMillis());

        node.success = new stream("успешной обработки ");
        node.deny = new stream("отказов ");
        node.error = new stream("ошибок ");

        node[] nodes = new node[N];
        generator g = new generator(100, 300); //создание генератора с параметрами

        // int timeToRepair = 500; //время востановления
        int timeToBreak = 1000;

        // int repairTime;
        //  repairTime = (int) MyRandom.rndNorm(timeToRepair, 20);

        for (int i = 0; i < N; i++) {
            System.out.println("Номер узла " + (i + 1));
            nodes[i] = new node();// создание узла
            nodes[i].timeBeforeBreak = (int) MyRandom.rndExp(1.0 / timeToBreak);
        } //вывод содержимого буфера

        int requestCD;
        requestCD = (int) MyRandom.rndExp(1.0 * 50.0);//время до генерации заявки
        int reqNum = 0;
        for (int j = 0; j < experiment; j++) { /* глобальное время эксперимента */
            if (requestCD <= 0) {
                request r = g.generateRequest();
                int nodeNumber = (int) MyRandom.rnd(0, N);
                nodes[nodeNumber].add(r);
                requestCD = (int) (MyRandom.rndExp(1 * 50));
                reqNum++;
            }
            requestCD--;
            for (node n : nodes) {
                if (n.timeBeforeBreak == j) {
                    n.breakNode();
                    n.timeBeforeBreak = (int) MyRandom.rndExp(1.0 * timeToBreak) + j;
                }
                n.processRequest();

            }
        }
        System.out.println("Количество узлов: "+N+"\nКоличество заявок: "+reqNum);
        node.success.show();
        node.deny.show();
        node.error.show();
    }
}
