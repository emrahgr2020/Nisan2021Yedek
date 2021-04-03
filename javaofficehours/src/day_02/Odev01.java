package day_02;

import java.util.Scanner;

public class Odev01 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan 50 den kucuk bir sayi alin, 1 den girilen sayiya kadar tum
		 * sayilari asagidaki kurallara gore yazdirin Kural 1) sayilar yanyana yazilacak
		 * arada 1 bosluk olacak Kural 2) Sayi 3’e bolunuyorsa sayi yerine “Java”
		 * yazilacak Kural 3) Sayi 5’e bolunuyorsa sayi yerine “Ogreniyorum” yazacak
		 * Kural 4) Sayi hem 3 e hem 5 e bolunuyorsa “Java Ogreniyorum” yazacak Kural 5)
		 * Her kelime yazdiginda alt satira gececek
		 * 
		 * ORNEK: INPUT : 20 OUTPUT : 1 2 Java 4 Ogreniyorum Java 7 8 Java Ogreniyorum
		 * ………
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 50 den kucuk pozitif bir sayi giriniz");
		int sayi = scan.nextInt();

		if (sayi > 0 && sayi < 50) {
			System.out.println("KURAL 1 :");
			for (int i = 1; i <= sayi; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		} else {
			System.out.println("Lutfen istenilen deger araliginda sayi giriniz");
		}
		// Kural 2 sonu

		if (sayi > 0 && sayi < 50) {
			System.out.println("KURAL 2 :");
			for (int i = 1; i <= sayi; i++) {
				if (i % 3 == 0) {
					String s = String.valueOf(i);
					s = "Java";
					System.out.print(s + " ");
				} else {
					System.out.print(i + " ");
				}
			}
		} // Kural 2 sonu
		System.out.println();

		if (sayi > 0 && sayi < 50) {
			System.out.println("KURAL 3 :");
			for (int i = 1; i <= sayi; i++) {
				if (i % 5 == 0) {
					String k = String.valueOf(i);
					k = "Ogreniyorum";
					System.out.println(k + " ");

				} else {
					System.out.println(i + " ");
				}
			}

		} // Kural 3 sonu
		System.out.println();
		if (sayi > 0 && sayi < 50) {
			System.out.println("KURAL 4 :");
			for (int i = 1; i <= sayi; i++) {
				if (i % 5 == 0 && i%3==0) {
					String c = String.valueOf(i);
					c = "Java Ogreniyorum";
					System.out.println(c + " ");

				} else {
					System.out.println(i + " ");
				}
			}
		}//Kural 4 sonu 
		scan.close();
		
	}
}
