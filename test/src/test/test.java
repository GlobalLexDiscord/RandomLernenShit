package test;
import java.util.*;


public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		System.out.println(LOL());
		System.out.printf("sui %s", LOL());
		System.out.printf("input text: %s",text);
		sc.close();
		
		int numTest = 21;
		System.out.println("random Num: " + numTest);
		System.out.println();
		
		
		Hurensohn husoClass = new Hurensohn();
		System.out.println(husoClass.hurensohnZahl);
	}
	
	public static String LOL() {
		
		return "0";
	}

}
