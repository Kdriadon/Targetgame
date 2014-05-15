import javax.swing.JFrame;


public class runGame 
{
	public static void main(String[] agrs)
	{
		MainMenu application = new MainMenu(); 
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		application.setSize(400, 300); 
		application.setVisible(true); 
		//This line above should be called in the regular menus so we can control the visibility of the menus 
	}
}
