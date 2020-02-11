package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet
{	
	public void settings()
	{
		size(500, 500);
	}

	float x, y, xx, yy;
	int count = 0;

	public void setup() 
	{
		colorMode(HSB);
		x = 250;
		y = 250;
		xx = 0;
		yy = 0;
	}

	
	public void keyPressed()
	{
		stroke(0);

		// moire pattern
		// strokeWeight(3);
		// for(int i = 0; i <= width; i += 25)
		// {
		// 	line(x, y, i, yy);
		// }
		// for(int i = 0; i <= width; i += 25)
		// {
		// 	line(x, y, xx, i);
		// }
		// for(int i = 0; i <= width; i += 25)
		// {
		// 	line(x, y, i, width);
		// }
		// for(int i = 0; i <= width; i += 25)
		// {
		// 	line(x, y, width, i);
		// }
		
		// circle loop pattern
		// for(x = 50; x < 500; x+=50)
		// {
		// 	ellipse(x, 50, 50, 50);
		// }
	}	


	public void draw()
	{	
		background(200);		
		keyPressed();
	}
}
