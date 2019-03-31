package hangman;

import java.util.Scanner;

public class hangman {

	static HangmanConsoleWindow hrw = new HangmanConsoleWindow();

	static char[] wordtochar;
	static char[] lines;

	static Scanner sc = new Scanner(System.in);

	static String guessString;
	static String str;
	static String hej;
	static char option;
	static char guessChar;
	static int lives = 10;
	static boolean exit = false;

	public static void main(String[] args) {

		hrw.println("Hej och välkomen till hänga gubbe");
		hrw.println("Skriv in ett hemligt ord!");
		str = hrw.nextString();
		str.toLowerCase();
		hrw.clear();
		TexttoCharArray();
		CharstoLine();

		while (!exit) {
			Guess();
			

		}

	}

	/**
	 * Detta är en metod som tar in Strängen str och arrayen wordtochar och delar in
	 * str i arrayen som chars i respektive platser
	 */
	private static void TexttoCharArray() {
		wordtochar = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			wordtochar[i] = str.charAt(i);
		}
	}

	/**
	 * 
	 * Denna metod gör om bokstäverna i str till streck likamed antal bokstäver i
	 * str den består alltså enbar består av en massa streck
	 * 
	 */

	private static void CharstoLine() {
		lines = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			lines[i] = '-';
		}

	}

	/**
	 * Denna metod hanterar gissningar, först frågar den om du vill gissa på en
	 * bokstav eller hela ordet
	 * 
	 * Skriver du in a så tar den in nästa char som du skriver in och kollar om den
	 * finns i ordets char array. Om den finns där så kommer den ersäta indexet i
	 * lines där bokstaven finns med den char man skrev in och skriver ut lines.
	 * Efteråt så kontrolleras det om hej (arraylistan lines fast en string) om den
	 * är lika med str, om den då är det så har man vunnit spelet och en lite text
	 * skrivs ut annars händer inget.
	 * 
	 * om man gissa fel så tas ett liv bort och metoden hangman körs.
	 * 
	 * Skriver du in b så tar den in nästa string du skriver in som en gissning för
	 * hela ordet gissar man rätt så vinner du men är det fel så förlorar du direkt.
	 * 
	 * Skriver man in något annat som inte är a eller b så ställs frågan om vad du
	 * vill gissa på igen och en liten text som ifrågasätter ditt intelekt kommer
	 * ut.
	 * 
	 */

	private static void Guess() {
		hrw.println("vill du gissa på:");
		hrw.print("a. bokstav b. hela ordet ");
		option = hrw.nextChar();
		hrw.clear();

		if (option == 'a') {

			guessChar = hrw.nextChar();
			for (int i = 0; i < str.length(); i++) {
				if (wordtochar[i] == guessChar) {
					lines[i] = guessChar;
					hrw.clear();
					hej = new String(lines);
					lives++;
					hrw.println(hej);
					if (hej.equals(str)) {
						hrw.clear();
						hrw.println("Du van! " + "ordet var: " + hej);
						exit = true;
					}

				}

			}
			lives--;
			hangman();

		}

		else if (option == 'b') {
			guessString = hrw.nextString();
			if (guessString.equals(str)) {
				hrw.clear();
				hrw.println("Du van! " + "ordet var: " + guessString);
				exit = true;

			} else {
				lives = 0;
				hangman();
			}
		}

		else {
			hrw.println("Du skrev in fel dumbom!");
			Guess();
		}

	}

	/*
	 * Denna metod kollar hur många liv du har och beroende på hur mycket du har
	 * skriver den ut olika bilder som representrar hur många gissningar du har kvar
	 */

	private static void hangman() {
		switch (lives) {
		case 9:
			hrw.println("   ");
			hrw.println("| |");
			hrw.println("| |");
			hrw.println("| |");
			hrw.println("| |");
			hrw.println("| |");
			hrw.println("| |");

			break;
		case 8:
			hrw.println("   _______)___");
			hrw.println("| |");
			hrw.println("| |");
			hrw.println("| |");
			hrw.println("| |");
			hrw.println("| |");
			hrw.println("| |");

			break;
		case 7:
			hrw.println("   _______)___");
			hrw.println("| |       |");
			hrw.println("| |");
			hrw.println("| |");
			hrw.println("| |");
			hrw.println("| |");
			hrw.println("| |");

			break;
		case 6:
			hrw.println("   _______)___");
			hrw.println("| |       |");
			hrw.println("| |       0");
			hrw.println("| |");
			hrw.println("| |");
			hrw.println("| |");
			hrw.println("| |");

			break;
		case 5:
			hrw.println("   _______)___");
			hrw.println("| |       |");
			hrw.println("| |       0");
			hrw.println("| |       |");
			hrw.println("| |");
			hrw.println("| |");
			hrw.println("| |");

			break;
		case 4:
			hrw.println("   _______)___");
			hrw.println("| |       |");
			hrw.println("| |       0");
			hrw.println("| |     >=|");
			hrw.println("| |");
			hrw.println("| |");
			hrw.println("| |");

			break;
		case 3:
			hrw.println("   _______)___");
			hrw.println("| |       |");
			hrw.println("| |       0");
			hrw.println("| |     >=|=<");
			hrw.println("| |");
			hrw.println("| |");
			hrw.println("| |");

			break;
		case 2:
			hrw.println("   _______)___");
			hrw.println("| |       |");
			hrw.println("| |       0");
			hrw.println("| |     >=|=<");
			hrw.println("| |      / ");
			hrw.println("| |");
			hrw.println("| |");
			break;
		case 1:
			hrw.println("   _______)___");
			hrw.println("| |       |");
			hrw.println("| |       0");
			hrw.println("| |     >=|=<");
			hrw.println("| |      / \\");
			hrw.println("| |");
			hrw.println("| |");

			break;
		case 0:

			hrw.println("      #&%%!&¤&@@@%        ");
			hrw.println("     |            | ");
			hrw.println("    (   X      X   )");
			hrw.println("     |            | ");
			hrw.println("     |            |");
			hrw.println("    \\     o      /");
			hrw.println("     \\          /   ");
			hrw.println("      \\________/    ");
			hrw.println("        Du är död ");
			break;

		}

	}
}
