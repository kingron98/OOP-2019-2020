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
		x = 250;
		y = 250;
		xx = 0;
		yy = 0;
	}

	
	public void keyPressed()
	{

		// moire pattern
		// stroke(0);
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
		// stroke(0);
		// for(x = 50; x < 500; x+=50)
		// {
		// 	ellipse(x, 50, 50, 50);
		// }

		// bar pattern
		// float barSize = width * 0.1f;
		// float bColor = 255 / ((width / barSize) + 4);
		// noStroke();
		// colorMode(HSB);
		// for(int i = 0; i < width; i++)
		// {
		// 	float x = i * barSize;
		// 	fill(i * bColor, 255, 255);
		// 	rect(x, 0, barSize, height);
		// }

		// circle loop pattern color
		// noStroke();
		// float cSize = width * 0.1f;
		// float cColor = 255 / ((width / cSize ) + 4);
		// float start = 25;
		// colorMode(HSB);
		// for(int i = 0; i < width / cSize; i++)
		// {
		// 	float x = (i * cSize) + start;
		// 	fill(i * cColor, 255, 255);
		// 	ellipse(x, height / 2, cSize, cSize);
		// }

		// nested circle loop // figure out even colors
		float cSize = width * 0.1f;
		float start = 25;
		float size = 0;
		float cColor = 255 / (((width / cSize) * (width / cSize)));
		colorMode(HSB);
		for(int i = 0; i < width / cSize; i++)
		{
			size = i * (width / cSize);
			float x = (i * cSize) + start;
			for(int j = 0; j < height / cSize; j++)
			{
				float y = (j * cSize) + start;
				float c = (j * i * cColor + size) % 255;
				fill(c, 255, 255);
				circle(x, y, cSize);
				size += (width / cSize);
			}
		}
	}	


	public void draw()
	{	
		background(0);
		colorMode(HSB);		
		keyPressed();
	}
}
