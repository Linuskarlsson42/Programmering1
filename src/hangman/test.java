package hangman;

import java.util.Scanner;

public class test {

	static HangmanConsoleWindow hrw = new HangmanConsoleWindow();

	static char[] wordtochar = new char[0];
	static char[] lines = new char[0];

	static Scanner sc = new Scanner(System.in);

	static String guessString;
	static String str;
	static char option;
	static char guessChar;
	static int lives = 10;

	public static void main(String[] args) {
		/*
		 * en metod som tar in ett ord och gör om varje bokstav till ett - dela upp
		 * stringen i en char array text to char array en array med - = antal bokstäver
		 * som ordet har
		 * 
		 * 
		 */
		boolean exit = false;
		hrw.println("Hej och välkomen till hänga gubbe");
		hrw.println("Skriv in ett hämligt ord!");
		str = hrw.nextString();
		hrw.clear();

		TexttoCharArray();
		Guess();
		CharstoLine();
	}

	private static void TexttoCharArray() {
		for (int i = 0; i < str.length(); i++) {
			wordtochar[i] = str.charAt(i);
		}
	}

	private static void CharstoLine() {
		for (int i = 0; i < str.length(); i++) {
			lines[i] = '-';
		}
	}

	private static void Guess() {
		hrw.println("vill du gissa på:");
		hrw.print("A. bokstav B. hela ordet");
		option = hrw.nextChar();

		if (option == 'A') {
			guessChar = hrw.nextChar();
			for (int i = 0; i < str.length(); i++) {
				if (wordtochar[i] == guessChar) {
					lines[i] = guessChar;
				}

				else {
					lives--;
				}
			}
		}

		else if (option == 'B') {
			guessString = hrw.nextString();
			if (str == guessString) {
				hrw.println("yippie! Bra Jobbat!");
				hrw.println(str);
			}
			else {
				lives = 0;
			}
		}

		else {
			hrw.println("Du skrev in fel dumbom!");
			Guess();
		}

	}

}
