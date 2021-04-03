package while_sorulari;

import java.util.Scanner;

public class Soru08 {

	public static void main(String[] args) {
		// STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen String tipinde  pin kodunuzu giriniz");
		String pinCode = scan.next();
		
		String userCode="abcde";
		
		while(!userCode.equals(pinCode)) {
			System.out.println("Yanlis pin girdiniz...");
			System.out.println("Tekrar giriniz...");
			pinCode = scan.next();
		}
		System.out.println("Girilen pin dogru.. Tebrikler...");
		scan.close();
	}

}
