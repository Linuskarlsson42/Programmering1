package BonusUppgifter;

import java.util.Scanner;

public class Everywhere {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		
		for (int i = 0; i < cases; i++) {
			
			int NumberOfCities = sc.nextInt();
			
			String[] cities = new String[NumberOfCities];
			boolean[] test = new boolean[cities.length];
			
			for (int j = 0; j < NumberOfCities; j++) {
				cities[j] = sc.next();
				test[j] = false;
			}
			for (int j = 0; j < cities.length; j++) {
				if(test[j] != true) {
					for (int j2= 0; j2 < test.length; j2++) {
						if(j != j2) {
							if(cities[j].equals(cities[j2])) {
								test[j2] = true;
							}
						}
					}
					test[j] = true;
				}
			}
		}
		
	}
	
}
