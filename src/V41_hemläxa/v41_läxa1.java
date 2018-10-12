package V41_hemläxa;

import java.util.Scanner;

public class v41_läxa1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double radius = input.nextDouble();
		System.out.println(volume(radius));
	}//end
	public static double volume(double radius) {
		radius = (3*3.14*radius*radius*radius);
		return radius;
	}
	
}//end
