package main;
import java.util.Scanner;

public class Converter {
	
	
	public static double cupsToTeaspoons(int cups) {
	       double result = 0;
	       result = cups * 48;
	       return result;
	}
	
	public static double milesToKilometers(int miles) {
	       double result = 0;
	       result = miles * 1.60934;
	       return result;
	}
	
	public static double fToC(int f) {
	       double result = 0;
	       result = ((f - 32) * 5/9);
	       return result;
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int menuSelection= 0;
		
		 
		while (true) {
			
		
		System.out.println("Please Select an option: \n"
				+ "1. Cups to Teaspoons \n"
				+ "2. Miles to Kilometers \n"
				+ "3. Fahrenhiet to Celsius \n"
				+ "4. Quit");
		
				menuSelection = input.nextInt();
				
				
				/*not sure if its best to do this in the methods themselves or in the case
				 * seems best to do it in the case because the scanner has to be the same throughout
				 * 
				 * it seems like I can make a function for the scanner specifically but this seems to be the best way
				 * to get specific responses from each conversion
				 * 
				 * I do want to Complete the other suggested tasks but I want to make sure
				 * 	1. I used the access modifiers correctly
				 *  2. Created and called the functions the right way
				 *  	-we went over method declaration and I'm not quite sure if that applies to this
				 *  3. any other questions that come up.
				 *  
				 * Hopefully We get feedback on these and if not I can ask tomorrow
				 * 
				 */
				switch(menuSelection) {
				case 1:
					int cups;
					System.out.println("\nPlease Enter The Cups: ");
			        cups = input.nextInt();
			        
			        System.out.println("There are " + cupsToTeaspoons(cups) + " Teaspoons in " + cups + " Cups");
			        
			        break;
			        
				case 2:
					int miles;
					System.out.println("\nPlease Enter The Miles: ");
			        miles = input.nextInt();
			        
			        System.out.println("There are " + milesToKilometers(miles) + " Kilometers in " + miles + " Miles");
					
					break;
					
				case 3:
					int f;
					System.out.println("\nPlease Enter The Degrees Fahrenheit: ");
			        f = input.nextInt();
			        
			        System.out.println(f + " Degrees Fahrenheit is " + fToC(f) + " Celsius ");
					
			        break;
					
				case 4:
					System.out.println("Hi im the quit one!");
					break;
			
			}
		}
	}
}
