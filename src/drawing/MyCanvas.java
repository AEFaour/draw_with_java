package drawing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MyCanvas extends JPanel {

	private int width;
	private int height;
	

	public MyCanvas() {
		setLayout(null); 
		width = 100;
		height = 100;
		repaint();
		
		 
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(Color.BLACK);
		g.setColor(Color.WHITE);
		
		g.drawLine(200, 10 , 100, 20);
		g.drawRect(20, 50, 180, 120);
		g.drawRoundRect(20, 20, width, height, 350, 350);
		
		
	}
}
