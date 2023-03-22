package kapitel_1;

import java.util.Scanner;

public class Hundejahre {

	public static void main(String[] args) {
		//init vars
		Scanner sc  = new Scanner(System.in);
		int hundeJahre, menschenJahre;
		
		System.out.println("Hundejahre: ");
		hundeJahre= sc.nextInt();
		
		sc.close();
		
		//logic of converting dog years to human years
		if(hundeJahre<=0){
			System.out.println("Ungueltiger Wert!");
			return;
		}
		if(hundeJahre ==1) {
			menschenJahre = 14;
			
		}
		else if(hundeJahre ==2) {
			menschenJahre = 22;
		}
		else {
			menschenJahre = 22 + 5 * (hundeJahre -2);
		}
		System.out.printf("Menschenjahre: %d\n", menschenJahre);
		
		//same but with switch case
		switch(hundeJahre) {
		case 1:
			menschenJahre = 14;
			break;
		case 2:
			menschenJahre = 22;
			break;
		default:
			menschenJahre = 22 + 5 * (hundeJahre -2);
			break;
		}
		System.out.printf("Menschenjahre: %d\n", menschenJahre);
	}

}
