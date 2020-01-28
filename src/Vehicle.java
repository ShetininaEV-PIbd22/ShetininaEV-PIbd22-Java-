import java.awt.Color;
import java.awt.Graphics;

public abstract class Vehicle implements ITransport {
	/// ����� ���������� ��������� 
	  protected int _startPosX;
	  /// ������ ���������� ��������� 
	  protected int _startPosY;
	  /// ������ ���� ���������
	  protected int _pictureWidth;
	  //������ ���� ���������
	  protected int _pictureHeight;
	  /// ������������ ��������
	  public int MaxSpeed;
	  /// ��� ����������
	  public float Weight;
	  /// �������� ���� 
	  public Color MainColor;
	  
	  public void SetPosition(int x, int y)
	  {
	  _startPosX = x;
	  _startPosY = y;
	  }
	  public abstract void DrawCar(Graphics g,  int width, int height);
	  public abstract void MoveTransport(Direction direction,  int _pictureWidth, int _pictureHeight);

}
