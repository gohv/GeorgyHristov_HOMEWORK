package pragmatic.homework.String;

public class SBuilder {

	public static void main(String[] args) {
		
		int small = 1;
		int huge = 1000000;
		
		StringBuilder builder = new StringBuilder();
		
		builder.append(small).append(huge);
		System.out.println(builder.toString());

	}

}
