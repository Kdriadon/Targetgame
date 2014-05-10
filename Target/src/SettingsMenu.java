import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SettingsMenu extends JFrame
{
	private JRadioButton easy, medium, hard; 
	private JRadioButton black, blue, green, yellow, white; 
	private JRadioButton speedRun, normal; 
	private JButton goBack; 
	
	JPanel panelSettings; 
	
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
		
		
		//Back to the main menu
		goBack = new JButton("Go Back"); 
		goBack.addActionListener(
				new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent e) 
					{
						settingsInvisibility(); 
						//Make class for this 
						MainMenu main = new MainMenu(); 
						main.setSize(400, 300); 
						main.setVisible(true);
					}	
				}
			);
		easy.addActionListener(
				new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent arg0) 
					{
						
					}
				}
			);

		//Making a new Start Menu Panel
		panelSettings = new JPanel(); 
		
		//Adding the buttons to the Start Menu 
		panelSettings.add(goBack);
		add(panelSettings);
		
		//Adding the buttons to the Start Menu 
	}
	public void settingsInvisibility()
	{
		super.dispose();
	}
}
