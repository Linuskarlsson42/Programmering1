package test;

import java.util.Scanner;

public class test4 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//while efter iteration
		boolean exit = false;
		while(!exit) {
			String line = input.nextLine();
			if(line.equals("exit")) {
				exit = true;
			}
		}
		while(exit);
		}
		
		
	
}
