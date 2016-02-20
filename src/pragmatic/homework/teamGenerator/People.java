package pragmatic.homework.teamGenerator;

import static java.lang.System.out;
import java.util.Random;
import java.util.Scanner;

public class People {

	private int numberOfPeople;
	Scanner keyboard = new Scanner(System.in);
	private String[] namesOfPeople;

	public void numberOfPeople() {

		out.print("How many people are in this class?: ");
		numberOfPeople = keyboard.nextInt();
		while (numberOfPeople > 30 || numberOfPeople < 1) {
			out.println("I highly dount there are " + numberOfPeople + " in this classroom");
			out.print("Re-enter the number of people: ");
			numberOfPeople = keyboard.nextInt();
		}

	}

	/**
	 * 
	 * Below method will take the number of ppl and store the names in a String
	 * array - hopefully - IT ALIVEEEEE!!!!!!!!
	 * 
	 */
	public void namePeople() {
		out.println("Enter the names of the " + numberOfPeople + " people");
		namesOfPeople = new String[numberOfPeople];
		for (int i = 0; i < numberOfPeople; i++) {
			namesOfPeople[i] = keyboard.next();
		}
	}

	/**
	 * 
	 * This is a test method below :)
	 * 
	 */
	public void printNames() {
		System.out.println("Names are printed below:  ");
		for (int i = 0; i < numberOfPeople; i++) {
			System.out.println(namesOfPeople[i]);
		}

	}
}
