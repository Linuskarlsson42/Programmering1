package v39;

import java.util.Scanner;

public class spavanca {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int H = input.nextInt();
		int M = input.nextInt();
		
		M = (M - 45);
		
		if(H == 0) {
			H = 23;
			M = M + 60;
			System.out.println(H + " " + M);
			
		}
		
		else if(M < 0) {
			H--;
			M = M + 60;
			System.out.println(H + " " + M);
		}
		else if(M > 0){
			
			System.out.println(H + " " + M);
		}
		
		
		
		
		
		
		
		
	}
	
}
