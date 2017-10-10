package Command.example3;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
 
public class Rec extends JFrame{
    Rec(){
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void paint(Graphics g){
        g.setColor(Color.blue);
        g.drawRect(80, 80, 80, 80);
      // g.fillRect(150, 150, 50, 50);
    }
    public static void main(String[] args) {
        new Rec();
    }
}