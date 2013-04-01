package filesio;

import java.io.*;

public class FilesIO {

    public static void main(String[] args) throws IOException {
        int a;
        try {
            //the absolute
            /*FileOutputStream cout = new FileOutputStream("C:/Users/Aiharo/Documents/NetBeansProjects/FilesIO/test.txt");
             FileInputStream cin = new FileInputStream("C:/Users/Aiharo/Documents/NetBeansProjects/FilesIO/test1.txt");*/
            //the relative 
            FileOutputStream cout = new FileOutputStream("test.txt");
            FileInputStream cin = new FileInputStream("test1.txt");
            a = cin.read();
            while (a != -1) {
                if (a == (int) ' ') {
                    a = '_';
                }
                cout.write(a);
                a = cin.read();
            }
            cout.close();
            cin.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
            System.out.println("Завершение работы программы!");
        }
    }
}
