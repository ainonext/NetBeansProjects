/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
        
    }

    public static void main(String[] args) {
       int a;
       a=Integer.parseInt(JOptionPane.showInputDialog("введите а"));
       System.out.println("Считано значение а"+a);
       JustAFrame frame= new JustAFrame(400, 300);
    //   System.exit(0);
    }
}

