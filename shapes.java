import javax.swing.*;
import java.awt.*;

public class shapes extends JPanel {
    public void paintComponent(Graphics g) {
        // super.paintComponent(g);
        g.drawOval(50, 50, 100, 100);
        int x[] = {200, 250, 150};
        int y[] = {50, 150, 150};
        g.drawPolygon(x, y, 3);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Circle and Triangle");
        f.add(new shapes());
        f.setSize(400, 300);
        f.setVisible(true);
        
    }
}
