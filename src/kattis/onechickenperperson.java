package kattis;

import java.util.Scanner;

public class onechickenperperson {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int M = inp.nextInt();
		int N = inp.nextInt();
		int P = 0;
		P = M - N;
		
		if(P > 1) {
			System.out.println("Dr. Chaz will have" + P + "pieces of chicken left over!");
		}
		else if(P == 1) {
			System.out.println("Dr. Chaz will have" + P + "piece of chicken left over!");
		}
		else if(P < 0) {
			System.out.println();
		}
}

}
