package kattis;

import java.util.Scanner;

public class Faktor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double A = input.nextInt();
		double I = input.nextInt();
		
		double J = Math.ceil(A/I);
		
		System.out.println((int) (J));
		
		
		
		
	}

}
