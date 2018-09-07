package Hemläxa_v36;

import java.util.Scanner;

public class Läxa {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("vad heter du?");
		
		String namn = input.nextLine();
		
		System.out.println("gammal är du");
		String ålder = input.nextLine();
		
		System.out.println("Vad är din adress?");
		String adress = input.nextLine();
		
		System.out.println("Vad är ditt postnummer?");
		String postnummer = input.nextLine();
		
		System.out.println("Vilken stad bor du i?");
		String stad = input.nextLine();
		
		System.out.println("Vad är ditt telefonnummer");
		String Telefonnummer = input.nextLine();
		
		System.out.println("Information:");
		System.out.print ("Namn:"); 
		System.out.println(namn);
		System.out.print("Ålder:");
		System.out.println(ålder);
		System.out.print("Adress:");
		System.out.println(adress);
		System.out.println(postnummer +" "+ stad);
		System.out.print("Telefonnummer:");
		System.out.print(Telefonnummer);
		
		
		
		
		
		
		
	}
		

}
