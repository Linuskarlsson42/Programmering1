package Miniraknare;

import javafx.scene.control.TextField;

public class Equals {
	
	public static void Inputs(TextField input) {
		
		String[] content = input.getText().split(" "); // skiljer på tecken och tal!!!!!!!!!!!!!!
		
		for (int i = 0; i < content.length - 1; i++) {
			
			if (content[i].equals("+")) {
				
				Tangent c = new Addition();
				content[0] = Double.toString(c.Calc(Double.parseDouble(content[0]), Double.parseDouble(content[i+1])));
				
				//gör om double till string och lägger in det i str arrayen gör samma som ovan 
				//String s = Double.toString(Addition.Aw);
				
				//s = content[0];
				
			}
			
			else if(content[i].equals("-")) {
				
				Tangent c = new Subtraction();
				content[0] = Double.toString(c.Calc(Double.parseDouble(content[0]), Double.parseDouble(content[i+1])));
				
			}
			
			else if(content[i].equals("*")) {
				
				Tangent c = new Multiplication();
				content[0] = Double.toString(c.Calc(Double.parseDouble(content[0]), Double.parseDouble(content[i+1])));
				
			}
			
			else if(content[i].equals("/")) {
				
				Tangent c = new division();
				content[0] = Double.toString(c.Calc(Double.parseDouble(content[0]), Double.parseDouble(content[i+1])));
				
			}
			
			else if(content[i].equals("\u221A")) {
				
				Tangent c = new Sqrt();
				
				content[0] = Double.toString(c.OneCalc(Double.parseDouble(content[i+1])));
			}
			
			else if(content[i].equals("%")) {
				
				Tangent c = new Modelus();
				
				content[0] = Double.toString(c.Calc(Double.parseDouble(content[0]), Double.parseDouble(content[i+1])));
				
			}
			
		}
		out(content);
		
		
	}
	
	public static void out(String[] content) {
		Skarm.outputS(content[0]);
		
		
	}

}
