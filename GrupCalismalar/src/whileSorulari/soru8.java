package whileSorulari;

import java.util.Scanner;

public class soru8 {

	public static void main(String[] args) {
		// STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.

		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen pin kodunuzu giriniz");
		String pin=scan.next();
		
		String userPin="abcdef";
		
		while(!userPin.equals(pin)) {
			System.out.println("Yanlis giris \nTekrar deneyiniz");
			pin=scan.next();
		}
		System.out.println("Tebrikler pin dogru girilmistir...");
		scan.close();
	}

}
