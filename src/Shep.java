import java.awt.Color;
import java.awt.Graphics;

public class Shep extends Vehicle {
	/// ������ ��������� 
	  protected int carWidth = 100;
	  /// ������ ���������
	  protected int carHeight = 60;
	  public Shep (int maxSpeed, float weight, Color mainColor)
	  {
	      MaxSpeed = maxSpeed;
	      Weight = weight;
	      MainColor = mainColor;
	  }
	  public //override 
	  void MoveTransport(Direction direction, int _pictureWidth,
		    int _pictureHeight)
	  {
	      float step = MaxSpeed * 100 / Weight;
	      switch (direction)
	      {
	      	// ������
	      	case Right:
	      	    if (_startPosX + step < _pictureWidth- carWidth)
	      	    {
	      		_startPosX += step;
	      	    }
	      	    break;
	      	 //�����
	      	case Left:
	      	    if (_startPosX - step > 10)
	      	    {
	      		_startPosX -= step;
	      	    }
	      	    break;
	      	//�����
	      	case Up:
	      	    if (_startPosY - step > 50)
	      	    {
	      		_startPosY -= step;
	      	    }
	      	    break;
	      	//����
	      	case Down:
	      	    if (_startPosY + step < _pictureHeight - carHeight)
	      	    {
	      		_startPosY += step;
	      	    }
	      	    break;
	      	}
	     }
	  public //override 
	  void DrawCar(Graphics g,  int width, int height)
	  {
	      g.setColor(MainColor);
	      //������
	      g.fillRect(_startPosX, _startPosY, 60, 30);
	      // ���
	      g.drawLine( _startPosX + 60, _startPosY + 5, _startPosX + 75, _startPosY + 15);
	      g.drawLine( _startPosX + 75, _startPosY + 15, _startPosX + 60, _startPosY + 25);
	      //�����
	      g.drawLine( _startPosX, _startPosY + 5, _startPosX-10, _startPosY + 10);
	      g.drawLine( _startPosX - 10, _startPosY + 10, _startPosX - 10, _startPosY + 20);
	      g.drawLine( _startPosX - 10, _startPosY + 20, _startPosX, _startPosY + 25);
	  }
}
