
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot fire = new Robot("mini");
		// 1. Set the X position of the robot so that it starts on the left.
		// You also need to show the robot to see the result of this line.
		fire.setX(50);
		// 2. Make the robot draw a star shape. Hint: 144.
		fire.setSpeed(100);
		fire.penDown();
		fire.setPenWidth(30);
		fire.setRandomPenColor();
		/*
		 * fire.turn(144); fire.move(200); fire.turn(144); fire.move(200);
		 * fire.turn(144); fire.move(200); fire.turn(144); fire.move(200);
		 * fire.turn(144); fire.move(200);
		 */

		for (int fir = 0; fir < 17; fir++) {
			for (int fi = 0; fi < 5; fi++) {
				fire.turn(144);
				fire.move(30);
			}
			fire.penUp();
			fire.turn(90);
			fire.move(50);
			fire.turn(-90);
			fire.penDown();

		}

		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/walk-of-fame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}
}
