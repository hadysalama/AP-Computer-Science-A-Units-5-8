/*Repeat Lines
 *Hady Salama 
 *12/5/17
 */
import java.awt.*;
import java.applet.*;

public class L5RepeatLines extends Applet
{

	public void paint(Graphics g)
	{
		int y1 = 100;
		int y2 = 500;
		int x1 = 50;
		int x2 = 700;
		for (int x = 50; x < 700; x +=10)
			g.drawLine(x,y1,x,y2);
		for (int y = 100; y < 500; y +=10)
			g.drawLine(x1,y,x2,y);	
	}
}