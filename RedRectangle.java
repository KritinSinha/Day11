import java.applet.*;
import java.awt.*;

public class RedRectangle extends Applet
{
public void paint(Graphics g)
{
g.setColor(Color.red);
g.fillRect(300,150,550,300);
}
}