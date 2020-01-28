import java.awt.Color;
import java.awt.Graphics;

public class Avianos {
	 /// Левая координата отрисовки
    private int _startPosX;
    /// Правая кооридната отрисовки
    private int _startPosY;
    /// Ширина отрисовки
    final int carWidth = 100;
    /// Ширина отрисовки
    final int carHeight = 60;
    // число самолетов
    int planeCount = 0;
    
    /// Максимальная скорость
    public int MaxSpeed; 
    /// Вес автомобиля
    public int Weight;
    /// Основной цвет палубы
    public Color MainColor; 
    /// Дополнительный цвет разметки 
    public Color DopColor; 
    /// Признак наличия переднего лифтов
    public boolean FirstLift;
    /// Признак наличия заднего лифтов
    public boolean SecondLift;
    // Признак наличя рубки
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
            // вправо
            case Right:
                if (_startPosX + step < _pictureWidth - carWidth)
                {
                    _startPosX += step;
                }
                break;
            //влево
            case Left:
                if (_startPosX - step > 0)
                {
                    _startPosX -= step;
                }
                break;
            //вверх
            case Up:
                if (_startPosY - step > 20)
                {
                    _startPosY -= step;
                }
                break;
            //вниз
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
	  // нос
	  g.setColor(MainColor);
	  g.drawLine( _startPosX + 60, _startPosY + 5, _startPosX + 75, _startPosY + 15);
	  g.drawLine( _startPosX + 75, _startPosY + 15, _startPosX + 60, _startPosY + 25);
	  //корма
	  g.setColor(MainColor);
	  g.drawLine( _startPosX, _startPosY + 5, _startPosX-10, _startPosY + 10);
	  g.drawLine( _startPosX - 10, _startPosY + 10, _startPosX - 10, _startPosY + 20);
	  g.drawLine( _startPosX - 10, _startPosY + 20, _startPosX, _startPosY + 25);
	  // рисуем 1ый лифт
	  if (FirstLift)
	  {
	       g.setColor(DopColor);
	       g.fillRect( _startPosX + 10, _startPosY+10, 10, 10);
	  }
	  // рисуем 2ой лифт
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
