package SOLID_Lektionstid;

public class Interface_labb {
	
	public static void main(String[] args) {
		
	Ikea [] ikea = {new Hemnes(), new Vitval()};
	
	for(Ikea Ikea: ikea) {
		
		Ikea.Name();
		Ikea.Material();
		Ikea.Color();
		Ikea.Price();
		Ikea.Kopa();
		System.out.println();
		
	}
	
	}
}
