import java.awt.Color;
import java.awt.Graphics;

public class Plain3 implements IPlain  
{

	public void DrawPlain(Graphics g, Color color, int _startPosX, int _startPosY)
	{
	    g.setColor(color);
		g.drawLine(_startPosX +5, _startPosY, _startPosX +5, _startPosY+5);
		g.drawLine(_startPosX +3, _startPosY+3, _startPosX +7, _startPosY+3);
		g.drawLine(_startPosX +5, _startPosY, _startPosX +3, _startPosY+2);
		g.drawLine(_startPosX +5, _startPosY, _startPosX +7, _startPosY+2);
	}
}
