package Miniraknare;

import javafx.scene.control.TextField;

abstract class Tangent {
	public abstract double Calc(double a, double b);

}

abstract class Eq extends Tangent{

	public static double Calc(TextField input) {
		
		 /*ta in input fr�n skarm
		  * split f�r att dela upp de i en str�ng arr emellan tal o tecken 
		  * 
		  */
		
		int iL = Integer.parseInt(input.getText());
		String [] inputArr = new String[iL];
		
		
		 
		return 0;
	 }
	
}

	
