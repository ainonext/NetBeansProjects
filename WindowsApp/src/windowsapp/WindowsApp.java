package windowsapp;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class WindowsApp extends JFrame {
    /* static class MyAdapter extends WindowAdapter{
     public void windowClosing(WindowEvent we){
     System.exit(0);
     }
     }
    
     static  class JustAFrame extends Frame{

     public JustAFrame(int a, int b) {
     super("Новое окно");
     MyAdapter adapter = new MyAdapter();
     setSize(a,b);
     setVisible(true);
     addWindowListener(adapter);
            
     }
        
     public void paintO(int x, int y){
     getGraphics().drawOval(x, x, y, y);
     //setLocation(x);
     }
     }

     public static void main(String[] args) {
     int a;
     a=Integer.parseInt(JOptionPane.showInputDialog("введите сколько будет кружков "));
     //System.out.println("Считано значение а"+a);
     JustAFrame frame= new JustAFrame(400, 400);
       
     for(int i=0;i<a;i++){
     int x=Integer.parseInt(JOptionPane.showInputDialog("введите Х "));
     int y=Integer.parseInt(JOptionPane.showInputDialog("введите Y "));
     frame.paintO(x, y);
               
     }
    
     }*/
    // public class MyFrame extends JFrame{
     /*   public WindowsApp(){
     super("Мое окно");
     setContentPane(new DrawPane());
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setSize(400, 400);
     setBackground(Color.WHITE);
     setVisible(true);
     }
     class DrawPane extends JPanel{
     @Override 
     public void paintComponent(Graphics g){
     g.drawOval(200, 200, 20, 20);
     }
           
     }*/
    //создание панели на которой будет все рисоваться

    JPanel panel = new JPanel();
    Graphics g;
    //добавление кнопки
    JButton btn = new JButton("Добавить шарик");
    int i;

    public WindowsApp() {
        setSize(500, 400);
        panel.setBackground(Color.WHITE);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);
        //границы области где будут летать шарики
        btn.setBounds(300, 300, 150, 30);
        //добавление кнопки и ее размеров и положения
        contentPane.add(btn);
        panel.setBounds(50, 50, 400, 250);
        contentPane.add(panel);
        //добавление реагирования на клик мышкой
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                new BallThread(panel).start();
                i++;
                repaint();
            }
        });
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("Количество шариков " + i, 65, 350);
    }

    class BallThread extends Thread {

        JPanel panel;
        //координаты шарика, размер, скорость, цвет, угол
        private int posX, posY;
        private final int BALL_SIZE = 20;
        private double alpha;
        private int speed = 10;
        private Color color;
        //конструктор для потока

        BallThread(JPanel p) {
            this.panel = p;
            //Задание начальной позиции и направления шарика
            posX = (int) ((panel.getWidth() - BALL_SIZE) * Math.random());
            posY = (int) ((panel.getHeight() - BALL_SIZE) * Math.random());
            alpha = Math.random() * 10; //генерация рандомного угла падения
            Random random = new Random();
            color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
        }

        public void run() {
            while (true) {
                posX += (int) (speed * Math.cos(alpha));
                posY += (int) (speed * Math.sin(alpha));
                //Вычисление угла отражения
                if (posX >= panel.getWidth() - BALL_SIZE) {
                    alpha = alpha + Math.PI - 2 * alpha;
                } else if (posX <= 0) {
                    alpha = Math.PI - alpha;
                }
                if (posY >= panel.getHeight() - BALL_SIZE) {
                    alpha = -alpha;
                } else if (posY <= 0) {
                    alpha = -alpha;
                }
                paint(panel.getGraphics());
            }
        }

        public void paint(Graphics g) {
            //прорисовка шарика
            g.setColor(color);
            g.drawOval(posX, posY, BALL_SIZE, BALL_SIZE);
            g.fillOval(posX, posY, BALL_SIZE, BALL_SIZE);
            try {
                sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //Удаление шарика, если убрать будет оставаться хвост
            g.setColor(panel.getBackground());
            g.drawOval(posX, posY, BALL_SIZE, BALL_SIZE);
            g.fillOval(posX, posY, BALL_SIZE, BALL_SIZE);
        }
    }

    public static void main(String args[]) {
        // new WindowsApp();
        WindowsApp frame = new WindowsApp();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
