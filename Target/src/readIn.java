import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class readIn 
{ 
	Scanner input; 
	Color backColor; 
	int newDifficulty; 
	public void openFile()
	{
		try
		{
			input = new Scanner(new File("settings.txt"));
		}
		catch (FileNotFoundException ex)
		{
			JOptionPane.showMessageDialog(null, ex.toString(), "Error",
                    JOptionPane.ERROR_MESSAGE);
		}
	}
	public void readInSettings()
	{
		try 
		{
			while (input.hasNext())
			{
				int settingInput = input.nextInt();
				if (settingInput == 0)
				{
					setDifficulty(500);  
				}
				else if (settingInput == 1)
				{
					setDifficulty(800); 
				}
				else if (settingInput == 2)
				{
					setDifficulty(1100); 
				}
				if (settingInput == 3)
				{
					setColor(Color.BLACK); 
				}
				else if (settingInput == 4)
				{
					setColor(Color.BLUE); 
				}
				else if (settingInput == 5)
				{
					setColor(Color.GREEN); 
				}
				else if (settingInput == 6)
				{
					setColor(Color.YELLOW); 
				}
				else if (settingInput == 7)
				{
					setColor(Color.WHITE); 
				}
			}
		}
		catch(NoSuchElementException ex)
		{
			JOptionPane.showMessageDialog(null, ex.toString(), "Error",
                    JOptionPane.ERROR_MESSAGE);
		}
		catch(IllegalStateException ex)
		{
			JOptionPane.showMessageDialog(null, ex.toString(), "Error",
                    JOptionPane.ERROR_MESSAGE);
		}
	}
	public void closeReadFile()
	{
		if (input != null)
		{
			input.close();
		}
	}
	public void setDifficulty(int difficulty)
	{
		newDifficulty = difficulty;
	}
	public int getDifficulty()
	{
		return newDifficulty;
	}
	public void setColor(Color color)
	{
		backColor = color; 
	}
	public Color getColor()
	{
		return backColor;
	}
}
