import java.awt.Color;
import java.awt.Graphics;

public class Plain {
	public CountPlain planeCount;
    public Plain(CountPlain PlaneCount)
    {
	planeCount=PlaneCount;
    }
    public void DrawPlain(Graphics g, int _startPosX, int _startPosY)
    {
    int count;
	  if (planeCount == CountPlain.Three)
		  count = 3;
	  else if (planeCount == CountPlain.Four)
		  count = 4;
	  else if (planeCount == CountPlain.Five)
		  count = 5;
	  else count = 6;
    for (int i = 0; i < count; i++)
    {
  	  g.setColor(Color.red);
        g.drawLine((_startPosX + i * 10)+5, _startPosY, (_startPosX + i * 10)+5, _startPosY+5);
        g.drawLine((_startPosX + i * 10)+3, _startPosY+2, (_startPosX + i * 10)+7, _startPosY+2);
    }
    }
}
