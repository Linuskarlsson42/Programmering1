package V41;

import java.util.Scanner;

public class metoder5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		ageControl(age);
	}//end
	public static void ageControl(int age) {
		if(age >= 100) {
			System.out.println("R.I.P :(");
		}
		else if(age >= 65) {
			System.out.println("du �r pension�r");
		}
		else if(age >=20) {
			System.out.println("Du f�r g� p� systemet");
		}
		else if(age >= 18) {
			System.out.println("du f�r k�ra bil");
		}
		else if(age >= 15) {
			System.out.println("du f�r k�ra moppe");
		}
		else if(age >= 13) {
			System.out.println("du �r ton�ring");
		}
		else if(age >= 6) {
			System.out.println("du f�r spela fortnite");
		}
		else if(age >= 0) {
			System.out.println("sm�barn f�r inte g�ra piss");
		}
	}//end 
	
}//end
