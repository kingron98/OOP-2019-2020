package ie.tudublin;

import java.util.Arrays; 
import java.util.Collections; 

import processing.core.PApplet;

public class ArraysExample extends PApplet
{	

	//float[] rainFall = new float[12]; 
	float[] rainFall = {45, 37, 55, 27, 38, 50, 79, 48, 104, 31, 100, 58};
	String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		for(int i = 0 ; i < rainFall.length; i ++)
		{
			println(months[i] + "\t" + rainFall[i]);
		}

		for(float f:rainFall)
		{
			println(f);
		}

		for(String s:months)
		{
			println(s);
		}

		int minIndex = 0;
		for(int i = 1 ; i < rainFall.length ; i ++)
		{
			if (rainFall[i] < rainFall[minIndex])
			{
				minIndex = i;
			}
		}
		println(months[minIndex] + " had the minimum rainfall of " + rainFall[minIndex]);
		
		int maxIndex = 0;
		for(int i = 1 ; i < rainFall.length ; i ++)
		{
			if (rainFall[i] > rainFall[maxIndex])
			{
				maxIndex = i;
			}
		}
		println(months[maxIndex] + " had the maximum rainfall of " + rainFall[maxIndex]);

		// You can also calculate the minimum and max of an arry this way:
		// Note the array is of type Float not float
		// Float are objects float is a primitive type
		Float[] floatArray = {10.0f, 5.0f, 20.0f};
		float min = Collections.min(Arrays.asList(floatArray)); 
        float max = Collections.max(Arrays.asList(floatArray));
	}

	void drawBarChart()
	{
		float w = width / (float) rainFall.length;
		float cGap = 255 / (float) rainFall.length;
		noStroke();
		colorMode(HSB);
		for(int i = 0 ; i < rainFall.length ; i ++)
		{
			float x = i * w;
			fill(i * cGap, 255, 255);
			rect(x, height, w, -rainFall[i]);
		}
	}

	void drawTrendLine()
	{
		float border = height * 0.1f;

		
		for(int i = 0; i <= 150; i += 10)
		{
			float y = map(i, 0, 150, height - border, border);
			textAlign(RIGHT);
			text(i, border, y);
			line(border + 4, y - 5, border + 8, y - 5);
			if(i != 150)
			{
				line(border + 8, y, border + 8, y - ((height - border) / 15));
				// y + ((height - border) / 15)(y / 2) + 8)
			}
		}

		for(int i = 0; i < months.length; i ++)
		{
			float x = map(i, 0, months.length, border, width - border);			
			textAlign(LEFT);
			text(months[i], x, height - (border / 2));
			line(x + 8, height - border, x + 8, (height - border) - 4);
			if(months.length - 1 != i)
			{
				line(x + 4, (height - border) - 5, x + ((height - border) / months.length) + 4, (height - border) - 5);
			}
		}

		stroke(135, 206, 250);
		for(int i = 0; i < months.length - 1; i ++)
		{
			float x = map(i, 0, months.length, border, width - border);
			float y = map(rainFall[i], 0, 150, height - border, border);
			float y2 = map(rainFall[(i + 1) % 11], 0, 150, height - border, border);

			line(x + 8, y, x + ((height - border) / months.length) + 4, y2);
		}
	}

	public void keyPressed()
	{
		if (key == ' ')
		{
			
		}
	}	

	public void draw()
	{	
		background(0);		
		colorMode(HSB);	
		textSize(12);
		stroke(255);
		//drawBarChart();
		drawTrendLine();
	}
}
