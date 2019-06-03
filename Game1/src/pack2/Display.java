package pack2;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Display {
	private JFrame frame;
	private Canvas canvas; // allows to use graphics
	
	private String title;
	private int width, height;
	
	public Display(String title,int width, int height){
		this.title=title;
		this.width=width;
		this.height=height;
		createDisplay();
	}
	
	private void createDisplay() {
		frame = new JFrame(title);
		frame.setSize(width, height);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
		
		canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(width, height));//creates PreferredSize of Dimension
		canvas.setMaximumSize(new Dimension(width, height));
		canvas.setMinimumSize(new Dimension(width, height));
		
		frame.add(canvas);
		frame.pack();// Used to adjust canvas in the frame
	}
	public Canvas getCanvas() {// getter, to return canvas to render
		return canvas;
	}
	
}
