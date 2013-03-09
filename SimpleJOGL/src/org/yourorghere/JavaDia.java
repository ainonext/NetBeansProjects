package org.yourorghere;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.media.opengl.GLCanvas;

public class JavaDia implements Runnable {

    static Thread displayT = new Thread(new JavaDia());
    static boolean bQuit = false;

    public static void main(String[] args) {
        displayT.start();
    }

    public void run() {
        final Frame frame = new Frame("Jogl 3D Shape/Rotation");
        GLCanvas canvas = new GLCanvas();
        canvas.addGLEventListener(new JavaRenderer());
        //frame.add(canvas, BorderLayout.CENTER); ��������� ������������ ��� ��� ��� � ��������� ������
        frame.add(canvas);
        frame.setSize(500, 500); // ������������� ������� ����
        // frame.setUndecorated(true); ������ ������� ����� � ��������
        // int size = frame.getExtendedState();
        // size |= Frame.NORMAL;
        //frame.setExtendedState(size);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
               bQuit = true;
               System.exit(0); // �������� ���� ���������
            }
        });

        frame.setVisible(true);
        // frame.show();
        canvas.requestFocus();
       while (!bQuit) {
            canvas.display();
        }
    }
}