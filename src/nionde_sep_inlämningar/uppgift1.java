package nionde_sep_inlämningar;

import java.util.Scanner;

public class uppgift1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("skriv ett antal heltal");
		System.out.println("när du vill sluta skriv 0");
		
		boolean exit = false;
		
		int n;
		
		int sum = 0;
		
		while(!exit) {
		
			n = sc.nextInt();
			
			if(n == 0) {
				exit = true;
			}
			else {
			sum += n;
			
			}
		}
		
		System.out.println("summan av alla heltal du skrev in är " + sum);
		
	
	}
	
	
}
