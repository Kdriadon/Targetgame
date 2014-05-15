import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import javax.swing.*;

public class SettingsMenu extends JFrame implements ActionListener
{
	//Sets up objects needed for code later 
	private JRadioButton easy, medium, hard; 
	private JRadioButton black, blue, green, yellow, white; 
	private JRadioButton speedRun, normal;
	private JButton goBack, submit; 
	
	protected Formatter output; 
	protected Scanner input; 
	
	protected int EASY = 0, MEDIUM = 1, HARD = 2, BLACK = 3, BLUE = 4, GREEN = 5, YELLOW = 6, WHITE = 7, SPEEDRUN = 8, NORMAL = 9;
	protected boolean Easy = false, Medium = false, Hard = false, Black = false, Blue = false, Green = false, Yellow = false, White = false, SpeedRun = false, Normal = false;  
	
	protected int type = 9, color = 3, difficulty = 0; 
	
	JPanel panelSettings, panelNorth, panelCenter, panelSouth; 
	
	//Constructor 
	public SettingsMenu() 
	{
		super("Settings Menu"); 
		settings();
		createSettingsFile(); 
	}
	//GUI setttings menu 
	public void settings()
	{
		setLayout(new FlowLayout());
		
		ButtonGroup difficulty = new ButtonGroup(); 
		ButtonGroup color = new ButtonGroup(); 
		ButtonGroup type = new ButtonGroup(); 
		
		easy = new JRadioButton("Easy");
		medium = new JRadioButton("Medium"); 
		hard = new JRadioButton("Hard"); 
		
		difficulty.add(easy);
		difficulty.add(medium);
		difficulty.add(hard);
		
		black = new JRadioButton("Black"); 
		blue = new JRadioButton("Blue"); 
		green = new JRadioButton("Green"); 
		yellow = new JRadioButton("Yellow"); 
		white = new JRadioButton("White"); 
		
		color.add(black);
		color.add(blue);
		color.add(green);
		color.add(yellow);
		color.add(white);
		
		speedRun = new JRadioButton("Speed Run"); 
		normal = new JRadioButton("Normal"); 
		
		type.add(speedRun);
		type.add(normal);
		
		//Submit settings
		submit = new JButton("Submit"); 
		submit.addActionListener(this); 
		
		//Back to the main menu
		goBack = new JButton("Go Back"); 
		goBack.addActionListener(
				new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent e) 
					{
						settingsInvisibility(); 
						MainMenu main = new MainMenu(); 
						main.setSize(400, 300); 
						main.setVisible(true);
					}	
				}
			);
		
		//Making a new Settings Menu Panel
		panelSettings = new JPanel(); 
		panelNorth = new JPanel(); 
		panelCenter = new JPanel(); 
		panelSouth = new JPanel();
		panelNorth.setLayout(new FlowLayout()); 
		panelCenter.setLayout(new FlowLayout()); 
		panelSouth.setLayout(new FlowLayout()); 
		panelSettings.setLayout(new BorderLayout());
		
		//Adding the buttons to the settings Menu 
		panelNorth.add(normal); 
		panelNorth.add(speedRun);
		panelCenter.add(easy); 
		panelCenter.add(medium); 
		panelCenter.add(hard); 
		panelSouth.add(black); 
		panelSouth.add(blue); 
		panelSouth.add(green); 
		panelSouth.add(yellow); 
		panelSouth.add(white); 
		panelSouth.add(submit, BorderLayout.SOUTH); 
		panelSouth.add(goBack, BorderLayout.SOUTH);
		
		panelSettings.add(panelNorth, BorderLayout.NORTH); 
		panelSettings.add(panelCenter, BorderLayout.CENTER); 
		panelSettings.add(panelSouth, BorderLayout.SOUTH); 
		
		add(panelSettings);
		 
	}
	//When the button is clicked it will submit a certain selected setting and call a method to write it to the file 
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Easy = false; 
		Medium = false; 
		Hard = false; 
		Black = false; 
		Blue = false; 
		Green = false; 
		Yellow = false; 
		White = false; 
		SpeedRun = false; 
		Normal = false; 
		if (normal.isSelected())
		{
			type = NORMAL; 
		}
		else if (speedRun.isSelected()); 
		{
			type = SPEEDRUN; 
		}
		if (easy.isSelected()) 
		{
			difficulty = EASY;  
		}
		else if (medium.isSelected())
		{
			difficulty = MEDIUM; 
		}
		else if (hard.isSelected())
		{
			difficulty = HARD; 
		}
		if (black.isSelected())
		{
			color = BLACK;  
		}
		else if (blue.isSelected())
		{
			color = BLUE;  
		}
		else if (green.isSelected())
		{
			color = GREEN; 	
		}
		else if (yellow.isSelected())
		{
			color = YELLOW; 
		}
		else if (white.isSelected())
		{
			color = WHITE; 
		}
		updateSetting(type, difficulty, color); 
		closeWriteFile(); 
		settingsInvisibility(); 
		MainMenu main = new MainMenu(); 
		main.setSize(400, 300); 
		main.setVisible(true);
	}
	//Makes this menu invisible
	public void settingsInvisibility()
	{
		super.dispose();
	}
	//Opens the settings.txt file
	public void createSettingsFile()
	{
		try
		{
			output = new Formatter("settings.txt"); 
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
	//Updates the settings and re-writes the file
	public void updateSetting(int type, int difficulty, int color)
	{
		try
		{
			output.format("%d%n%d%n%d%n", type, difficulty, color); 
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
	//Closes the settings.txt file
	public void closeWriteFile()
	{
		if (output != null)
		{
			output.close(); 
		}
	}
	
}
