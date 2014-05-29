import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Mode extends JFrame 
{
	JPanel panelMode;
	JButton normal, speedRun, goBack; 
	
	public Mode()
	{
		//Setting up GUI
		super("Game Mode");
		modeMenu();
	}
	public void modeMenu()
	{
		setLayout(new FlowLayout());
			
		//Set up start button 
		normal = new JButton("Normal"); 
		normal.addActionListener(
				new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent e) 
					{
						//Call method that brings you to the options of the type of game this includes making things visible and invisible 
						//Call normal game mode
						modeMenuInvisibility(); 
						Game run = new Game(); 
						run.setSize(500,500); 
						run.runGame(); 	
					}	
				}
			);
		//Setting up settings button 
		speedRun = new JButton("Speed Run"); 
		speedRun.addActionListener(
				new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent e) 
					{
						//Call method that brings you to a new GUI for the settings menu this includes making things visible and invisible 
						//Call speed run game mode
						//Game.speedrun
						JOptionPane.showMessageDialog(null, "THIS GAME MODE HAS NOT BEEN CREATED YET","Error",JOptionPane.ERROR_MESSAGE);
					}	
				}
			);
		//Back to the main menu
		goBack = new JButton("Go Back"); 
		goBack.addActionListener(
				new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent e) 
					{
						modeMenuInvisibility(); 
						MainMenu main = new MainMenu(); 
						main.setSize(400, 300); 
						main.setVisible(true);
					}	
				}
			);
		//Making a new Start Menu Panel
		panelMode = new JPanel(); 
		
		//Adding the buttons to the Start Menu 
		panelMode.add(normal);
		panelMode.add(speedRun); 
		panelMode.add(goBack); 
		add(panelMode);
	}
	public void modeMenuInvisibility()
	{
		super.dispose(); 
	}
}