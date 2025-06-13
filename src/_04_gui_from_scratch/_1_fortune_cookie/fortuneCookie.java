package _04_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JButton; 
import javax.swing.JOptionPane; 

public class fortuneCookie implements ActionListener {
	public void showButton() {
        System.out.println("Button clicked");
        JFrame frame = new JFrame();
        frame.setVisible(true); 
        
        JButton button = new JButton();
        frame.add(button);
        frame.pack();
        
        button.addActionListener(this);
    }
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		int rand = new Random().nextInt(5);
		JOptionPane.showMessageDialog(null, "Woohoo!");
		if(rand==0) {
			JOptionPane.showMessageDialog(null, "You will soon become RICH!");
		}if(rand==1) {
			JOptionPane.showMessageDialog(null, "dOnT tRuSt EvErYoNe");
		}if(rand==2) {
			JOptionPane.showMessageDialog(null, "you will soon find success");
		}if(rand==3) {
			JOptionPane.showMessageDialog(null, "You will soon become RICH!");
		}if(rand==4) {
			JOptionPane.showMessageDialog(null, "You will soon become RICH!");
		}
		
	}
}

