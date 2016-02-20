import static java.lang.System.out;

public class TheWholeFamilyisHereForChristmas {
// I am pretty sure this code can be done better and shorter, but this is all I can do with the current skills I have.
	public static void main(String[] args) {

		Person Vankata = new Person();
		Person Maria = new Person();
		Person Tosho = new Person();
		Person Dimitar = new Person();
		Person Traiana = new Person();
		Person date = new Person();
		// Vankata below:
		Vankata.name = "Vankata";
		Vankata.age = 10;
		Vankata.height = 150;
		Vankata.isMale = true;
		Vankata.weight = 45;
		Vankata.surName = "Stavrakiev";

		// Maria below:
		Maria.name = "Maria";
		Maria.age = 42;
		Maria.height = 165;
		Maria.isMale = false;
		Maria.weight = 69.5;
		Maria.surName = "Stavrakieva";
		Tosho.parent = true;
		// Tosho below:
		Tosho.name = "Tosho";
		Tosho.age = 45;
		Tosho.height = 190;
		Tosho.isMale = true;
		Tosho.weight = 120; // Tosho is huge
		Tosho.surName = ", he is a proud Stavrakiev";

		// Dimitar below:
		Dimitar.name = "Dimirar";
		Dimitar.age = 20;
		Dimitar.height = 176;
		Dimitar.isMale = true;
		Dimitar.weight = 80;
		Dimitar.surName = "he dislikes his surname, Stavrakiev";

		// Traiana below:
		Traiana.name = "Traiana";
		Traiana.age = 25;
		Traiana.height = 160;
		Traiana.isMale = false;
		Traiana.weight = 50;
		Traiana.surName = "Stavrakieva";

		Maria.create();
		Tosho.create();
		out.println("-----------------------------------------");
		Traiana.create();
		out.println("-----------------------------------------");
		Dimitar.create();
		out.println("-----------------------------------------");
		Vankata.create();
		// example of occupation
		Tosho.occupation();
		//DATE Exercise 3:
		date.date();
	}

}
