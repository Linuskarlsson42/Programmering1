package roligfakta;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		person p = new person("Linus");
		person p1 = new person("Emil");
		person p2 = new person("Nils");
		person p3 = new person("Alen");
		
		p.walk();
		p1.walk();
		p2.walk();
		p3.walk();
		
		
	}
	
	
}
