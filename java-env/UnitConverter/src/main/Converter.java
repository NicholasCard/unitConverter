package main;
import java.util.Scanner;

public class Converter {
	
	

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
				
				switch(menuSelection) {
				case 1:
					System.out.println("Hi im the first one!");
					break;
				case 2:
					System.out.println("Hi im the second one!");
					break;
				case 3:
					System.out.println("Hi im the Third one!");
					break;
					
				case 4:
					System.out.println("Hi im the quit one!");
					break;
			
			}
		}
	}
}
