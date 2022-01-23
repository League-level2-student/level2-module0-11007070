package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		Robot[] robotArr = new Robot[5];
		boolean reachTop = false;
		int robotWinner = 0;
		for (int i = 0; i < robotArr.length; i++) {
			robotArr[i] = new Robot(i*100+50, 550);
			robotArr[i].setSpeed(10);
		}
		Random ran = new Random();
		while (reachTop == false) {
			for (int i = 0; i < robotArr.length; i++) {
				int num = ran.nextInt(50);
				robotArr[i].move(num);
				if (robotArr[i].getY() <= 0) {
					reachTop = true;
					robotWinner = i;
					break;
				}
			}
		}
		JOptionPane.showMessageDialog(null, "Robot " + robotWinner + " is the winner!!");
	}
	
	//2. create an array of 5 robots.

	//3. use a for loop to initialize the robots.

		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
