package lektionsuppgifter2;

import java.util.Scanner;

public class uppgift3 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		boolean exit = false;
		int t1 = 0;
		double summa = 0;
		
		while(!exit) {
			double tal = input.nextDouble();
			summa = summa + tal;
			if(tal == 0) {
				exit = true;
			}
			t1++;
			
		}
		System.out.println(summa / (t1 - 1));
		
	}

}
