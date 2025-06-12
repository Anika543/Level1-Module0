package _01_methods._5_FlappyBird;

import javax.swing.JOptionPane;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int y = 200; 
    int x = 800; 
    int birdYVelocity = -10; 
    int gravity = 1;
    int upperPipeHeight;
    int pipeGap = 190;
    int lowerPipeHeight = 600-upperPipeHeight-pipeGap; 
    int score = 0; 
   

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	
    
        
    }

    @Override
    public void draw() {
    	if(lose() == false) {
    	
	    	background(119, 196, 237);
	    	//birds
		   	fill(255, 247, 28);
		    stroke(255, 247, 28);
		    ellipse(100, y, 50, 50);
		    
		    //pipes
		    fill(0, 212, 21);
		    rect(x, 0, 100, upperPipeHeight);
		    
		    fill(0, 212, 21);
		    rect(x, upperPipeHeight + pipeGap, 100, lowerPipeHeight);
		    
		    //score
		    fill(0, 0, 0);
	        textSize(16);
	        text("Score: " + score, 20, 20);
		    
		    x-=10;
		    if(x<-100) {
		    	x=800; 
		    	upperPipeHeight = (int) random(100, 400);
		    	score++;
		    }
		    
		    if(lose()==true) {
		    	 fill(0, 0, 0);
		         textSize(30);
		         text("You lost. Your final score was:", 175, 240);
		         
		         fill(0, 0, 0);
		         textSize(130);
		         text(score, 325, 375);
		         
		       
		         
		    }
		    
		    y+=birdYVelocity; 
		    birdYVelocity+=gravity; 
	    }
    }
    
    @Override
    public void mousePressed() {
    	birdYVelocity = -12; 
    }
    
    public boolean lose() {
    	if(y < upperPipeHeight && 100 > x && 100 < (x+100)) {
    		return true;
    	}else if(y>pipeGap+upperPipeHeight && 100 > x && 100 < (x+100)){
    		return true;
    	}else if(y > 600 || y<0) {
    		return true;
    	}
 
    	else {
    		return false; 
    	}
    	
   }

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
