package kattis;

import java.util.Scanner;

public class etttest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int skal = sc.nextInt();
		sc.nextLine();

		for (int slinga = 0; slinga < skal; slinga++) {
			String ord = sc.nextLine();
			int längd = (int) Math.sqrt(ord.length());
			char[][] hemlig = new char[längd][längd];
			String[] ej_hemlig = new String[skal];
			int index = 0;

			for (int i = 0; i < hemlig.length; i++) {

				for (int j = 0; j < hemlig.length; j++) {
					hemlig[i][j] = ord.charAt(index);
					index++;
				}
			}
			ej_hemlig[slinga] = "";
			for (int i = hemlig.length - 1; i >= 0; i--) {
				for (int j = 0; j < hemlig[i].length; j++) {
					ej_hemlig[slinga] += hemlig[j][i];
				}
			}
			System.out.println(ej_hemlig[slinga]);
		}
	}
}
