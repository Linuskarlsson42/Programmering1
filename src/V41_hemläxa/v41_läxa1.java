package V41_hemläxa;

import java.util.Scanner;

public class v41_läxa1 {
	private static String str;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double radius = input.nextDouble();input.nextLine();
		System.out.println(volume(radius));
		System.out.println(reverse(str));
		
	}//end
	public static double volume(double radius) {
		radius = (3*3.14*radius*radius*radius);
		return radius;
	}//end
	public static String reverse(String str) {
		int l = str.length();
		for (int i = 0; i < l; i--) {
			System.out.println(str.charAt(i));
		}
		return str;
	}//end
}//end
