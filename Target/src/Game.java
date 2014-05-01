import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game extends JFrame
{
	JPanel panelStart, panelGameMode, game; 
	JButton start, settings, quit; 
	
	public Game()
	{
		//Setting up GUI
		super ("Target Game");
		mainMenu();
	}
	public void mainMenu()
	{
		//Border Layout should always be center 
				setLayout(new FlowLayout());
				
				//Set up start button 
				start = new JButton("Start"); 
				start.addActionListener(
						new ActionListener()
						{
							@Override
							public void actionPerformed(ActionEvent e) 
							{
								//Call method that brings you to the options of the type of game
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
								//Call method that brings you to a new GUI for the settings menu 
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
}
