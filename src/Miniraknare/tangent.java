package Miniraknare;

import javafx.scene.control.TextField;

abstract class Tangent {
	public abstract double Calc(double a, double b);

}

abstract class Eq extends Tangent{

	public static double Calc(TextField input) {
		
		 /*ta in input från skarm
		  * split för att dela upp de i en sträng arr emellan tal o tecken 
		  * 
		  */
		
		int iL = Integer.parseInt(input.getText());
		String [] inputArr = new String[iL];
		
		
		 
		return 0;
	 }
	
}

	
