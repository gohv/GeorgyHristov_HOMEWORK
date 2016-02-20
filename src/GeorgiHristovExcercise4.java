import java.util.Scanner;
import static java.lang.System.out;

public class GeorgiHristovExcercise4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		out.println("What is the time?: ");
		int time = keyboard.nextInt(); // в заданието се иска целочислен тип
		out.println("How much money do you have?: ");
		double cash = keyboard.nextDouble();
		boolean feelWell = false; 
		if (feelWell == false && cash <= 4.50) {
			out.println("You are sick, stay home!");
			out.println("Take a tea!");
		} else if (feelWell == false && cash >= 4.50) {
			out.println("You are sick, stay home!");
			out.println("Go buy medicine!");
		} else if (feelWell == true && cash >= 1 && cash < 10) {
			out.println("You have money only for a coffee");
		} else if (feelWell == true && cash > 10) {
			out.println("!!!YOU CAN PARTY ALL NIGHT!!!");
		} else {
			out.println("You are so poor, you can only stay home and GAME ON!!");
		}

	}
}
