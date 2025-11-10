import java.awt.*;
import java.applet.*;
class smiley extends Applet{
    public void paint(Graphics g){
// <Applet code=smiley.class width="300" height="300"></Applet>
        g.setColor(color.YELLOW);
        g.fillOval(50,50,200,200);
        g.setColor(color.BLACK);
        g.fillOval(100,100,20,20);
        g.fillOval(100,100,20,20);
        g.drawArc(100,150,100,50,180);
        
    }
}