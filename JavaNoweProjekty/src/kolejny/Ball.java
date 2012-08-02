package kolejny;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;
import javax.swing.*;

public class Ball extends JPanel{

	/**
	 * @param args
	 */
	
	private static final int GRAVITY = 3;
	private static final int xDimension = 5;
	private static final int yDimension = 5;
	private static final int startPosX = 10;
	private static final int startPosY = 10;
	private int  xCurrentPos = 10;
	private int  yCurrentPos = 10;
	

	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		this.setBackground(Color.WHITE);
		g.setColor(Color.BLUE);
		g.drawOval(xCurrentPos, yCurrentPos, xDimension, yDimension);
		g.fillOval(xCurrentPos, yCurrentPos, xDimension, yDimension);
		
		
	}
	public void animate(){
	
	}

}
