package kapitel_1;
import java.util.Scanner;

public class MainTaschenrechner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,y;
		
		System.out.println("Zahl 1: ");
		x = sc.nextInt();
		System.out.println("Zahl 2: ");
		y = sc.nextInt();
		
		sc.close();
		
		System.out.printf("%d * %d  = %d, %d / %d = %f", x,y, x*y, x, y,(float) x/y);
		
	}

}
