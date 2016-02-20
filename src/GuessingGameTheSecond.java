import java.util.Random;
import static java.lang.System.out;
import java.util.Scanner;

public class GuessingGameTheSecond {

	public static void main(String[] args) {
		out.println("Welcome to the guessing game 2!");
		out.println(" ");
		Scanner keyboard = new Scanner(System.in);
		int numGuess = 0;
		int RandomNumber = new Random().nextInt(10) + 1;
		out.println(" ");
		out.print("Please enter a Number from 1 to 10: ");
		int InputNumber = keyboard.nextInt();
		numGuess++;
		while (InputNumber != RandomNumber) {
			out.println("Try again..");
			out.print("Please enter a Number from 1 to 10: ");
			InputNumber = keyboard.nextInt();
			numGuess++;
			
		}
		out.print("You win after ");
		out.println(numGuess + " guesses.");
		keyboard.close();
	}
	
}
