package services;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

public class DisplayGraphics extends Canvas
{
    public void paint(Graphics g)
    {
        setBackground(Color.WHITE);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0)
                    g.setColor(Color.RED);
                else
                    g.setColor(Color.BLACK);
                g.fillRect(40 + (40 * i), 40 + (40 * j), 40, 40);
            }
        }
    }

    public static void main(String[] args)
    {
        DisplayGraphics m = new DisplayGraphics();
        JFrame f = new JFrame();
        f.add(m);
        f.setSize(400, 440);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
