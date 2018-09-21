package kattis;

import java.util.Scanner;

public class Abrakadabra {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x = 1;
		int i = input.nextInt();
		
		while(x <= i ){
			System.out.println(x + " " + "Abracadabra");
			
			x++;
		}
	}
}
