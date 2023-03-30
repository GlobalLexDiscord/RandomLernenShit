package kapitel_2;

public class Quadrat {
	
	public int seitenl;
	
	public Quadrat(int seitenl) {
		this.seitenl = seitenl;
	}

	public int getSeitenl() {
		return this.seitenl;
	}
	
	public static void main(String[] args) {
		Quadrat[] quadrate = {
				new Quadrat(13),
				new Quadrat(3),
				new Quadrat(44)};
		
		System.out.println("Seitenlänge = " + quadrate[0].getSeitenl());

	}

}
