import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class readIn extends SettingsMenu
{ 
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
					Easy = true; 
				}
				else if (settingInput == 1)
				{
					Medium = true; 
				}
				else if (settingInput == 2)
				{
					Hard = true; 
				}
				if (settingInput == 3)
				{
					Black = true; 
				}
				else if (settingInput == 4)
				{
					Blue = true; 
				}
				else if (settingInput == 5)
				{
					Green = true;  
				}
				else if (settingInput == 6)
				{
					Yellow = true; 
				}
				else if (settingInput == 7)
				{
					White = true; 
				}
				if (settingInput == 8)
				{
					SpeedRun = true;  
				}
				else if (settingInput == 9)
				{
					Normal = true; 
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
	public int getDifficulty()
	{
		return 0;
		//this should be set to a variable 
	}
	public Color getColor()
	{
		return Color.GREEN;
		//this should be set to a variable 
	}
}
