package pragmatic.homework.animalKingdom;

public class FlyingFish extends Fish {

	public void fly(){
		System.out.println("Flying fish flyes");
	}
	
	@Override
	public void swim() {
	System.out.println("Flying fish can also swim");
		super.swim();
	}
	@Override
	public void layEggs() {		
		super.layEggs();
	}
	
}
