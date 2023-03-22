package uebung;

public class Rechner {
	
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	public static void main(String[] args) {
		Rechner rechner = new Rechner();
		int summe = rechner.add(1,3);
		System.out.printf("1 + 3 = %d\n", summe);
	}
	

}
