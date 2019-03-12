package V41;

import java.util.Scanner;

public class metoder7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		System.out.println(reverse(str));
	}
	public static String reverse(String str) {
		int l = str.length();
		for (int i = 0; i < l; i--) {
			System.out.println(str.charAt(i));
		
		}
	
		return str;
	}
	}
	
