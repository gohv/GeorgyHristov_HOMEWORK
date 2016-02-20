package pragmatic.homework.animalKingdom;

public class Fish extends Vertebrates {

	int eggs = 10;
	int meters = 1;

	public void swim() {
		meters++;
		System.out.println("Fish swims for" + meters);

	}

	public void layEggs() {
		eggs--;
		System.out.println("Fish layes eggs");
	}

	@Override
	void eat() {
		System.out.println("Munch munch");
		super.eat();
	}

	@Override
	public void growUp() {

		super.growUp();
	}

}
