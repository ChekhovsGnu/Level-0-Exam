import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

	public static void main(String[] args) {
		String color = JOptionPane.showInputDialog("What color would you like the robot to draw the shape in?");
		Robot marker = new Robot();
		if (color.equalsIgnoreCase("yellow")) {
			marker.setPenColor(Color.yellow);
		} else if (color.equalsIgnoreCase("blue")) {
			marker.setPenColor(Color.blue);
		} else if (color.equalsIgnoreCase("green")) {
			marker.setPenColor(Color.green);
		}

		marker.penDown();
		marker.setPenWidth(10);
		for (int i = 0; i < 4; i++) {
			marker.move(100);
			marker.turn(90);
		}
	}
}