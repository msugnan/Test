import java.applet.*;
import java.awt.*;
/* <applet code ="MyApp.class"  height=400 width=400></applet>*/
public class MyApp extends Applet
{


public void init()
{
setBackground(Color.red);
}
public void paint(Graphics g)
{
g.drawString("Welcome",200,200);
g.drawRect(10,100,10,200);
}
}