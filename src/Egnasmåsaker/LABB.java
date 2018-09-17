package Egnasmåsaker;

import java.util.Scanner;

public class LABB {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Skriv in tre tal");
		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();
		
		if(x>y){
		
			if(x>z)
				System.out.println(x);
			else
				System.out.println(z);
	
		}
		else if(x<y) {
			if(y>z)
				System.out.println(y);
			else
				System.out.println(z);
		}
		
		
			
		
		
			
		
			
		
		
		
		
	}

} //END 
