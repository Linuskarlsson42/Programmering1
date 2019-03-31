package hangman;

import java.io.PushbackReader;
import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.PUSH;

public class test {

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

		hrw.println("Hej och v�lkomen till h�nga gubbe");
		hrw.println("Skriv in ett hemligt ord!");
		str = hrw.nextString();
		str.toLowerCase();
		hrw.clear();
		TexttoCharArray();
		CharstoLine();

		while (!exit) {
			Guess();
			hrw.println(hej);
			

		}

	}

	/**
	 * 
	 * Detta �r en metod som tar in Str�ngen str och arrayen wordtochar och delar in
	 * str i arrayen som chars i respektive platser
	 * 
	 * 
	 */
	private static void TexttoCharArray() {
		wordtochar = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			wordtochar[i] = str.charAt(i);
		}
	}

	/**
	 * 
	 * Denna metod g�r om bokst�verna i str till streck likamed antal bokst�ver i
	 * str den best�r allts� enbar best�r av en massa streck
	 * 
	 */

	private static void CharstoLine() {
		lines = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			lines[i] = '-';
		}

	}

	/**
	 * Denna metod hanterar gissningar, f�rst fr�gar den om du vill gissa p� en
	 * bokstav eller hela ordet 
	 * 
	 * Skriver du in a s� tar den in n�sta char som du skriver in och kollar om den finns i ordets
	 * char array. Om den finns d�r s� kommer den ers�ta indexet i lines d�r bokstaven finns med den char
	 * man skrev in och skriver ut lines. Efter�t s� kontrolleras det om hej (arraylistan lines fast en string)
	 * om den �r lika med str, om den d� �r det s� har man vunnit spelet och en lite text skrivs ut annars
	 * h�nder inget.
	 * 
	 * om man gissa fel s� tas ett liv bort och metoden hangman k�rs.
	 * 
	 * Skriver du in b s� tar den in n�sta string du skriver in som en gissning f�r hela ordet
	 * gissar man r�tt s� vinner du men �r det fel s� f�rlorar du direkt.
	 * 
	 * Skriver man in n�got annat som inte �r a eller b s� st�lls fr�gan om vad du vill gissa p� igen och 
	 * en liten text som ifr�gas�tter ditt intelekt kommer ut.
	 * 
	 */

	private static void Guess() {
		hrw.println("vill du gissa p�:");
		hrw.print("a. bokstav b. hela ordet");
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
					if (hej.equals(str)) {
						hrw.println("Du van!" + "ordet var: " + hej);
					 }

				}

			}
			lives--;
			hangman();

		}

		else if (option == 'b') {
			guessString = hrw.nextString();
			if (guessString.equals(str)) {
				hrw.println("Du van! " + "ordet var: " + hej);
				exit = true;

			} else {
				exit = true;
			}
		}

		else {
			hrw.println("Du skrev in fel dumbom!");
			Guess();
		}

	}

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
			Guess();
			break;
		case 8:
			hrw.println("   _______)___");
			hrw.println("| |");
			hrw.println("| |");
			hrw.println("| |");
			hrw.println("| |");
			hrw.println("| |");
			hrw.println("| |");
			Guess();
			break;
		case 7:
			hrw.println("   _______)___");
			hrw.println("| |       |");
			hrw.println("| |");
			hrw.println("| |");
			hrw.println("| |");
			hrw.println("| |");
			hrw.println("| |");
			Guess();
			break;
		case 6:
			hrw.println("   _______)___");
			hrw.println("| |       |");
			hrw.println("| |       0");
			hrw.println("| |");
			hrw.println("| |");
			hrw.println("| |");
			hrw.println("| |");
			Guess();
			break;
		case 5:
			hrw.println("   _______)___");
			hrw.println("| |       |");
			hrw.println("| |       0");
			hrw.println("| |       |");
			hrw.println("| |");
			hrw.println("| |");
			hrw.println("| |");
			Guess();
			break;
		case 4:
			hrw.println("   _______)___");
			hrw.println("| |       |");
			hrw.println("| |       0");
			hrw.println("| |     >=|");
			hrw.println("| |");
			hrw.println("| |");
			hrw.println("| |");
			Guess();
			break;
		case 3:
			hrw.println("   _______)___");
			hrw.println("| |       |");
			hrw.println("| |       0");
			hrw.println("| |     >=|=<");
			hrw.println("| |");
			hrw.println("| |");
			hrw.println("| |");
			Guess();
			break;
		case 2:

			break;
		case 1:
			hrw.println("   _______)___");
			hrw.println("| |       |");
			hrw.println("| |       0");
			hrw.println("| |     >=|=<");
			hrw.println("| |      / \\");
			hrw.println("| |");
			hrw.println("| |");
			Guess();
			break;
		case 0:

			hrw.println("   #&%%!&�&@@@%        ");
			hrw.println("  |            | ");
			hrw.println(" (   X      X   )");
			hrw.println("  |            | ");
			hrw.println("  |            |");
			hrw.println(" \\     o      /");
			hrw.println("  \\          /   ");
			hrw.println("   \\________/    ");
			hrw.println("du d�d ");
			break;

		}

	}
}
