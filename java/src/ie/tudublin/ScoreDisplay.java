package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class ScoreDisplay extends PApplet
{
	//ArrayList
	ArrayList<Note> notes = new ArrayList<Note>();


	//String score = "DEFGABcd";
	//String score = "D2E2F2G2A2B2c2d2";
	String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";
	
	public void settings()
	{
		size(1000, 500);

		// How to convert a character to a number
		char c = '7'; // c holds the character 7 (55)
		int i = c - '0'; // i holds the number 7 (55 - 48) 
		println(i);
	}

	public void loadScores()
	{
		int dur;

		for(int i=0; i< score.length(); i++)
		{
			char note = score.charAt(i);

			if( i < score.length() -1 && Character.isDigit(score.charAt(i+1)) == true)
			{
				dur = 2;
				i = i + 1;
			}
			else
			{
				dur = 1;
			}

			Note n = new Note(note,dur);
			notes.add(n);
		}
	}

	public void printScores()
	{
		
		for(Note n : notes)
		{
			println(n.getNote() + 
			"\t" + n.getDuration() + 
			"\t"+ (n.getDuration() == 1 ? "Quaver" : "Crotchet"));
		}
	}



	public void setup() 
	{
		loadScores();
		printScores();
	}

	public void draw()
	{
		background(255);
		
		staveLines();
		drawNotes();
		
	}

	public void staveLines()
	{
		
		
		float border = 0.1f * width;
	

		for( int i =0; i < 5; i++)
		{
			float y = map(i, -5, 5, border, height - border);
		
			
	
		line(border, y, width - border, y);
		}

	}

	void drawNotes()
	{
		int i = 0;
		for(Note N: notes)
		{
			char z = N.getNote();
			if(z == 'D')
			{
				if(mouseX > (108+i*26)-9 && mouseX < (110+i*26)+9)
				{
					fill(255,0,0);
				}
				else
				{
					fill(0);
				}
				
				circle(108+i*26, 290, 15);
				line(115, 290, 115, 237);
			}
			if(z == 'D')
			{
				fill(0);
				circle(108+i*26, 290, 15);
				line(115, 290, 115, 237);
			}

			if(z == 'E')
			{
				fill(0);
				circle(108+i*26, 290, 15);
				line(115, 290, 115, 237);
			}

			if(z == 'F')
			{
				fill(0);
				circle(108+i*26, 290, 15);
				line(115, 290, 115, 237);
			}

			if(z == 'G')
			{
				fill(0);
				circle(108+i*26, 290, 15);
				line(115, 290, 115, 237);
			}

			if(z == 'A')
			{
				fill(0);
				circle(108+i*26, 290, 15);
				line(115, 290, 115, 237);
			}

			if(z == 'B')
			{
				fill(0);
				circle(108+i*26, 290, 15);
				line(115, 290, 115, 237);
			}

			if(z == 'c')
			{
				fill(0);
				circle(108+i*26, 290, 15);
				line(115, 290, 115, 237);
			}

			if(z == 'd')
			{
				fill(0);
				circle(108+i*26, 290, 15);
				line(115, 290, 115, 237);
			}
			i++;
		}
	}
}
