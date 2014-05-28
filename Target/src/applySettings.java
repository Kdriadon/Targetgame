
public class applySettings extends SettingsMenu
{
	public void applyToSettings()
	{
		if (Easy == true)
		{
			easy.setSelected(true); 
			medium.setSelected(false);
			hard.setSelected(false); 
		}
		else if (Medium == true)
		{
			easy.setSelected(false); 
			medium.setSelected(true);
			hard.setSelected(false);
		}
		else if (Hard == true)
		{
			easy.setSelected(false); 
			medium.setSelected(false);
			hard.setSelected(true);
		}
		if (Black == true)
		{
			black.setSelected(true);
			blue.setSelected(false);
			green.setSelected(false); 
			yellow.setSelected(false); 
			white.setSelected(false); 
		}
		else if (Blue == true)
		{
			black.setSelected(false);
			blue.setSelected(true);
			green.setSelected(false); 
			yellow.setSelected(false); 
			white.setSelected(false); 
		}
		else if (Green == true)
		{
			black.setSelected(false);
			blue.setSelected(false);
			green.setSelected(true); 
			yellow.setSelected(false); 
			white.setSelected(false);
		}
		else if (Yellow == true)
		{
			black.setSelected(false);
			blue.setSelected(false);
			green.setSelected(false); 
			yellow.setSelected(true); 
			white.setSelected(false); 
		}
		else if (White == true)
		{
			black.setSelected(false);
			blue.setSelected(false);
			green.setSelected(false); 
			yellow.setSelected(false); 
			white.setSelected(true); 
		}
		if (Normal == true)
		{
			speedRun.setSelected(false); 
			normal.setSelected(true);
		}
		else if (SpeedRun == true)
		{
			speedRun.setSelected(true); 
			normal.setSelected(false);
		}
	}
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
			
		}
	}
}
