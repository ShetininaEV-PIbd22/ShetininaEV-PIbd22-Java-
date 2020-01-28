import java.awt.Graphics;

import javax.swing.JFrame;

public class FormAvia extends JFrame {
private Avianos _avianos;
    
    FormAvia(String title) 
    {
	setTitle(title);
    }
    
    public void paint(Graphics g) {
	super.paint(g);
	if (_avianos != null)
	{
	   _avianos.drawBomber(g, this.getWidth(), this.getHeight());
	}
}

    public void SetBomber(Avianos avianos) {
	System.out.println("Create");

	_avianos = avianos;
	repaint();
    }
}
