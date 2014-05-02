import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Mode extends JFrame 
{
	JPanel panelStart;
	JButton start, settings, quit; 
	
	public Mode()
	{
		//Setting up GUI
		super("Game Mode");
		modeMenu();
	}
	public void modeMenu()
	{
		//Border Layout should always be center 
				setLayout(new FlowLayout());
				
				//Set up start button 
				start = new JButton("Normal"); 
				start.addActionListener(
						new ActionListener()
						{
							@Override
							public void actionPerformed(ActionEvent e) 
							{
								//Call method that brings you to the options of the type of game this includes making things visible and invisible 
								//Call normal game mode 
								//Game.normal(); 
								
							}
							
						}
						
					);
				//Setting up settings button 
				settings = new JButton("Speed Run"); 
				settings.addActionListener(
						new ActionListener()
						{
							@Override
							public void actionPerformed(ActionEvent e) 
							{
								//Call method that brings you to a new GUI for the settings menu this includes making things visible and invisible 
								//Call speed run game mode
								//Game.speedrun
							}
							
						}
						
					);
				//Quitting the game 
				quit = new JButton("Go Back"); 
				quit.addActionListener(
						new ActionListener()
						{
							@Override
							public void actionPerformed(ActionEvent e) 
							{
								modeMenuInvisibility(); 
								//Make class for this 
								MainMenu main = new MainMenu(); 
								main.mainMenu();
								main.setSize(200, 300); 
								main.setVisible(true);
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
	public void modeMenuInvisibility()
	{
		Mode application = new Mode(); 
		application.setVisible(false); 
	}
}