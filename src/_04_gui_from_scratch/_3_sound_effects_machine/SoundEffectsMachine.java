package _04_gui_from_scratch._3_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import javax.swing.JButton; 
import javax.swing.JFrame;
import javax.swing.JPanel; 

public class SoundEffectsMachine implements ActionListener {
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	
	public void run() {		
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel(); 
		frame.add(panel); 
		
		button1.setText("HELLO :) IM #1");
		button2.setText("HELLO >( IM #2");
		button3.setText("HELLO ;) IM #3");
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		
		frame.pack();
		frame.setTitle("SoundEffectsMachine");

		
	}
	
	
	private void playSound(String soundFile) {
	    String path = "src/_04_gui_from_scratch/_3_sound_effects_machine/";
	        File sound = new File(path+soundFile);
	        if (sound.exists()) {
	            new Thread(() -> {
	            try {
	                Clip clip = AudioSystem.getClip();
	                clip.open(AudioSystem.getAudioInputStream(sound));
	                clip.start();
	                Thread.sleep(clip.getMicrosecondLength()/1000);
	            }
	            catch (Exception e) {
	                System.out.println("Could not play this sound");
	            }}).start();
	 		}
	        else {
	            System.out.println("File does not exist");
	        }
	    
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) arg0.getSource();
		if(button1 == buttonPressed) {
			playSound("sawing-wood-daniel_simon.wav");
		}else if(button2==buttonPressed) {
			playSound("268582__zagi2__buba-loop.wav");
		}
		
	}
	

}
