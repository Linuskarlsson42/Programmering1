package Heml�xa_v36;

import java.util.Scanner;

public class L�xa {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("vad heter du?");
		
		String namn = input.nextLine();
		
		System.out.println("gammal �r du");
		String �lder = input.nextLine();
		
		System.out.println("Vad �r din adress?");
		String adress = input.nextLine();
		
		System.out.println("Vad �r ditt postnummer?");
		String postnummer = input.nextLine();
		
		System.out.println("Vilken stad bor du i?");
		String stad = input.nextLine();
		
		System.out.println("Vad �r ditt telefonnummer");
		String Telefonnummer = input.nextLine();
		
		System.out.println("Information:");
		System.out.print ("Namn:"); 
		System.out.println(namn);
		System.out.print("�lder:");
		System.out.println(�lder);
		System.out.print("Adress:");
		System.out.println(adress);
		System.out.println(postnummer +" "+ stad);
		System.out.print("Telefonnummer:");
		System.out.print(Telefonnummer);
		
		
		
		
		
		
		
	}
		

}
