package Höger_Läger;

import java.util.Random;
import java.util.Scanner;

public class högerläger_main {
	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();

	static int poang = 0;
	static int gissningar = 0;
	static int n = rd.nextInt(0 + 100) + 1;
	
	public static void main(String[] args) {
		

		System.out.println("Hej och välkommen till gissa talet!");
		System.out.println("Välj svårighetsgrad: ");
		System.out.println("1 = Lätt");
		System.out.println("2 = Medel");
		System.out.println("3 = Svår");

		int svarighetsgrad = sc.nextInt();

		
		if (svarighetsgrad == 1) {
			easy();
		}

		else if (svarighetsgrad == 2) {
			medium();
			
		}

		else if (svarighetsgrad == 3) {
			hard();
		}
	}
	public static void easy() {
		gissningar = 7;
		
		while (gissningar > 0) {

			
			System.out.println("Skriv ett tal mellan 1 - 100");
			int giss = sc.nextInt();
			
			if (giss == n) {
				System.out.println("Rätt, du får ett poäng!");
				poang++;
			}
			
			else if(giss > n){
				System.out.println("fel, talet nu söker är högre");
				gissningar--;
				System.out.println("du har gissningar " + gissningar + " kvar");
			}
			else if
			(giss < n) {
				System.out.println("fel, talet du söker är lägre");
				gissningar--;
				System.out.println("du har gissningar " + gissningar + " kvar");
			}
			if(gissningar == 0) {
				System.out.println("Du har ingar gissningar kvar och du är död :(");
				System.out.println("talet var " + n);
				break;
			}
			
		}
	}
	
	public static void medium() {
		gissningar = 5;
		
		while (true) {

			
			System.out.println("Skriv ett tal mellan 1 - 100");
			int giss = sc.nextInt();
			
			if (giss == n) {
				System.out.println("Rätt, du får ett poäng!");
				poang++;
			}
			
			else if(giss > n){
				System.out.println("fel, talet nu söker är lägre");
				gissningar--;
				System.out.println("du har gissningar " + gissningar + " kvar");
			}
			else if
			(giss < n) {
				System.out.println("fel, talet du söker är högre");
				gissningar--;
				System.out.println("du har gissningar " + gissningar + " kvar");
			}
			if(gissningar == 0) {
				System.out.println("Du har ingar gissningar kvar och du är död :(");
				System.out.println("talet var " + n);
				break;
			}

		}
	}
	
	public static void hard() {
		gissningar = 3;

		while (true) {

			
			System.out.println("Skriv ett tal mellan 1 - 100");
			int giss = sc.nextInt();
			
			if (giss == n) {
				System.out.println("Rätt, du får ett poäng!");
				break;
			}
			
			if(giss > n){
				System.out.println("fel, talet nu söker är lägre");
				gissningar--;
				System.out.println("du har gissningar " + gissningar + " kvar");
			}
			else {
				System.out.println("fel, talet du söker är högre");
				gissningar--;
				System.out.println("du har gissningar " + gissningar + " kvar");
			}
			if(gissningar == 0) {
				System.out.println("Du har ingar gissningar kvar och du är död :(");
				System.out.println("talet var " + n);
				break;
			}

		}
		
	}
	
}
