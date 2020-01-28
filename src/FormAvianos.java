import java.awt.Graphics;
import javax.swing.JFrame;

public class FormAvianos extends JFrame{
	 //private Vehicle shep;
	 private ITransport shep;
	    
	    FormAvianos(String title) 
	    {
		setTitle(title);
	    }
	    public void paint(Graphics g) {
		super.paint(g);
		if (shep != null)
		{
		   shep.DrawCar(g, this.getWidth(), this.getHeight());
		}
	    }
	    public void Set(ITransport transport) {
		System.out.println("Create");
		shep = transport;
		repaint();
	    }
}
