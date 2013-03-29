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

    JPanel panel = new JPanel();
    // Graphics g;
    int posX;
    int posY;
    public Painting() {
        super("Main form");
        setSize(500, 500);
        panel.setBackground(Color.WHITE);
        panel.setBounds(0, 0, 500, 500);
        panel.setLayout(null);
        Container contentPane = getContentPane();
        contentPane.add(panel);
        contentPane.setBackground(Color.WHITE);
        contentPane.setLayout(getLayout());
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                Point location = e.getPoint();
                posX = (int) location.getX();
                posY = (int) location.getY();
                panel.getGraphics().drawOval(posX - 15, posY - 15, 30, 30);
               // panel.getGraphics().setColor(Color.YELLOW);
               // panel.getGraphics().fillOval(posX - 15, posY - 15, 30, 30);
                //  System.out.print(posX +" "+ posY + " <-- inethod\n");
            }
        });
    }

    public static void main(String[] args) {
        Painting window = new Painting();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
