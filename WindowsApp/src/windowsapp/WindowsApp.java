package windowsapp;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WindowsApp extends JFrame{
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
        public WindowsApp(){
            super("Мое окно");
            setContentPane(new DrawPane());
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(400, 400);
            setVisible(true);
        }
        class DrawPane extends JPanel{
           @Override 
            public void paintComponent(Graphics g){
            g.drawOval(200, 200, 20, 20);
            }
        }
        public static void main(String args[]){
            new WindowsApp();
     }

    }
   
