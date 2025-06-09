package _01_methods._1_houses;
import java.awt.Color;
import java.util.Random; 
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
import org.jointheleague.graphical.robot.Robot;

public class Houses {
		
	public void run() {
		// Check the recipe to find out what code to put here
		Robot rob = new Robot();
		rob.setSpeed(100);
		rob.penDown();
		rob.setX(25);
		rob.setPenWidth(5);

		Random ran = new Random(); 

		String height = "medium";
		house(rob, height);

		height = "small";
		house(rob, height);

		height = "large";
		house(rob, height);

		height = "small";
		house(rob, height);

		height = "small";
		house(rob, height);

		height = "medium";
		house(rob, height);

		height = "large";
		house(rob, height);

		height = "large";
		house(rob, height);

		height = "medium";
		house(rob, height);

	}

	public static void house(Robot rob, String height){
		rob.setRandomPenColor(); 

		if(height.equals("medium")){
			rob.move(120);
			peakedRoof(rob);
			rob.move(120); 
		}else if(height.equals("small")){
			rob.move(60);
			peakedRoof(rob); 
			rob.move(60);
		}else{
			rob.move(250);
			rob.turn(90);
			rob.move(40);
			rob.turn(90);
			rob.move(250);

		}
		rob.setPenColor(Color.green);
		rob.turn(-90);
		rob.move(25);
		rob.turn(-90); 
	}

	public static void peakedRoof(Robot rob){
		rob.turn(30);
		rob.move(40);
		rob.turn(120);
		rob.move(40); 
		rob.turn(30);
	}

}
