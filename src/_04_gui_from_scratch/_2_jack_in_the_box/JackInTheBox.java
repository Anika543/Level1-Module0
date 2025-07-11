package _04_gui_from_scratch._2_jack_in_the_box;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel; 

public class JackInTheBox implements ActionListener {
	
	int timesPressed=0; 
	public void showButton() {
		
		JFrame frame2= new JFrame();
		frame2.setVisible(true);
		
		JButton button = new JButton(); 
		button.setText("Surprise");
		
		frame2.add(button);
		frame2.pack(); 
		
		button.addActionListener(this);

	}
	
	
	private void showPicture(String fileName) {
	    try {
	         JLabel imageLabel = createLabelImage(fileName);
	         JFrame frame = new JFrame();
	         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	         frame.add(imageLabel);
	         frame.setVisible(true);
	         frame.pack();
	    } catch (Exception e) {
	         e.printStackTrace();
	    }
	}
	
	
	private JLabel createLabelImage(String fileName) {
	    try {
	         java.net.URL imageURL = getClass().getResource(fileName);
	         if (imageURL == null) {
	              System.err.println("Could not find image " + fileName);
	              return new JLabel();
	         } else {
	              Icon icon = new ImageIcon(imageURL);
	              JLabel imageLabel = new JLabel(icon);
	              return imageLabel;
	         }
	    } catch (Exception e) {
	         System.err.println("Could not find image " + fileName);
	         return new JLabel();
	    }
	}
	
	private void playSound(String soundFile) {
	     try {
	          AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
	          sound.play();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		timesPressed++; 
		if(timesPressed==5) {
			showPicture("jackInTheBox.png");
			createLabelImage("jackInTheBox.png"); 
			playSound("homer-woohoo.wav");
		}
		
		
		
	}
}