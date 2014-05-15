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
	private JRadioButton easy, medium, hard; 
	private JRadioButton black, blue, green, yellow, white; 
	private JRadioButton speedRun, normal; 
	private JButton goBack, submit; 
	
	public Formatter output; 
	public Scanner input; 
	
	
	
	JPanel panelSettings, panelNorth, panelCenter, panelSouth; 
	
	public SettingsMenu() 
	{
		super("Settings Menu"); 
		settings();
	}
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
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (normal.isSelected())
		{
			
		}
		else if (speedRun.isSelected()); 
		{
			
		}
		if (easy.isSelected()) 
		{
			
		}
		else if (medium.isSelected())
		{
			
		}
		else if (hard.isSelected())
		{
			
		}
		if (black.isSelected())
		{
			
		}
		else if (blue.isSelected())
		{
			
		}
		else if (green.isSelected())
		{
			
		}
		else if (yellow.isSelected())
		{
			
		}
		else if (white.isSelected())
		{
			
		}
	}
	public void settingsInvisibility()
	{
		super.dispose();
	}
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
	public void closeWriteFile()
	{
		if (output != null)
		{
			output.close(); 
		}
	}
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
				if (input.nextInt() == 1)
				{
					normal.setEnabled(true);
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
