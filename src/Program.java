import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Program {
	 private FormAvia frame;
	    private Avianos avianos = null;
	    private CountPlain CountPlain;
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
		if (avianos == null) 
		    return;
		Dimension size = frame.getContentPane().getSize();
		avianos.MoveTransport(dir, size.width ,size.height);
		frame.repaint();
	    }
	    private void initialize() 
		{
	    	frame = new FormAvia("Avianosec");
			frame.setBounds(100, 100, 900, 500);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			frame.setVisible(true);
			
			JButton buttonCreate = new JButton("Create");
			buttonCreate.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e) 
				{
				    CountPlain[] plains = CountPlain.values();
				    int count= (int)(Math.random()*4);
				    System.out.println("Count plain= "+count);
				    avianos= new Avianos(((int)Math.random()*50), ((int)Math.random()*300), Color.blue, 
					    Color.yellow, true, true, true, plains[count]);
				    avianos.SetPosition(100, 100);
				    frame.SetBomber(avianos);
				    frame.repaint();
				}
			});
			buttonCreate.setBounds(0,0, 100, 30);
			frame.add(buttonCreate);
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
