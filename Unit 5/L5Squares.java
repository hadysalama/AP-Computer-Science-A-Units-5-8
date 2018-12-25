/*Repeat Lines
 *Hady Salama 
 *12/5/17
 */
import java.awt.*;
import java.applet.*;

public class L5Squares extends Applet
{

	public void paint(Graphics g)
	{
	/*	int y = 500;
		for (int x = 50; x < 300; x+=10, y-=20)
			g.drawRect(x,x,y+30,y+15);
		*/
		int y1 = 0;
		int y2 = 600;
		for (int x1 = 50; x1<=300; x1+=10,y1+=10,y2-=10)
		{
			g.drawLine(x1,y1,x1,y2);
		}
		int y3 = 250;
		int y4 = 350;
		for (int x2 = 400; x2<=650; x2+=10,y3-=10,y4+=10)
		{
			g.drawLine(x2,y3,x2,y4);
		}
		int x3 = 50;
		int x4 = 650;
		for (int y5 = 0; y5<=250; y5+=10,x3+=10,x4-=10)
		{
			g.drawLine(x3,y5,x4,y5);
		}
		int x5 = 300;
		int x6 = 400;
		for (int y6 = 350; y6<=600; y6+=10,x5-=10,x6+=10)
		{
			g.drawLine(x5,y6,x6,y6);
		}		
	}
}