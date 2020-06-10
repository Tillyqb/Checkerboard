package services;

import javax.swing.JFrame;
import java.awt.*;

public class DisplayGraphics extends Canvas
{
    public void paint(Graphics g)
    {
        setBackground(Color.WHITE);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0)
                    setForeground(Color.RED);
                else
                    setForeground(Color.BLACK);
                g.fillRect((40 * i), (40 * j), 40, 40);
            }
        }
    }

    public static void main(String[] args)
    {
        DisplayGraphics m = new DisplayGraphics();
        JFrame f = new JFrame();
        f.add(m);
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
