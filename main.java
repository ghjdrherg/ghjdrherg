//👋 Hi, I’m @ghjdrherg
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Locale;
import java.util.Scanner;
import javax.imageio.spi.RegisterableService;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.Graphics;

public class Main extends JFrame
{
    public Main ()
    {
         class InputData{
            public void InputData(){
                System.out.println("Введите число, которое вы бы хотели возвести в степень:");
                Scanner scanner = new Scanner(System.in);
                int a = scanner.nextInt();
                System.out.println("Введите степень:");
                Scanner scannerr = new Scanner(System.in);
                int b = scannerr.nextInt();
            }
        }
        JLabel label1 = new JLabel("Result");
         JLabel label2 = new JLabel("Введите число, которое вы бы\n хотели возвести в степень:");
        JFrame frame = new JFrame("Calculator");

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(500, 150));
        frame.setVisible(true);
        frame.pack();

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,2,2,2));
        container.add(label2);
        label1.setSize(50,50);
                label1.setText("");
                
    }
    public static void main(String[] args)
    {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new Main();
    }
}
//
//ghjdrherg/ghjdrherg is a ✨ special ✨ repository because its `README.md` (this file) appears on your GitHub profile.
//You can click the Preview link to take a look at your changes.
//
