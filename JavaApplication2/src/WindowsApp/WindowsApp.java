package WindowsApp;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

class MyPanel extends JPanel {

    MyPanel() {
        JButton addSmt = new JButton("Cоздать новое окно ");
//addSmt=new JButton("Hello");
        JPanel buttonsPanel = new JPanel(new FlowLayout());
        buttonsPanel.add(addSmt);
        add(buttonsPanel, BorderLayout.CENTER);
        ActionListener listener;
        listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                Random rnd = new Random();
                WindowsApp frame = new WindowsApp(rnd.nextInt(800), rnd.nextInt(500));
            }
        };
        addSmt.addActionListener(listener);
    }
}

public class WindowsApp extends JFrame {

    public static int count = 0;

    WindowsApp(int a, int b) {
        count++;
        setTitle("Окно с кнопкой " + count);
        MyPanel panel = new MyPanel();
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(a, b);
        add(panel);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        WindowsApp app = new WindowsApp(100, 100);
        app.setVisible(true);
        app.pack();
    }
}
