package pragmatic.homework.animalKingdom;
import static java.lang.System.out;
//Chehalche
public class Paramecium extends UnicellularOrganism {
 
	int meters;
	int food;
	
	public void gatherFood(){
		food++;
	}
	public void move(){
		meters++;
	}
	
	public void moveAndGatherFood(){
		move();
		out.println("Paramecium moves around, gathering food, minding its own bussiness");
		gatherFood();
	}
	
	
}
