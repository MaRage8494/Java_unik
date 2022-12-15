import java.awt.*;
import java.awt.Shape;
import java.awt.event.*;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderableImage;
import java.text.AttributedCharacterIterator;
import java.util.Map;
import javax.swing.*;

public class Work extends JFrame{
    public int shape;
    MyPanel panel;
    JPanel[] pnl = new JPanel[20];
    public Work(){
        panel = new MyPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.setBackground(Color.black);
        this.pack();
        this.setLocationRelativeTo(null);
    }
}
