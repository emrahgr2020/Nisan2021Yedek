package day04;

import java.util.Scanner;

public class Odev1 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan alinan sayilarin toplami 25 e ulastiginda kazandiniz yazdiran
		 * bir oyun olusturun
		 *
		 * Not: 1- Oyun 0 basildiginda bitmelidir. 2- Girilen sayilarin toplami 25 e
		 * ulastiginda oyun bitmeli ve kazandiniz yazdirilmali 3- sayilarin toplami 25
		 * ulasmadan 0 a basilirsa kaybettiniz yazdirilmali
		 *
		 * INPUT : 1 5 8 9 2 OUTPUT : Oyun Bitti, Kazandiniz, Girilen sayilarin toplami
		 * 25 e ulasti INPUT : 1 5 8 0 OUTPUT : Oyun Bitti, Kaybettiniz, Girilen
		 * sayilarin toplami 25 e ulasamadi
		 */

		Scanner scan = new Scanner(System.in);
		int toplam = 0;
		int sayi = 1;
		do {
			System.out.println("Lutfen bir sayi girin");
			sayi = scan.nextInt();
			toplam += sayi;

		} while (sayi != 0);

		if (sayi == 0) {
			if (toplam >= 25) {
				System.out.println("Oyun Bitti, Kazandiniz, Girilen sayilarin toplami 25 e ulasti toplam : " + toplam);
			} else {
				System.out.println("Oyun Bitti, Kaybettiniz, Girilen sayilarin toplami 25 e ulasamadi");
			}
		}
		scan.close();
	}

}
