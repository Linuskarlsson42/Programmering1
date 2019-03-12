package BonusUppgifter;

import java.util.Scanner;

public class Everywhere {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		//antal testfall
		for (int i = 0; i < cases; i++) {
			//läs in antal städer
			int numberOfCities = sc.nextInt();
			String[] cities = new String[numberOfCities];
			//läs in alla stadsnamn 
			for (int j = 0; j < numberOfCities; j++) {
				cities[j] = sc.next();
				
				for (int j2 = 0; j2 < cities.length; j2++) {
					if(cities[j2].equals(j)) {
						
				}
			}
			
			
		}
		
			
		}
		
		
	}
	
}
