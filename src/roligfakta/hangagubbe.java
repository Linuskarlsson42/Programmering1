package roligfakta;

import java.util.Scanner;

public class hangagubbe {
	public static void main(String[] args) {
		
		secretword Sw = new secretword();
		
		Scanner sc = new Scanner(System.in);
		
		while (!Sw.isComplete()) {
			System.out.println(Sw);

		}
	}
}
