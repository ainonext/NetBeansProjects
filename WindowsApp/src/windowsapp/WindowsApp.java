/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package windowsapp;
import javax.swing.*;
public class WindowsApp {

    public static void main(String[] args) {
       int a;
       a=Integer.parseInt(JOptionPane.showInputDialog("введите а"));
       System.out.println("Считано значение а"+a);
       System.exit(0);
    }
}

