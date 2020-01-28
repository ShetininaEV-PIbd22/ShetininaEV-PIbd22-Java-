import java.awt.Graphics;

public interface ITransport {
	 /// Установка позиции 
	  void SetPosition(int x, int y);
	  /// Изменение направления пермещения
	  void MoveTransport(Direction direction,  int _pictureWidth, int _pictureHeight);
	  /// Отрисовка автомобиля
	  void DrawCar(Graphics g, int width, int height);
}
