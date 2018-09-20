package lektionsuppgifter;

import java.util.Scanner;

public class lektionsuppgifter2_v38 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int summa1 = 0;
		int num = input.nextInt();
		summa1 = summa1 + num;
		while(num != 0) {
			num = input.nextInt();
			summa1 = summa1 + num;
			
		}
		System.out.println(summa1);
	}
}
