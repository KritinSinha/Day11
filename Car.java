import java.applet.*;
import java.awt.*;

public class Car extends Applet
{
public void paint(Graphics g)
{
int x[]={500,750,1000,1250,1400,1600,1650,1625,1750,750,500};
int y[]={375,200,200,200,375,375,450,500,500,500,500};
g.fillOval(1400,500,150,150);
g.fillOval(750,500,150,150);
int n=x.length;
g.drawPolygon(x,y,n);
}
}

