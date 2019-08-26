package Repetition;

import java.util.Scanner;

public class uppgift3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("skriv in en radie");
		
		double radie = input.nextDouble();
		
		double volym = (Math.pow(radie, 3) * Math.PI * 4)/3;
		
		System.out.println(volym + " Volym enheter");
		
		
	}
	
}

