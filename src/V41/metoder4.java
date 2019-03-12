package V41;

import java.util.Scanner;

public class metoder4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double celcius = input.nextDouble();
		
		kelvin(celcius);
	}//end
	public static void kelvin(double celcius) {
		celcius = -273.15 + celcius;
		System.out.println(celcius);
	}//end
	
}//end
