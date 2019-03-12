package lektionsuppgifter2;

import java.util.Scanner;

public class uppgift4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		int summa = 1;
		
		for (int i = 0; i < 10; i++) {
			int tal = input.nextInt();
			summa = summa * tal;
			if(summa >= 100000) {
				System.out.println(summa);
			}
			if(i == 9) {
				System.out.println(summa);
			}
		}
		
		
		
	}
	

}
