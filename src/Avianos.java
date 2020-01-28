import java.awt.Color;
import java.awt.Graphics;

public class Avianos {
	 /// ����� ���������� ���������
    private int _startPosX;
    /// ������ ���������� ���������
    private int _startPosY;
    /// ������ ���������
    final int carWidth = 100;
    /// ������ ���������
    final int carHeight = 60;
    // ����� ���������
    int planeCount = 0;
    
    /// ������������ ��������
    public int MaxSpeed; 
    /// ��� ����������
    public int Weight;
    /// �������� ���� ������
    public Color MainColor; 
    /// �������������� ���� �������� 
    public Color DopColor; 
    /// ������� ������� ��������� ������
    public boolean FirstLift;
    /// ������� ������� ������� ������
    public boolean SecondLift;
    // ������� ������ �����
    public boolean Rubka; 
    Plain plane;
    public Avianos(int maxSpeed, int weight, Color mainColor, Color dopColor, boolean firstLift, boolean secondLift, boolean rubka, CountPlain count)
    {
        MaxSpeed = maxSpeed;
        Weight = weight;
        MainColor = mainColor;
        DopColor = dopColor;
        FirstLift = firstLift;
        SecondLift = secondLift;
        Rubka=rubka;
        //planeCount = planes;
        plane= new Plain(count);
        
    }
    public void SetPosition(int x, int y)
    {
        _startPosX = x;
        _startPosY = y;
    }

    public void MoveTransport(Direction direction, int _pictureWidth, int _pictureHeight)
    {
        float step = 10; //MaxSpeed * 100 / Weight;
        switch (direction)
        {
            // ������
            case Right:
                if (_startPosX + step < _pictureWidth - carWidth)
                {
                    _startPosX += step;
                }
                break;
            //�����
            case Left:
                if (_startPosX - step > 0)
                {
                    _startPosX -= step;
                }
                break;
            //�����
            case Up:
                if (_startPosY - step > 20)
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
        System.out.println("x="+_startPosX+" y="+_startPosY);
    }
    
    public void drawBomber(Graphics g, int width, int height) {
	  g.setColor(MainColor);
	  g.fillRect(_startPosX, _startPosY, 60, 30);
	  // ���
	  g.setColor(MainColor);
	  g.drawLine( _startPosX + 60, _startPosY + 5, _startPosX + 75, _startPosY + 15);
	  g.drawLine( _startPosX + 75, _startPosY + 15, _startPosX + 60, _startPosY + 25);
	  //�����
	  g.setColor(MainColor);
	  g.drawLine( _startPosX, _startPosY + 5, _startPosX-10, _startPosY + 10);
	  g.drawLine( _startPosX - 10, _startPosY + 10, _startPosX - 10, _startPosY + 20);
	  g.drawLine( _startPosX - 10, _startPosY + 20, _startPosX, _startPosY + 25);
	  // ������ 1�� ����
	  if (FirstLift)
	  {
	       g.setColor(DopColor);
	       g.fillRect( _startPosX + 10, _startPosY+10, 10, 10);
	  }
	  // ������ 2�� ����
	  if (SecondLift)
	  {
	     g.setColor(DopColor);
	     g.fillRect( _startPosX + 40, _startPosY + 10, 10, 10);
	  }
	  if (Rubka)
	  {
	      g.setColor(DopColor);
	      g.fillRect( _startPosX + 30, _startPosY + 25, 5, 5);
	  }
	  plane.DrawPlain(g, _startPosX, _startPosY);
    }
}
