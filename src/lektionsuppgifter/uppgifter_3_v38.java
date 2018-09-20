package lektionsuppgifter;

import java.util.Scanner;

public class uppgifter_3_v38 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int summa = 1;
		int tal = input.nextInt();
		for (int i = 2; i <= tal; i++) {
			summa = summa * i;
			System.out.println(summa);
		}
	}
}
