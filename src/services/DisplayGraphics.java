package services;

import javax.swing.JFrame;
import java.awt.*;

public class DisplayGraphics extends Canvas
{
    public void paint(Graphics g)
    {
        setBackground(Color.WHITE);
        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                if ((i+j)%2==0)
                    setForeground(Color.RED);
                else
                    setForeground(Color.BLACK);
                g.fillRect((20*i),(20*j),20,20);
            }
        }
    }
    public static void main(String[] args)
    {
        DisplayGraphics m=new DisplayGraphics();
        JFrame f=new JFrame();
        f.add(m);
        f.setSize(200,200);
        f.setVisible(true);
    }
}
