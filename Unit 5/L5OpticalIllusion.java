/*Optical Illusion
 *Hady Salama 
 *12/5/17
 */
import java.awt.*;
import java.applet.*;

public class L5OpticalIllusion extends Applet
{

	public void paint(Graphics g)
	{
		g.drawRect(50,50,500,500);
		for (int x = 50; x <= 550; x +=10)
			g.drawLine(x,50,600-x,550);
		for (int y = 50; y <= 550; y += 10)
			g.drawLine(50,y,550,600-y);		
		
		
	}
}




