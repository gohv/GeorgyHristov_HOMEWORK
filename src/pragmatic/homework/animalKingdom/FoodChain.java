package pragmatic.homework.animalKingdom;
import static java.lang.System.out;
public class FoodChain {

	public static void main(String[] args) {
		UnicellularOrganism Ameba = new Amoeba();
		
		Paramecium Chehalche = new Paramecium();
		
		Chehalche.moveAndGatherFood();
		out.println("Amoeba comes along: ");
		Ameba.feed();
	
	}

}
