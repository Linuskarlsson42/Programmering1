package BonusUppgifter;

import java.util.Scanner;

public class Everywhere {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for (int i = 0; i < cases; i++) {
			int NumberOfCities = sc.nextInt();
			String[] cities = new String[NumberOfCities];
			for (int j = 0; j < NumberOfCities; j++) {
				cities[j] = sc.next();
			}
		}
	}
}
