package SOLID_Lektionstid_StratergiLabbEtt;


public class TrevligPolis implements StrategyP{

	@Override
	public void ProcessSpeed(int speed) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Vet du hur snabbt du körde?");
		
		System.out.println("Nej jag är blind");
		
		System.out.println("nämen vad tokigt, du körde iallafall" + speed + "km/t...");
		
		if (speed > 110) {
			System.out.println("Det må vara lite väl snabbt på en skolväg men du har en ganska fräsig kärra fattar varför du GÄÄSA"
					+ "Vet du vad, du verkar som en riktigt kool typ kör vidare!");
			
		}
		
		else if(speed > 90) {
			System.out.println("Det är ganska löjligt ändå..... de allt du har?? jag konstapel abel utmanar dig till ett race!");
		}
		
		else if (speed < 50) {
			System.out.println("VILKET ÄR EN SKAM. typ 0 precis som du! HA! jävla nolla!!!!! TJARÅ HARE 0:AAAAAA");
		}
		
		
	}

}
