package kapitel_1;
import java.util.Scanner;

public class GemeinsamerTeiler {

	public static void main(String[] args) {
		int zahl1, zahl2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("x = ");
		zahl1 = sc.nextInt();
		
		System.out.println("y = ");
		zahl2 = sc.nextInt();
		
		sc.close();
		
		System.out.printf("ggt(%d, %d) = %d\n", zahl1, zahl2, ggT(zahl1, zahl2));

	}
	
	private static int ggT(int zahl1, int zahl2) {
		while (zahl1 > 0) {
			if(zahl1<zahl2) {
				int buffer = zahl1;
				zahl1 = zahl2;
				zahl2 = buffer;
			}
			zahl1 -= zahl2;
		}
		return zahl2;
	}
	
	private static int ggTfor(int zahl1, int zahl2) {
		for(;zahl1 > 0; zahl1 -= zahl2) {
			if(zahl1<zahl2) {
				int buffer = zahl1;
				zahl1 = zahl2;
				zahl2 = buffer;
			}
		}
		return zahl2;
	}
}
