import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Game extends JFrame implements ActionListener
{
	public Game()
	{
		super ("Target Game"); 
		setLayout(new FlowLayout()); 
		JPanel panel = new JPanel(); 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
