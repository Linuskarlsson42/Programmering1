package Repetition;

import java.util.Scanner;

public class uppgift4 {
	public static int heltal;
	public static int heltal2;
	public static int mTal;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		heltal = input.nextInt();
		heltal2 = input.nextInt();
		mini(heltal, heltal2);
		System.out.println(mTal);
		
	}
	
	public static int mini(int heltal, int heltal2) {
		if(heltal > heltal2) {
			mTal = heltal2;
		}
		else {
			mTal = heltal;
		}
		return mTal;
	}
	
}
