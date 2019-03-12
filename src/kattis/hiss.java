package kattis;

import java.util.Scanner;

public class hiss {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String hek = sc.nextLine();
	if(hek.contains("ss")) {
		System.out.println("hiss");
	}
	else {
		System.out.println("no hiss");
	}
}
}
