package while_sorulari;

import java.util.Scanner;

public class Soru07 {

	public static void main(String[] args) {
		// INTEGER OLAN PIN kodunuzu kontrol eden bir kod yazınız

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen rakamsal pin kodunuzu giriniz");
		int pinCode = scan.nextInt();

		int userCode = 1234;

		while (!(userCode == pinCode)) {

			System.out.println("Yanlis pin girdiniz...");
			System.out.println("Tekrar giriniz...");
			pinCode = scan.nextInt();

		}
		System.out.println("Girilen pin dogru.. Tebrikler...");
scan.close();
	}

}
