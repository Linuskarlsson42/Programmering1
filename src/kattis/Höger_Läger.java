package kattis;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Höger_Läger {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String[] kortlek = new String [52];
	
	
	for (int i = 0; i < 4; i++) {
		String color = "";
		if(i == 0) {
			color = "Hjärter";
		}
		if(i == 1) {
			color = "Spader";
		}
		if(i == 2) {
			color = "Ruter";
		}
		if(i == 3) {
			color = "Spader";
		}
		for (int j = 0; j <= 13; j++) {
			if(j == 1) {
				kortlek[i * 13+(j-1)] = color + "A";
			}
			else if(j == 11) {
				kortlek[i * 13+(j-1)] = color + "J";
			}
			else if(j == 12) {
				kortlek[i * 13+(j-1)] = color + "Q";
			}
			else if(j == 13) {
				kortlek[i * 13+(j-1)] = color + "K";
			}
			else {
				kortlek[i * 13 + (j-1)] = color + " " + j;
			}
		}
	}
	
	List <String> list = Arrays.asList(kortlek);
	Collections.shuffle(list);
	String [] arr = (String[]) list.toArray();
}
}
