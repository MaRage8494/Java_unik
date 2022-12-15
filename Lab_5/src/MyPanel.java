import javax.swing.*;
import java.awt.*;
import java.awt.Shape;
import java.awt.geom.*;

public class MyPanel extends JPanel{
    public MyPanel(){
        this.setPreferredSize(new Dimension(1000,1000));
    }
    @Override
    public void paint(Graphics g) {
        int shape;
        Graphics2D g2d = (Graphics2D) g;
        for (int y = 0; y <= 1000; y+= 200){
            for (int x = 0; x <= 1000; x+=200) {
                shape = (int)(Math.random()*3);
                if (shape == 1) {
                    g2d.setPaint(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
                    g2d.draw(new Rectangle2D.Double(x + 50, y + 20, 40, 50));
                    g2d.fillRect(x + 50, y + 20, 40, 50);
                }
                else if (shape == 2) {
                    g2d.setPaint(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
                    g2d.draw(new Ellipse2D.Double(x + 50, y + 20, 40, 80));
                    g2d.fillOval(x + 50, y + 20, 40, 80);
                }
                else{
                    g2d.setPaint(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
                    g2d.draw(new Line2D.Double(x+50,y + 20, x + 70, y + 100));
                }
            }
        }
    }
}
