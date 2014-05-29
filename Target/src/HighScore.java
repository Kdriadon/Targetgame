import java.io.FileNotFoundException;
import java.io.File;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class HighScore {
	int highscore; 
	protected Formatter output; 
	protected Scanner input; 
	public void openFile()
	{
		try
		{
			input = new Scanner(new File("highscore.txt"));
		}
		catch (FileNotFoundException ex)
		{
			createHighScoreFile();
			JOptionPane.showMessageDialog(null, ex.toString(), "Error",
                    JOptionPane.ERROR_MESSAGE);
		}
	}
	public int readHighScore()
	{
		try 
		{
			while (input.hasNext())
			{
				highscore = input.nextInt();
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
		return highscore;
		
	}
	public void closeReadFile()
	{
		if (input != null)
		{
			input.close();
		}
	}
	public void setscore(int score){
		openFile();
		readHighScore();
		closeReadFile();
		if (score> highscore)
		highscore = score;
		createHighScoreFile(); 
		updateHighScore(highscore); 
		closeWriteFile();
	}

	public void createHighScoreFile()
	{
		try
		{
			output = new Formatter("highscore.txt"); 
		}
		catch(SecurityException ex)
		{
			JOptionPane.showMessageDialog(null, ex.toString(), "Error",
                    JOptionPane.ERROR_MESSAGE);
		}
		catch(FileNotFoundException ex)
		{
			JOptionPane.showMessageDialog(null, ex.toString(), "Error",
                    JOptionPane.ERROR_MESSAGE);
		}	
	}
	public void updateHighScore(int highscore)
	{
		try
		{
			output.format("%d%n", highscore); 
		}
		catch(FormatterClosedException ex)
		{
			JOptionPane.showMessageDialog(null, ex.toString(), "Error",
                    JOptionPane.ERROR_MESSAGE);
		}
		catch(NoSuchElementException ex)
		{
			JOptionPane.showMessageDialog(null, ex.toString(), "Error",
                    JOptionPane.ERROR_MESSAGE);
		}
	}
	public void closeWriteFile()
	{
		if (output != null)
		{
			output.close(); 
		}
	}

}
