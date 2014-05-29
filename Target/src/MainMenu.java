import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainMenu extends JFrame
{
	JPanel panelStart;
	JButton start, settings, quit; 
	
	public MainMenu()
	{
		//Setting up GUI
		super("Target Game");
		mainMenu();
	}
	public void mainMenu()
	{
		setLayout(new FlowLayout());
		
		//Set up start button 
		start = new JButton("Start"); 
		start.addActionListener(
				new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent e) 
					{
						//Call method that brings you to the options of the type of game this includes making things visible and invisible 
						//Call class Mode
						mainMenuInvisibility(); 
						Mode mode = new Mode(); 
						mode.setSize(400, 300); 
						mode.setVisible(true);	
					}	
				}
			);
		//Setting up settings button 
		settings = new JButton("Settings"); 
		settings.addActionListener(
				new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent e) 
					{
						//Call method that brings you to a new GUI for the settings menu this includes making things visible and invisible 
						//Call Class SettingsMenu
						mainMenuInvisibility(); 
						SettingsMenu settings = new SettingsMenu(); 
						settings.setSize(400, 300);
						settings.setVisible(true);
					}	
				}
			);
		//Quitting the game 
		quit = new JButton("Quit"); 
		quit.addActionListener(
				new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent e) 
					{
						System.exit(1); 
					}	
				}
			);
		//Making a new Start Menu Panel
		panelStart = new JPanel(); 
		
		//Adding the buttons to the Start Menu 
		panelStart.add(start); 
		panelStart.add(settings); 
		panelStart.add(quit); 
		add(panelStart);
	}
	public void mainMenuInvisibility()
	{
		super.dispose();
	}
}
