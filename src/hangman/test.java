package hangman;

import java.util.Scanner;

public class test {

	static HangmanConsoleWindow hrw = new HangmanConsoleWindow();
	
	static char[] wordtochar = new char[0];
	static char[] lines = new char[0];
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
/*
 * en metod som tar in ett ord och gör om varje bokstav till ett -
 * dela upp stringen i en char array  text to char array
 * en array med - = antal bokstäver som ordet har
 * 
 * 
 */
		boolean exit = false;
		hrw.println("Hej och välkomen till hänga gubbe");
		hrw.println("Skriv in ett hämligt ord!");
		String Word = hrw.nextString();
		hrw.clear();
		
		while(!exit) {
			
		}
		TexttoCharArray(Word);
		CheckIndexArray();
		CharstoLine();
	}
	
	private static void TexttoCharArray(String word) {
		for (int i = 0; i < word.length(); i++) {
			wordtochar[i] = word.charAt(i);
		}
	}
	
	
	private static void CheckIndexArray() {
		
	}
	
	private static void CharstoLine() {
		
	}
	
	
}
