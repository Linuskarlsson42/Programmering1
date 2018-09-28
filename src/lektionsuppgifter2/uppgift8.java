package lektionsuppgifter2;

import java.util.Scanner;

public class uppgift8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int h = input.nextInt();
		System.out.println("timmar ? " + h);
		int m = input.nextInt();
		System.out.println("minuter ? " + m);
		int s = input.nextInt();
		System.out.println("sekunder ? " + s);
		
		h = h * 60 * 60;
		m = m * 60;
		System.out.println("totalt sekunder:  " + (h + m + s));
		
		
	}

}
