package kadeewee.weerachat.lab9;

/**
 * ไม่เกี่ยวกับงานที่ส่ง
 **/

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class DiceDraw extends JPanel {
    static final long serialVersionUID = -2085534156886951015L;
    // x =10, y = 10, width = 200, height = 200
    private Ellipse2D.Double circle =
            new Ellipse2D.Double(183,120,30,30);
    private Rectangle2D.Double square =
            new Rectangle2D.Double(93,40,200,200);
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(Color.WHITE);
        g2d.fill(square);
        g2d.setColor(Color.RED);
        g2d.fill(circle);
    }
}
