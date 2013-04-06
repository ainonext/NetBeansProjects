package painting;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Painting extends JFrame {
    //for saving all ovals's

    public class MyOval {

        int posX;
        int PoxY;
        int count;
    }
    JPanel panel = new JPanel();
    // Graphics g;
    int posX;
    int posY;

    public Painting() {
        super("Main form");
        setSize(500, 500);
        panel.setBackground(Color.WHITE);
        panel.setBounds(10, 10, 460, 440);
        panel.setLayout(null);
        Container contentPane = getContentPane();
        contentPane.setBackground(Color.RED);
        contentPane.setLayout(null);
        contentPane.add(panel);
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                Point location = e.getPoint();
                posX = (int) location.getX();
                posY = (int) location.getY();
               // panel.getGraphics().setColor(Color.red);
               // panel.getGraphics().drawOval(posX - 15, posY - 15, 30, 30);
                //panel.getGraphics().fillOval(posX - 15, posY - 15, 30, 30);
                //  System.out.print(posX +" "+ posY + " <-- inethod\n");
                paint(panel.getGraphics());
            }
           
        public void paint(Graphics g){
        g.setColor(Color.GREEN);
        g.drawOval(posX - 15, posY - 15, 30, 30);
        g.fillOval(posX - 15, posY - 15, 30, 30);
        }
        });

    }

    public static void main(String[] args) {
        Painting window = new Painting();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
