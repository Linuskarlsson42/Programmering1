package V41_hemläxa;

import java.util.Scanner;

public class v41_läxa1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double radius = input.nextDouble();
		//String in = input.nextLine();
		//String str = input.nextLine();
		//char c = input.next().charAt(0);
		
		System.out.println(volume(radius));
		//System.out.println(reverse(in));
		
	}//end
	public static double volume(double radius) {
		radius = (4*3.14*radius*radius*radius)/3;
		return radius;
	}//end
	public static String reverse(String in) {
		String str = "";
		for (int i = in.length() -1; i >= 0; i--) {
			str += in.charAt(i);
		}
		return str;	
	}//end
	public static int count(String str, char c);{
		int b = 0;
		for (int i = 0; i < 0 ; i++) {
			
		}
		
	}
	
	
}//end
