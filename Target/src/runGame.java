import javax.swing.JFrame;


public class runGame 
{
	public static void main(String[] agrs)
	{
		Game application = new Game(); 
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		application.setSize(200, 300); 
		application.setVisible(true); 
	}
}
