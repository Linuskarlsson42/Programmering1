package lektionsuppgifter2;

import java.util.Scanner;

public class uppgift5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int summa = 0;
		for (int i = 1; i <= 10000; i++) {
			if (i % 7 == 0) {
				summa = summa + i;
			}

		}
		System.out.println(summa);

	}// end
}// end