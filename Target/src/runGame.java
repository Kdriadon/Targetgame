import javax.swing.JFrame;

//Main class runs the game 
public class runGame 
{
	public static void main(String[] agrs)
	{
		readAndApplySettings(); 
		
		MainMenu application = new MainMenu(); 
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		application.setSize(400, 300);
		application.setVisible(true);  
	}
	public static void readAndApplySettings()
	{
		readIn retrieve = new readIn(); 
		retrieve.openFile();
		retrieve.readInSettings();
		retrieve.getColor();
		retrieve.closeReadFile();
		
		applySettings settings = new applySettings(); 
		settings.applyToSettings();
	}
}
