package kattis;

import java.util.Scanner;

/*
 * l�s in ordet, skapa en scanner och l�s in en rad
 * kolla l�ngden p� ordet
 * 
 * fyll en kvadratisk matris med varje bokstav i texten
 * 	a)kolla l�ngden p� texten 
 * 	b)ta roten ur l�ngden
 *  c)loopa genom str�ngen och fyll matrisen med bokst�verna
 * 
 * rotera matrisen 90 grader
 * 	a)skapa en ny tom matris
 * 	b)ta sista bokstaven i f�rsta raden p� den fyllda matrisen och s�tt p� den f�rsta raden och f�rsta platsen i den tomma matrisen
 * 
 *  
 * Skriv ut varje bokstav i ordningen
 * 	a)loopa igenom matrisen och skriv ut varje bokstav som de st�r 
 *  
 *  
 *  i j - 4-j j=i
 *  0 4    0   0
 *  1 4    0   1
 *  2 4    0   2
 *  3 4    0   3
 *  4 4    0   4
 *  
 *  
 *   rad * size/a + col
 *  
 */

public class EncodedMessage {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String EncodedMessage = sc.nextLine();
		int skal = sc.nextInt();
		
		
		int a = (int) Math.sqrt(EncodedMessage.length());
		
		char [][] matris = new char [a][a];
		
		for (int row = 0; row < matris.length; row++) {
			
			for (int col = 0; col < matris.length; col++) {
				char ch = EncodedMessage.charAt(col*a+row);    
		        matris[col][row] = ch;
		        System.out.println(ch);
			}
		}
		
		
	}
}
