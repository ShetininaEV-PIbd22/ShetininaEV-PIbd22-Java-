import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Program {
	private FormAvianos frame;
	ITransport transport = null;
	private CountPlain CountPlain;
	private PlaneType PlainType;

    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable()
	{
		public void run()
		{
			try 
			{
				Program window = new Program();
				window.frame.setVisible(true);
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	});
    }

    public Program() 
	{
		initialize();
	}
    private void MoveTransport(Direction dir)
    {
		if ( transport==null) 
		    return;
    	Dimension size = frame.getContentPane().getSize();
    	transport.MoveTransport(dir, size.width ,size.height);
    	frame.repaint(); 	
    }
    private void initialize() 
	{
		frame = new FormAvianos("Avianosec");
		frame.setBounds(100, 100, 900, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JButton buttonCreateShep = new JButton("Create Shep");
		buttonCreateShep.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
			    transport = new Shep(((int)Math.random()*50), ((int)Math.random()*300), Color.blue);
			    transport.SetPosition(100, 100);
			    frame.Set(transport);
			    frame.repaint();
			}
		});
		buttonCreateShep.setBounds(0,0, 150, 30);
		frame.add(buttonCreateShep);
		JButton buttonCreateAvia = new JButton("Create Avianos");
		buttonCreateAvia.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
			    
			    CountPlain[] plains = CountPlain.values();
			    int count= (int)(Math.random()*4);
			    System.out.println("Count plain= "+plains[count]);
			    
			    PlaneType[] PlainType = PlaneType.values();
			    int type= (int)(Math.random()*3);
			    System.out.println("Type plain= "+PlainType[type]);
			    transport = new Avianos(((int)Math.random()*50), ((int)Math.random()*300), Color.blue, 
				    Color.yellow, true, true, true, Color.cyan, true, true, plains[count],PlainType[type]); //PlaneType.Type2);
			    transport.SetPosition(100, 100);
			    frame.Set(transport);
			    frame.repaint();
			    
			}
		});
		buttonCreateAvia.setBounds(150,0, 150, 30);
		frame.add(buttonCreateAvia);
		ImageIcon iconUp = new ImageIcon("E:\\3 семестр\\Up.png");
	        Image img = iconUp.getImage() ;
	        Image newimg = img.getScaledInstance( 30, 30,  java.awt.Image.SCALE_SMOOTH ) ;
	        iconUp = new ImageIcon(newimg);
	        
	        JButton buttonUp = new JButton(iconUp);
			buttonUp.setBounds(770, 370, 30, 30);
			buttonUp.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				    System.out.println("Up");
				    MoveTransport(Direction.Up);
				}
			});
			frame.add(buttonUp);
			ImageIcon iconDown = new ImageIcon("E:\\3 семестр\\Down.png");
	        img = iconDown.getImage() ;
	        newimg = img.getScaledInstance( 30, 30,  java.awt.Image.SCALE_SMOOTH ) ;
	        iconDown = new ImageIcon(newimg);
			
	        JButton buttonDown = new JButton(iconDown);
			buttonDown.setBounds(770, 400, 30, 30);
			buttonDown.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				    System.out.println("Down");
				    MoveTransport(Direction.Down);
				}
			});

			frame.add(buttonDown);
			ImageIcon iconLeft = new ImageIcon("E:\\3 семестр\\left.png");
	        img = iconLeft.getImage() ;
	        newimg = img.getScaledInstance( 30, 30,  java.awt.Image.SCALE_SMOOTH ) ;
	        iconLeft = new ImageIcon(newimg);
			
	        JButton buttonLeft = new JButton(iconLeft);
			buttonLeft.setBounds(740, 400, 30, 30);
			buttonLeft.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				    System.out.println("Left");
				    MoveTransport(Direction.Left);
				}
			});
			frame.add(buttonLeft);
			ImageIcon iconRight = new ImageIcon("E:\\3 семестр\\Right.png");
	        img = iconRight.getImage() ;
	        newimg = img.getScaledInstance( 30, 30,  java.awt.Image.SCALE_SMOOTH ) ;
	        iconRight = new ImageIcon(newimg);
			
	        JButton buttonRight = new JButton(iconRight);
			buttonRight.setBounds(800, 400, 30, 30);
			buttonRight.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				    System.out.println("Right");
				    MoveTransport(Direction.Right);				
				}
			});
			frame.add(buttonRight);
	}
}
