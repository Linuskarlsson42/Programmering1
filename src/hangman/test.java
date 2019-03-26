package hangman;

import java.util.Scanner;

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
	static boolean exit;
	static boolean exitII;

	public static void main(String[] args) {
		
			
		hrw.println("Hej och välkomen till hänga gubbe");
		hrw.println("Skriv in ett hemligt ord!");
		str = hrw.nextString();

		
		
		hrw.clear();
		TexttoCharArray();
		CharstoLine();
			Guess();
		
	}

	private static void TexttoCharArray() {
		wordtochar = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			wordtochar[i] = str.charAt(i);
		}
	}

	private static void CharstoLine() {
		lines = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			lines[i] = '-';
		}

	}

	private static void Guess() {
		
		hrw.println("vill du gissa på:");
		hrw.print("a. bokstav b. hela ordet");
		option = hrw.nextChar();
		hrw.clear();

		if (option == 'a') {
			
			
			
			guessChar = hrw.nextChar();
			for (int i = 0; i < str.length(); i++) {
				if (guessChar == wordtochar[i]) {
					lines[i] = guessChar;
					hrw.clear();
					hrw.println("Rätt!");
					hej = new String(lines);
					hrw.print(hej);
					Guess();

				}
				
				
				else {
					lives--;
					hangman();
				}
			}
		}

		else if (option == 'b') {
			guessString = hrw.nextString();
			if (guessString == str) {
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

			hrw.println("   #&%%!&¤&@@@%        ");
			hrw.println("  |            | ");
			hrw.println(" (   X      X   )");
			hrw.println("  |            | ");
			hrw.println("  |            |");
			hrw.println(" \\     o      /");
			hrw.println("  \\          /   ");
			hrw.println("   \\________/    ");

			break;

		}

	}
}
