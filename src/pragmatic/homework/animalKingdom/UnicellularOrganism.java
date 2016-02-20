package pragmatic.homework.animalKingdom;

import static java.lang.System.out;

public class UnicellularOrganism extends AbstractAnimals {
	private int limbs = 1; // just something to make a difference...
	
	private void growLimbs(){
		limbs++;
	}
	public void feed() {		
	growUp();
	growLimbs();
	out.println("Amoeba grows up and now has " + limbs + " limbs");
	}

}
