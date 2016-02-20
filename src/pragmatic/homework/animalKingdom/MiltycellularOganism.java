package pragmatic.homework.animalKingdom;

import java.beans.FeatureDescriptor;

public class MiltycellularOganism extends AbstractAnimals {
	
	int cellularStructure;
	
	public void growCellularStructure(){
		cellularStructure++;
	}
	@Override
	public void growUp() {		
		super.growUp();
		growCellularStructure();
	}
	
	

}
