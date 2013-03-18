package windowsapp;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WindowsApp {
    static class MyAdapter extends WindowAdapter{
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
      /* public int setLocation(int x){
           x=x+10;
           return x;
       }*/
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
    
    }
   }
