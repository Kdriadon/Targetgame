
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class Game extends JButton implements ActionListener   {
	public Game(){
		
		target();
	}
	public void target(){
		JFrame frame = new JFrame("HIT!");
		frame.setVisible(true);
		frame.setSize(600,400);
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
	
		JButton  first = new JButton();
		first.setBackground(Color.WHITE);
		first.setSize(75, 75);
		JButton second = new JButton();
		second.setBackground(Color.RED);
		second.setSize(50, 50);

		JButton third = new JButton();
		third.setBackground(Color.WHITE);
		third.setSize(25, 25);

		panel.add(first);
		first.add(second);
		second.add(third);
		
		
		this.setVisible(true);
		first.addActionListener(this);
		second.addActionListener(this);
		third.addActionListener(this);
		 
		frame.add(panel);

		
	}
	public void actionPerformed(ActionEvent e){
		
	}
}
