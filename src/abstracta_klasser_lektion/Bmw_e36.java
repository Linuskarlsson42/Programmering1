package abstracta_klasser_lektion;

public class Bmw_e36 extends Cars{
public Bmw_e36() {
		
		super.name = "Bmw 325i";
		
	}

	@Override
	void Hastighet() {
		// TODO Auto-generated method stub
		System.out.println("250 km/h");
	}

	@Override
	void Konsumption() {
		// TODO Auto-generated method stub
		System.out.println("10 liter/100Km");
	}

	@Override
	void Iq() {
		// TODO Auto-generated method stub
		System.out.println("Medel iq p� f�raren ligger mellan 100-110");
	}

	@Override
	void Driv() {
		// TODO Auto-generated method stub
		System.out.println("Denna bil �r bakhjulsdriven, drifta p�!");
		
	}

	@Override
	void Hk() {
		// TODO Auto-generated method stub
		System.out.println("Hk p� 325i modellen ligger p� 192hk fabriksny");
	}
}
