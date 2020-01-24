package SOLID_Lektionstid_StratergiLabbEtt;

import java.util.Scanner;

public class ElakPolis implements StrategyP{

	@Override
	public void ProcessSpeed(int speed) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Körkort och förarbevis tack");
		
		System.out.println("väljer du att svara med en aggresiv ton? skriv Y för ja N för nej");
		
		String Aw = input.nextLine();
		
		if(Aw.contains("Y") || Aw.contains("y") ) {
			System.out.println("Vad handlar detta om. HELT ORIMLIGT ATT JAG UNDERICK JEVENSSON SKULLE KÖRA FÖR FORT!!!");
			System.out.println("Så du vet alltså varför jag stoppade dig?!?!");
		
		}
		
		else {
			System.out.println("Jadå absolut här har du det. Förlåt för att frågar men varför stannade du mig?");
			
			if(speed > 110) {
				System.out.println("Kliv ut ur bilen omedebart!");
			}
			
			else if(speed > 90) {
				System.out.println("Har du brottom någonstans för du körde ungefär 40 km/t över hastighetsgrännsen "
						+ "Tror till och med du fattar att det inte är acceptabelt såhär nära ett sjukhus");
			}
		
			else if (speed > 40) {
				System.out.println("Jo du körde lite väl fort men ");
				
			}
			
		}
		
		
		
		System.out.println("ÖhhHHhhh läget piga ;) ");
		
		System.out.println("");
		
		if (speed > 110) {
			
		}
		
	}

}
