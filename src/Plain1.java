import java.awt.Color;
import java.awt.Graphics;

public class Plain1 implements IPlain  
{

    public void DrawPlain(Graphics g, Color colorPlain,  int _startPosX, int _startPosY)
    {
	    	g.setColor(colorPlain);
			g.drawLine(_startPosX +5, _startPosY, _startPosX +5, _startPosY+5);
		    g.drawLine(_startPosX +3, _startPosY+2, _startPosX +7, _startPosY+2);
	}

}
