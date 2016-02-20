package pragmatic.homework.abstracts;

import java.util.Date;
import java.util.Scanner;

public abstract class AbstractUser implements User{
	Date date = new Date();
	Scanner keyboard = new Scanner(System.in);
	
	
	public void name(){
		System.out.print("Enter your username: ");
		String name = keyboard.nextLine();
		System.out.println(name);
	}
	
	public void timeOfLogin() {
		System.out.println(date);
	}

	public void login() {
		name();
		System.out.println("You have logged in Successfully!");
		timeOfLogin();
	}

}
