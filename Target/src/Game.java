import java.util.Timer;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.TimerTask;

import javax.swing.*;
public class Game extends JFrame{
	
	//initialize the values
	JPanel panel; 
	int fpoint = 0;
	int spoint = 0;
	int tpoint = 0;
	int total = fpoint + spoint + tpoint; 
	Random rand = new Random();
	Color color;
	int secs = 10000;
	int minus;
	int stops = 500;
	public Timer timer; 
	HighScore hscore = new HighScore();

	
	public Game()
	{
		readIn read = new readIn(); 
		read.openFile();
		read.readInSettings();
		color = read.getColor(); 
		minus = read.getDifficulty();
		read.closeReadFile();
	}
	public void runGame()
	{	
		time();
		normalTarget();
	}
	public void time(){

		TimerTask gameover = new TimerTask() { 
            @Override
            public void run() {
                hscore.setscore(total); 
                JOptionPane.showMessageDialog(null, "You lost! You did not play the game! Your highscore is " + hscore.highscore,"Game Over",JOptionPane.OK_CANCEL_OPTION);
                gameInvisibility(); 
            }
         };
         timer = new Timer(); 
         timer.schedule(gameover, secs);
	}
	public void updateTime(int seconds)
	{ 
		TimerTask gameover = new TimerTask()
		{
			@Override
			public void run() {
	             hscore.setscore(total);
	                JOptionPane.showMessageDialog(null, "Game Over! Your score is: " + total + " Your highscore is " + hscore.highscore,"Game Over",JOptionPane.OK_CANCEL_OPTION);
                gameInvisibility(); 
			}	
		}; 
		timer.cancel();
		timer = new Timer(); 
		timer.schedule(gameover, seconds);
	}
	public void displayTimer()
	{
		while (Integer.parseInt(timer.toString()) % 1000 == 0)
		{
//			System.out.prt
		}
	}
	//Target method to make the buttons and set their colors
	public void normalTarget(){
		
		JFrame frame = new JFrame("Normal Mode");
		frame.setVisible(true);
		frame.setSize(500,500);
		frame.setBackground(color);
		
		panel = new JPanel();  
		panel.setBackground(color);
	
		final JButton  first = new JButton();
		first.setBackground(Color.WHITE);
		final JButton second = new JButton();
		second.setBackground(Color.RED);
		final JButton third = new JButton();
		third.setBackground(Color.WHITE);

		panel.add(first);
		first.add(second);
		second.add(third);
		
		//action listener for the first button
		first.addActionListener(
				new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent e) {
						fpoint += 1;
						total = fpoint + spoint + tpoint; 
						if (e.getSource() == first){
							first.setLocation(rand.nextInt(300),rand.nextInt(300));
					        first.repaint();
					    }
				        if (secs-minus >= stops){
					        secs -= minus;
					    }    
				        else
				        	secs=stops;
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
						if (e.getSource() == second){
							for(int i=0;i<=300;i++)
						    {
								first.setLocation(rand.nextInt(300),rand.nextInt(300));
						        first.repaint();
						    }
					        if (secs-minus >= stops){
					        	secs -= minus;
						    }
					        else
					        	secs=stops;
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
						if (e.getSource() == third){
							for(int i=0;i<=300;i++)
					        {
								first.setLocation(rand.nextInt(300),rand.nextInt(300));
					            first.repaint();  
					        }
							if (secs-minus >= stops){
					            secs -= minus;
					        }        
							else
					        	secs=stops;
							updateTime(secs);  
						}
					}
				}
			);
		frame.add(panel);
	}
	public void gameInvisibility()
	{
		System.exit(0); 
	}
}
