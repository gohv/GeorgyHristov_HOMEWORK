import java.util.Scanner;
import static java.lang.System.out;

public class GeorgyHristovHomeworkExersice6  {
	 
    public static void main(String[] args) {
    	
    	Scanner keyboard = new Scanner(System.in);
            int digits[] = new int[5+1];
            int smallDigit = digits[0]+ 1;
            int bigDigit = digits[0];        
          
            for(int i=1; i< digits.length; i++)
            {
            	out.print("Type the numbers: ");
            	digits[i] = keyboard.nextInt();
                    if(digits[i] > bigDigit)
                            bigDigit = digits[i];
                    else if (digits[i] < smallDigit)
                            smallDigit = digits[i];
                   
            }
           
            out.println("The biggest number is: " + bigDigit);
            out.println("The smallest Number is : " + smallDigit);
    }
}
	


