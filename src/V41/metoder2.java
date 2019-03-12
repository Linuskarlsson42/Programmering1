package V41;

import java.util.Scanner;

public class metoder2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		
		System.out.println(min(a,b) );
		
	}//end
	public static int min(int a, int b) {
		
		if(a > b) {
			return b;
		}
		else {
			return a;
		}
	}
	
	
}//end
