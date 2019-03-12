package test;

import java.util.Scanner;

public class test2 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for( int i = 0 ; i < 10 ; i++) {
			
			int tal = input.nextInt();
			
			if(tal < min) {
				min = tal;
			}
			if(tal > max) {
				max = tal;
			}
		}
		
	System.out.println("klar");
	System.out.println(max);
	System.out.println(min);
	}
	

}
