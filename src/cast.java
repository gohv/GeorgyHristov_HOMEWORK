import java.util.Scanner;
public class cast {

	public static void main(String[] args) {
		long i = 1234567891l;
		int k;
		
		k =(int) i; // we instruct the compiler to use the int as long - this is what we call CAST
		System.out.println(k);
		
		// check java for dummies - explanation of ++ and +1
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter: ");
		int kuros = input.nextInt();
		if(kuros >= 10 && kuros <=99){
			System.out.println("dwe cifri");
		}else{
			System.out.println("edna cifra");
		}
		
		// - to check if the number is 2 digits!
		
		
	}

	
}
