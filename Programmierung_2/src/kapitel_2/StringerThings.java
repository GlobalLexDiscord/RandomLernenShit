package kapitel_2;

public class StringerThings {

	public static void main(String[] args) {
		String hallo = "Hallo Welt";
		String hallo2 = new String("Halo, Welt!");
		String hallo3 = "Hallo, " + "Welt!";
		
		int laenge = 3;
		System.out.println(laenge + " Zeichen");
		
		//Vergleich auf Inhalt
		if(hallo.equals(hallo2)){
			System.out.println("Gleicher Inhalt");
		}
		else {
			System.out.println("Inhalt nicht gleich");
		}
		
		//Vergleich auf Referenzen
		if(hallo == hallo2) {
			System.out.println("Referenzen sind gleich!");
		}
		else {
			System.out.println("Referenzen sind nicht gleich!");
		}
		/*
		 * Compare to:
		 * 
		 * s1.compareTo(s2) = <0 s1 kleiner s2
		 * 					  =0 s1 gleich s2
		 * 					  >0 s1 größer s2 
		 */
		if (hallo.compareTo(hallo2) ==0) {
			System.out.println("Gleich");
		}
		else {
			System.out.println("nicht gleich");
		}
			
	}

}
