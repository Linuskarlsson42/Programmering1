package SOLID_Lektionstid_StratergiLabbEtt;

import java.util.Scanner;

public class ElakPolis implements StrategyP{

	@Override
	public void ProcessSpeed(int speed) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("K�rkort och f�rarbevis tack");
		
		System.out.println("v�ljer du att svara med en aggresiv ton? skriv Y f�r ja N f�r nej");
		
		String Aw = input.nextLine();
		
		if(Aw.contains("Y") || Aw.contains("y") ) {
			System.out.println("Vad handlar detta om. HELT ORIMLIGT ATT JAG UNDERICK JEVENSSON SKULLE K�RA F�R FORT!!!");
			System.out.println("S� du vet allts� varf�r jag stoppade dig?!?!");
		
		}
		
		else {
			System.out.println("Jad� absolut h�r har du det. F�rl�t f�r att fr�gar men varf�r stannade du mig?");
			
			if(speed > 110) {
				System.out.println("Kliv ut ur bilen omedebart!");
			}
			
			else if(speed > 90) {
				System.out.println("Har du brottom n�gonstans f�r du k�rde ungef�r 40 km/t �ver hastighetsgr�nnsen "
						+ "Tror till och med du fattar att det inte �r acceptabelt s�h�r n�ra ett sjukhus");
			}
		
			else if (speed > 40) {
				System.out.println("Jo du k�rde lite v�l fort men ");
				
			}
			
		}
		
		
		
		System.out.println("�hhHHhhh l�get piga ;) ");
		
		System.out.println("");
		
		if (speed > 110) {
			
		}
		
	}

}
