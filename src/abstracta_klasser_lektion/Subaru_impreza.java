package abstracta_klasser_lektion;

public class Subaru_impreza extends Cars{

public Subaru_impreza() {
		
		super.name = "WRX STI";
		
	}
	
	@Override
	void Hastighet() {
		// TODO Auto-generated method stub
		System.out.println("Max hastighet 258km/h");
	}

	@Override
	void Konsumption() {
		// TODO Auto-generated method stub
		System.out.println("9.5 liter/100km");
	}

	@Override
	void Iq() {
		// TODO Auto-generated method stub
		System.out.println("f�rarna �r hyfsat kompetenta men en stor andel �r lantisar. cirkus 80 iq");
	}

	@Override
	void Driv() {
		// TODO Auto-generated method stub
		System.out.println("Den �r 4 hjuls driven, mums!");
	}

	@Override
	void Hk() {
		// TODO Auto-generated method stub
		System.out.println("Har ungef�r 305Hk, ocks� mums!");
	}

}
