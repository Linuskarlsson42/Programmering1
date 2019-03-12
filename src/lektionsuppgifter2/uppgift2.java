package lektionsuppgifter2;

import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class uppgift2 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int tal = input.nextInt();
		int summa = 0;

		while (tal != 0) {
			int ental = tal % 10;
			summa = summa + ental % 10;
			tal = tal - ental % 10;
			tal = tal / 10;
		}
		System.out.println(summa);

	}

}
