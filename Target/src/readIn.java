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
			input = new Scanner(new File("setting.txt"));
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
			while (input.hasNextLine())
			{
				if (input.nextInt() == 0)
				{
					Easy = true; 
				}
				else if (input.nextInt() == 1)
				{
					Medium = true; 
				}
				else if (input.nextInt() == 2)
				{
					Hard = true; 
				}
				else if (input.nextInt() == 3)
				{
					Black = true; 
				}
				else if (input.nextInt() == 4)
				{
					Blue = true; 
				}
				else if (input.nextInt() == 5)
				{
					Green = true;  
				}
				else if (input.nextInt() == 6)
				{
					Yellow = true; 
				}
				else if (input.nextInt() == 7)
				{
					White = true; 
				}
				else if (input.nextInt() == 8)
				{
					SpeedRun = true;  
				}
				else if (input.nextInt() == 9)
				{
					Normal = true; 
					normal.setSelected(true);
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
}
