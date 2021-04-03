package while_sorulari;

import java.util.Scanner;

public class Soru10 {

	public static void main(String[] args) {
		// Kullanıcıdan 5 sayı isteyiniz,
		// bu sayılardan en büyüğünü bularak yazdırınız.

		Scanner scan = new Scanner(System.in);

		int enBuyukSayi = 0;
		int count = 1;

		while (count <= 5) {
			System.out.println("Lutfen " + count + ". sayiyi giriniz");
			int sayi = scan.nextInt();
			if (sayi > enBuyukSayi) {
				enBuyukSayi = sayi;
			}
			count++;
		}
		System.out.println("En buyuk sayi: " + enBuyukSayi);

		scan.close();
	}

}
