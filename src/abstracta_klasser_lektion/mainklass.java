package abstracta_klasser_lektion;

public class mainklass {
	public static void main(String[] args) {
		
	/**
	 * vill man l�gga till ett nytt djur �r det bara att skapa en ny klass p� samma s�tt som fish eller 
	 * Schmetterling och sen l�gga till de i animals arrayen 
	 */
		
	Cars [] car = {new Bmw_e36(), new Subaru_impreza(), new Amazon()};
		
		for(Cars cars: car) {
			
			System.out.println(cars.name);
			
			cars.Radio();
			cars.Hastighet();
			cars.Hk();
			cars.Driv();
			cars.Konsumption();
			cars.Iq();
			System.out.println();
			
			
		
			
		}
	
	
	}
	
	
}
