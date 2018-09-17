package V37;

import java.util.Scanner;

public class Läxa {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n1 = input.nextInt();
		int max = n1;
		int min = n1;
		
		int n2 = input.nextInt();
		if(n2 > max) {
			max = n2;
		}
		if(n2 < min) {
			min = n2;
		}
		int n3 = input.nextInt();
		if(n3 > max) {
			max = n3;
		}
		if(n3 < min) {
			min = n3;
		}
		int n4 = input.nextInt();
		if(n4 > max) {
			n4 = max;
		}
		if(n4 < min) {
			min = n4;
		}
		int n5 = input.nextInt();
		if(n5 > max) {
			max = n5;
		}
		if(n5 < min) {
			min = n5;
		}
		int n6 = input.nextInt();
		if(n6 > max) {
			max = n6;
		}
		if(n6 < min) {
			min = n6;
		}
		int n7 = input.nextInt();
		if(n7 > max) {
			max = n7;
		}
		if(n7 < min) {
			min = n7;
		}
		int n8 = input.nextInt();
		if(n8 > max) {
			max = n8;
		}
		if(n8 < min) {
			min = n8;
		}
		
		
		
		System.out.println(max);
		System.out.println(min);
	}

}
