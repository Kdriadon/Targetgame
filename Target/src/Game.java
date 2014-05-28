import java.util.Timer;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.TimerTask;

import javax.swing.*;
public class Game extends JButton   {
	int secs = 10000;
	int minus = 500;
	int stops = 1000;
	
	public Timer timer; 

	public Game(){
		
	}
	public void runGame()
	{
		time();
		target();
	}
	public void time(){
		
		 
		
		{
			TimerTask gameover = new TimerTask() { 
	            @Override
	            public void run() {
	                JOptionPane.showMessageDialog(null, "You lost the game!","Game Over",JOptionPane.ERROR_MESSAGE);
	                System.exit(0);
	            }
	         };
	         timer = new Timer(); 
	         timer.schedule(gameover, secs);
		}
	}
	public void updateTime(int seconds)
	{
		TimerTask gameover = new TimerTask()
		{
			@Override
			public void run() {
                JOptionPane.showMessageDialog(null, "You lost the game!","Game Over",JOptionPane.ERROR_MESSAGE);
                System.exit(0);
			}	
		}; 
		timer.cancel();
		timer = new Timer(); 
		timer.schedule(gameover, seconds);
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
				                if (secs-500 >= 1000){
					                secs -= 500;}
					                
					                updateTime(secs);  
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
					                if (secs-500 >= 1000){
						                secs -= 500;}
						                
						                updateTime(secs);  
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
				                if (secs-500 >= 1000){
					                secs -= 500;}
					                
					                updateTime(secs);  
					}
						 }
					
				}
			);
				
		System.out.println(total);

		frame.add(panel);
	}
	//the main method	

	public static void  main(String args[]) { 
		Game g = new Game(); 
		g.runGame();
}
}
