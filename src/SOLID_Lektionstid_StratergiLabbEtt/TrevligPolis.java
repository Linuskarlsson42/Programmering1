package SOLID_Lektionstid_StratergiLabbEtt;


public class TrevligPolis implements StrategyP{

	@Override
	public void ProcessSpeed(int speed) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Vet du hur snabbt du k�rde?");
		
		System.out.println("Nej jag �r blind");
		
		System.out.println("n�men vad tokigt, du k�rde iallafall" + speed + "km/t...");
		
		if (speed > 110) {
			System.out.println("Det m� vara lite v�l snabbt p� en skolv�g men du har en ganska fr�sig k�rra fattar varf�r du G��SA"
					+ "Vet du vad, du verkar som en riktigt kool typ k�r vidare!");
			
		}
		
		else if(speed > 90) {
			System.out.println("Det �r ganska l�jligt �nd�..... de allt du har?? jag konstapel abel utmanar dig till ett race!");
		}
		
		else if (speed < 50) {
			System.out.println("VILKET �R EN SKAM. typ 0 precis som du! HA! j�vla nolla!!!!! TJAR� HARE 0:AAAAAA");
		}
		
		
	}

}
