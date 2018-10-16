package V41_hemläxa;

import java.util.Scanner;

public class v41_läxa1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("allt inom // är programen, ta bort för att köra");
		
		//double radius = input.nextDouble();
		//System.out.println(volume(radius));
		
		//String in = input.nextLine();
		//System.out.println(reverse(in));
		
		//String str = input.nextLine();
		//char c = input.next().charAt(0);
		//System.out.println(count(str, c));
		
		//String str = input.nextLine();
		//System.out.println(count(str, c));
		
		
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
	public static int count(String str, char c) {
		int b = 0;
		for (int i = str.length() -1; i >= 0; i--) {
			if(str.charAt(i) == c) {
				b++;
			}
		}
		return b;
	}//end
	public static String sjorovare(String str) {
		String sj = "";
		
		for (int i = 0; i < str.length(); i++) {
			switch (str.toLowerCase().charAt(i)) {
			case 'b':
			case 'c':
			case 'd':
			case 'f':
			case 'g':
			case 'h':
			case 'j':
			case 'k':
			case 'l':
			case 'm':
			case 'n':
			case 'p':
			case 'q':
			case 'r':
			case 's':
			case 't':
			case 'v':
			case 'w':
			case 'x':
			case 'z':
				sj += str.charAt(i) + "o" + str.charAt(i);
			}
			switch (str.toLowerCase().charAt(i)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'y':
			case 'å':
			case 'ä':
			case 'ö':
			case ' ':
			case '!':
			case '?':
			case '.':
			case ',':
			
				sj += str.charAt(i);
			}
			
			
		}
		return sj;
	}
	
	
}//end
