import java.awt.Color;


public class applySettings extends readIn
{
	//for the settings menu
	public void applyToSettings()
	{
		if (Easy == true)
		{
			easy.setSelected(true); 
		}
		else if (Medium == true)
		{
			medium.setSelected(true);
		}
		else if (Hard == true)
		{
			hard.setSelected(true);
		}
		if (Black == true)
		{
			black.setSelected(true);
		}
		else if (Blue == true)
		{
			blue.setSelected(true);
		}
		else if (Green == true)
		{
			green.setSelected(true); 
		}
		else if (Yellow == true)
		{ 
			yellow.setSelected(true); 
		}
		else if (White == true)
		{
			white.setSelected(true); 
		}
		if (Normal == true)
		{
			normal.setSelected(true);
		}
		else if (SpeedRun == true)
		{
			speedRun.setSelected(true); 
		}
	}
	//for the other classes 
	public void applyToOthers()
	{
		if (Easy == true)
		{
			//for others 
		}
		else if (Medium == true)
		{
			
		}
		else if (Hard == true)
		{
			
		}
		if (Black == true)
		{
			panelSettings.setBackground(Color.BLACK);
			panelSettings.repaint();
		}
		else if (Blue == true)
		{
			
		}
		else if (Green == true)
		{
			
		}
		else if (Yellow == true)
		{
			
		}
		else if (White == true)
		{
			
		}
		if (Normal == true)
		{
			
		}
		else if (SpeedRun == true)
		{
			//Not made
		}
	}
}
