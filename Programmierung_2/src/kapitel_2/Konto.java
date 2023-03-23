package kapitel_2;

public class Konto {
	//Attribute
	private int kontonummer;
	
	//Konstruktor
	public Konto(int nr) {
		kontonummer = nr;
	}
	
	public void drucken() {
		System.out.printf("KontoNR: %d\n", this.kontonummer);
	}

	public static void main(String[] args) {
		Konto konto1 = new Konto(4711);
		Konto konto2 = new Konto(4712);
		
		//Konten ausgeben
		konto1.drucken();
		konto2.drucken();
		

	}

}
