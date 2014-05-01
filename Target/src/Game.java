import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Game extends JFrame implements ActionListener
{
	public Game()
	{
		super ("Target Game"); 

		
		
		
	}
	public void Mode(){
		JPanel Mode;
		super("Game Type");
		setLayout(new FlowLayout());
		JButton Normal = new JButton("Normal");
		Normal.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						playNormalGame();
					}
				}
				);
		JButton SpeedRun = new JButton("Speed Run");
		SpeedRun.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						playSpeedGame();
					}
				}
				);
		JButton Return = new JButton ("Return");
		Return.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						mainMenu();
					}
				}
				);
		 Mode = new JPanel();
		
		Mode.add(Normal);
		Mode.add(SpeedRun);
		Mode.add(Return);
	}
}
