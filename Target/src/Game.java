
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;
public class Game extends JButton   {
	public Game(){
		
		target();
	}
	//initialize the values
	int fpoint = 0;
	int spoint = 0;
	int tpoint = 0;
	int total = fpoint + spoint + tpoint; 
	Random rand = new Random();
	//Target method to make the buttons and set their colors
	public void target(){
		
		JFrame frame = new JFrame("HIT!");
		frame.setVisible(true);
		frame.setSize(500,500);
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
	
		final JButton  first = new JButton();
		first.setBackground(Color.WHITE);
		final JButton second = new JButton();
		second.setBackground(Color.RED);

		final JButton third = new JButton();
		third.setBackground(Color.WHITE);

		panel.add(first);
		first.add(second);
		second.add(third);
		
		this.setVisible(true);
		//action listener for the first button
		first.addActionListener(
				new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent e) {
							 fpoint += 1;
							 total = fpoint + spoint + tpoint; 
							 System.out.println(total);
							 if (e.getSource() == first){
							        first.setLocation(rand.nextInt(300),rand.nextInt(300));
					                first.repaint();
					            }
					}
					}
				
			);
		
		//action listener for the second button

		second.addActionListener(
				new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent e) {
							 spoint += 2;
							 total = fpoint + spoint + tpoint;
							 System.out.println(total);
							 if (e.getSource() == second){
								 for(int i=0;i<=300;i++)
						            {
						                first.setLocation(rand.nextInt(300),rand.nextInt(300));
						                first.repaint();
						            }
						}
							 }
					
				}
			);
		
		//action listener for the third button

		third.addActionListener(
				new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent e) {
						tpoint += 3;
						 total = fpoint + spoint + tpoint;
						 System.out.println(total);	
						 if (e.getSource() == third){
							 for(int i=0;i<=300;i++)
					            {
					                first.setLocation(rand.nextInt(300),rand.nextInt(300));
					                first.repaint();
					            }
					}
						 }
					
				}
			);
				
		System.out.println(total);

		frame.add(panel);
	}
	//the main method	
	public static void  main(String args[]) {
		new Game();
}
}
