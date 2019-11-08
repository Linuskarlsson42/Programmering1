package abstracta_klasser_lektion;

public class Amazon extends Cars{

	public Amazon(){
		super.name = "Amazon";
	}
	
	
	@Override
	void Hastighet() {
		// TODO Auto-generated method stub
		System.out.println("max hastighet i denna fräsiga kärra ligger på en grasiös 136km/h");
	}

	@Override
	void Konsumption() {
		// TODO Auto-generated method stub
		System.out.println("den konsumerar barn och 10 liter/ 100km");
	}

	@Override
	void Iq() {
		// TODO Auto-generated method stub
		System.out.println("STOR IQ 350");
	}

	@Override
	void Driv() {
		// TODO Auto-generated method stub
		System.out.println("Som den underbara bmw är denna fina kärra bakhjulsdriven");
	}

	@Override
	void Hk() {
		// TODO Auto-generated method stub
		System.out.println("Amazonen har dock en ynkliga 66Hk");
	}

}
