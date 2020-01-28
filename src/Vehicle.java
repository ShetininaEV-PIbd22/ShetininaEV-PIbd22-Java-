import java.awt.Color;
import java.awt.Graphics;

public abstract class Vehicle implements ITransport {
	/// Левая координата отрисовки 
	  protected int _startPosX;
	  /// Правая кооридната отрисовки 
	  protected int _startPosY;
	  /// Ширина окна отрисовки
	  protected int _pictureWidth;
	  //Высота окна отрисовки
	  protected int _pictureHeight;
	  /// Максимальная скорость
	  public int MaxSpeed;
	  /// Вес автомобиля
	  public float Weight;
	  /// Основной цвет 
	  public Color MainColor;
	  
	  public void SetPosition(int x, int y)
	  {
	  _startPosX = x;
	  _startPosY = y;
	  }
	  public abstract void DrawCar(Graphics g,  int width, int height);
	  public abstract void MoveTransport(Direction direction,  int _pictureWidth, int _pictureHeight);

}
