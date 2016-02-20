package pragmatic.homework.animalKingdom;
import static java.lang.System.out;
public class Amoeba extends UnicellularOrganism {

	private int EctoplasmSize = 1;
	
	
	public void growEctoSize(){
		EctoplasmSize++; //similar as the other class
	}
	public void devour(){
		out.println("Amoeba organism likes to eat Paramecium organism");		
		growEctoSize();	
		out.println("Amoeba is now " + EctoplasmSize + " times bigger");
		}
	
	@Override
	public void feed() {		
		super.feed();
		out.println("The amoeba can almost be seen with naked a eye");
		devour();
		
	}


}
