package hangman;

import java.util.Scanner;

public class test {

	static HangmanConsoleWindow hrw = new HangmanConsoleWindow();
	
	static char[] wordtochar = new char[0];
	static char[] lines = new char[0];
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
/*
 * en metod som tar in ett ord och g�r om varje bokstav till ett -
 * dela upp stringen i en char array  text to char array
 * en array med - = antal bokst�ver som ordet har
 * 
 * 
 */
		boolean exit = false;
		hrw.println("Hej och v�lkomen till h�nga gubbe");
		hrw.println("Skriv in ett h�mligt ord!");
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
