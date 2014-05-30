import java.io.FileNotFoundException;
import java.io.File;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class HighScore {
	int highscore; 
	int scores; 
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
			//In case the user does not have a high score file it will be made then used
			JOptionPane.showMessageDialog(null, "High Score File is being created.", "Error",
                    JOptionPane.ERROR_MESSAGE);
			createHighScoreFile();
			setscore(scores);  
			openFile(); 
			
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
		closeWriteFile(); 
		scores = score;
		readHighScore();
		closeReadFile();
		if (scores> highscore)
		highscore = scores;
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
