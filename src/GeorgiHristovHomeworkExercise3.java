import static java.lang.System.out;
import java.util.Scanner;

public class GeorgiHristovHomeworkExercise3 {

	public static void main(String[] args) {
		// Exercise 3: Print digits in between:
		
		Scanner keyboard = new Scanner(System.in);
		int smallNumber;
		int bigNumber;
		out.print("Small number goes here: ");
		smallNumber = keyboard.nextInt();
		out.print("Big number goes here: ");
		bigNumber = keyboard.nextInt();
		while(smallNumber > bigNumber){
			
			// maybe its a good idea to mention-
			// here that I know the fact that repeating the code is a bad idea!
			// Yet this here is just a joke!	
			// I also know that you can break it with a keyboard char.
			// For some reason !keyboard.hasNextInt() didnt wanna work...
			
			out.println("Please do not try to break my code!");
			out.print("SMALL number goes here: ");
			smallNumber = keyboard.nextInt();
			out.print("BIG number goes here: ");
			bigNumber = keyboard.nextInt();
		}
		do{ // I choose do-while loop, as I used it the least in the past!
			out.println(smallNumber);
			smallNumber++;
		}while(smallNumber < bigNumber + 1);
	}

}
