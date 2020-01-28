import java.awt.Color;
import java.awt.Graphics;

public class Avianos extends Shep {
	/// Дополнительный цвет разметки 
    public Color DopColor; 
    // Признак наличия переднего лифтов
    public boolean FirstLift;
    // Признак наличия заднего лифтов
    public boolean SecondLift;
    //признак наличия рубки
    public boolean Rubka; 
    // Дополнительный цвет
    public Color DopColor_1;
    // Признак наличия ор
    public boolean Orudie;
    // признак разметки
    public boolean Razmetka;
    IPlain[] plains = null;
 
    public Avianos(int maxSpeed, int weight, 
    		Color mainColor, Color dopColor,boolean firstLift,
    		boolean secondLift, boolean rubka, Color dopColor_1, 
    		boolean orudie, boolean razmetka, CountPlain countPlain,
    		PlaneType type)
    { 
    	super(maxSpeed, weight, mainColor);
        DopColor = dopColor;
        FirstLift = firstLift;
        SecondLift = secondLift;
        Rubka = rubka;
        DopColor_1 = dopColor_1;
        Orudie = orudie;
        Razmetka = razmetka;
        plains = new IPlain[countPlain.count()];
        for (int i=0; i<plains.length; i++)
        	plains[i] = type.create();
    }
    public void DrawCar(Graphics g,  int width, int height)
    {
	 super.DrawCar(g, width, height);
         g.setColor(DopColor);
         if (FirstLift)
         {
             g.fillRect( _startPosX + 10, _startPosY + 10, 10, 10);
         }
         if (SecondLift)
         {
             g.fillRect( _startPosX + 40, _startPosY + 10, 10, 10);
         }
         if (Rubka)
         {
             g.fillRect( _startPosX + 30, _startPosY + 25, 5, 5);
         }
         g.setColor(DopColor_1);
         if (Orudie)
         {
            g.fillRect( _startPosX + 62, _startPosY + 12, 3, 3);
         }
         if (Razmetka)
         {
             g.drawLine( _startPosX + 20, _startPosY + 15, _startPosX + 40, _startPosY + 15);
         }
         if (plains != null)
        	 for (int i=0; i<plains.length; i++)
        		 plains[i].DrawPlain(g, DopColor_1, (_startPosX + (i*10)), _startPosY);
    }
}
