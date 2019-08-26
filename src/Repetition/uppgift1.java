package Repetition;

public class uppgift1 {
	
	public static void main(String[] args) {
		
		int[] heltal = {2,4,6,10};
		
		int summa = 0;
		
		for (int i = 0; i < heltal.length; i++) {
			
			summa += heltal[i];
		}
		System.out.println(summa);
	}

}
