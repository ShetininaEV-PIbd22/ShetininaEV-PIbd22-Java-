import java.awt.Graphics;

public interface ITransport {
	 /// ��������� ������� 
	  void SetPosition(int x, int y);
	  /// ��������� ����������� ����������
	  void MoveTransport(Direction direction,  int _pictureWidth, int _pictureHeight);
	  /// ��������� ����������
	  void DrawCar(Graphics g, int width, int height);
}
