package whileSorulari;

import java.util.Scanner;

public class Soru7 {

	public static void main(String[] args) {
		// INTEGER OLAN PIN kodunuzu kontrol eden bir kod yazınız.

		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen pin kodunuzu giriniz");
		int pin=scan.nextInt();
		
		int userPin=123456;
		
		
		while(!(userPin==pin)) {
			System.out.println("Yanlis pin girdiniz \nTekrar deneyiniz");
			pin=scan.nextInt();

		}
		System.out.println("Girilen pin dorudur... Tebrikler...");
	}

}
