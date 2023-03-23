package kapitel_1;
import java.util.Scanner;

public class Zeichenklassifikator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ausgabe = "";
		
		//Einlesen
		char z;
		z = sc.nextLine().charAt(0);
		
		if (z>= '0' && z<= '9') {
			ausgabe = "Ziffer";
		}
		else if ('A' <= z && z<='Z') {
			ausgabe = "Großbuchstabe";
		}
		else if('a' <= z && z <= 'z') {
			ausgabe = "Kleinbuchstabe";
		}
		else {
			ausgabe = "Sonderzeichen";
		}
			
		System.out.println(ausgabe);
		
		

	}

}
