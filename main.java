//👋 Hi, I’m @ghjdrherg
// Hi, Its ver. 1.1 of calculator. I removed the constr. Calling argument
//this. from line 37 Because 
//idk why i kept. this. in there line. 
//put the constructor JLabel into the code in front of Jlabel object
//plus, some working with components. (Containercomponents) 
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
                System.out.println(");
                Scanner scanner = new Scanner(System.in);
                int a = scanner.nextInt();
                System.out.println("Введите степень:");
                Scanner scannerr = new Scanner(System.in);
                int b = scannerr.nextInt();
            }
        }
        JLabel label1 = new JLabel("Result");



         JLabel label2 = new JLabel("Введите число, которое вы бы"/n" хотели возвести в степень:",CENTER)
        JFrame frame = new JFrame("Calculator");

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(500, 150));
        frame.setVisible(true);
        frame.pack();

        Container container = getContentPane();
        container.setLayout(new GridLayout(3,2,2,2));
       container.add(label2);
      


        
        
        
        



   
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
