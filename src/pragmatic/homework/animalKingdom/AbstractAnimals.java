package pragmatic.homework.animalKingdom;

public abstract class AbstractAnimals {

	private int size;
	private int age;
	private int weight;

	void move() {

	}

	void eat() {

	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void growUp() {
		weight++;
		age++;
		size++;
	}
}
