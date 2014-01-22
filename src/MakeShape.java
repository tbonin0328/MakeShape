import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GLabel;
import acm.graphics.GObject;
//import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class MakeShape extends GraphicsProgram
{
	private static final int SHAPE_WIDTH = 150;
	private static final int SHAPE_HEIGHT = 150;
	
	public void run()
	{
		addMouseListeners();
		setSize(SHAPE_WIDTH*2,SHAPE_HEIGHT*2);
		makeShape(75, 60, SHAPE_HEIGHT,SHAPE_HEIGHT, Color.YELLOW);
	}
	
	public void makeShape (int xVal, int yVal, int width, int height, Color color)
	{
		// Create GRect object that can be used for all bricks in program:
		
		GRect shape;
		shape = new GRect(xVal, yVal, width, height);
		shape.setFillColor(color);
		shape.setFilled(true);
		add(shape);
	}//end makeBrick method
	
	public void mouseClicked(MouseEvent e)
	{
		GObject maybeObject = getElementAt(e.getX(), e.getY());
		
		if(maybeObject == null) return;

		remove(maybeObject);
	}
	
}
