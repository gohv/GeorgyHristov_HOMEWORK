import static java.lang.System.out;
import java.util.Date;

public class Person {
	Date date = new Date();

	String name;
	String surName;
	int age;
	int height; // centimeters..I wont be printing these
	double weight; // I wont be printing these
	boolean isMale;
	boolean parent;

	public void create() {
		out.println("This is " + name + " " + surName);

		if (isMale) {
			out.println("His " + "age is " + age);

		} else {
			out.println("Her " + "age is " + age);// I could years old, but
													// doesnt rly matter;
		}
		if (parent) {

			out.println("They are the parents of the 3 kids");
		}
	}

	public void occupation() {
		out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		out.println(name + " is a retired Boxer, now training guys");
		out.println("++++++++++++++++++++++++++++++++++++++++++++++");
	}// remonta na kolata mi struwa 2500 leva....

	public void date() {
		out.println(date);

	}
}
