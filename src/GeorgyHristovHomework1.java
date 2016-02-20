import static java.lang.System.out;
import java.util.Scanner;

public class GeorgyHristovHomework1 {

	public static void main(String[] args) {
		// тук са задачи от 1 до 3
		// задача 1
		out.println("My name is: Georgy Hristov");

		// задача 2
		byte b = 100;
		short s = 30000;
		int i = 40;
		long l = 9999999999999l;
		float f = 3.14f;
		double d = 3.14;
		out.println("This is a example of the primitive type byte: " + b);
		out.println("This is a example of the primitive type short: " + s);
		out.println("This is a example of the primitive type int: " + i);
		out.println("This is a example of the primitive type long: " + l);
		out.println("This is a example of the primitive type float: " + f);
		out.println("This is a example of the primitive type double: " + d);

		// задача 3 не съм сигурен дали в заданието се искаше със скенера или
		// без, и реших да го направя със скенера.
		int justNumber;
		int justAnotherNumber;

		Scanner keyboard = new Scanner(System.in);
		out.print("Please type in the first number: ");
		justNumber = keyboard.nextInt();
		out.print("Please type in the second number: ");
		justAnotherNumber = keyboard.nextInt();
		int answer = justNumber + justAnotherNumber;
		out.println("Value is: " + answer);
		if (answer == 0) {
			out.println("Number is zero");
		} else if (answer > 0) {
			out.println("Number is Possitive");
		} else {
			out.println("Number is not Possitive");
		}

	}

}
