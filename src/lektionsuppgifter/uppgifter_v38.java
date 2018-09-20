package lektionsuppgifter;

import java.util.Scanner;

public class uppgifter_v38 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		
		
		System.out.println("uppgift 1:");
		int summa = 0;
		for (int i = 0; i < 100; i++) {
			summa += i;
			System.out.print(summa + " ");
		}
			System.out.println();
			System.out.println("uppgift 2:");
		for (int i = 25; i < 51; i++) {
			System.out.print(i + " ");
		}
			System.out.println();
			System.out.println("uppgift 3:");
		for (int i = 19; i > 0; i--) {
			System.out.print(i + " ");
		}	
		
			System.out.println();
			System.out.println("uppgift 4:");
			System.out.println("skriv ett jämnt heltal under 10");
			int tal = input.nextInt();
		for (int i = 1; i <= 10; i++) {
				System.out.print(tal * i + " ");
		}	
		
		
			
		System.out.println();
		System.out.println("Uppgift 7:");
		for (int i = 1; i < 100; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("x ");
				
			}
			System.out.println();
		}
			
		
			
			
		
		
		
	}

}
