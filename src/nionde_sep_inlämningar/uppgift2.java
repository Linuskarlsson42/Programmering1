package nionde_sep_inlämningar;

import java.util.Scanner;

public class uppgift2 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("skriv ett ord.... SNORVALP");
		
		String ord = in.nextLine();
		
		System.out.println(rev(ord));
	}
	
	public static String rev (String ord) {
		
		if(ord.length() == 1) {
			return ord;
		}
		
		else {
			return ord.substring(ord.length()-1) + rev(ord.substring(0, ord.length()-1));
		}
		
	}
}
