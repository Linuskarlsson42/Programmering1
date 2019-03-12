package H�ger_L�ger;

import java.util.Random;
import java.util.Scanner;

public class h�gerl�ger_main {
	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();

	static int poang = 0;
	static int gissningar = 0;
	static int n = rd.nextInt(0 + 100) + 1;
	
	public static void main(String[] args) {
		

		System.out.println("Hej och v�lkommen till gissa talet!");
		System.out.println("V�lj sv�righetsgrad: ");
		System.out.println("1 = L�tt");
		System.out.println("2 = Medel");
		System.out.println("3 = Sv�r");

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
				System.out.println("R�tt, du f�r ett po�ng!");
				poang++;
			}
			
			else if(giss > n){
				System.out.println("fel, talet nu s�ker �r h�gre");
				gissningar--;
				System.out.println("du har gissningar " + gissningar + " kvar");
			}
			else if
			(giss < n) {
				System.out.println("fel, talet du s�ker �r l�gre");
				gissningar--;
				System.out.println("du har gissningar " + gissningar + " kvar");
			}
			if(gissningar == 0) {
				System.out.println("Du har ingar gissningar kvar och du �r d�d :(");
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
				System.out.println("R�tt, du f�r ett po�ng!");
				poang++;
			}
			
			else if(giss > n){
				System.out.println("fel, talet nu s�ker �r l�gre");
				gissningar--;
				System.out.println("du har gissningar " + gissningar + " kvar");
			}
			else if
			(giss < n) {
				System.out.println("fel, talet du s�ker �r h�gre");
				gissningar--;
				System.out.println("du har gissningar " + gissningar + " kvar");
			}
			if(gissningar == 0) {
				System.out.println("Du har ingar gissningar kvar och du �r d�d :(");
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
				System.out.println("R�tt, du f�r ett po�ng!");
				break;
			}
			
			if(giss > n){
				System.out.println("fel, talet nu s�ker �r l�gre");
				gissningar--;
				System.out.println("du har gissningar " + gissningar + " kvar");
			}
			else {
				System.out.println("fel, talet du s�ker �r h�gre");
				gissningar--;
				System.out.println("du har gissningar " + gissningar + " kvar");
			}
			if(gissningar == 0) {
				System.out.println("Du har ingar gissningar kvar och du �r d�d :(");
				System.out.println("talet var " + n);
				break;
			}

		}
		
	}
	
}
