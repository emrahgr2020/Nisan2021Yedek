package day02;

import java.util.Scanner;

public class Soru04 {

	public static void main(String[] args) {
		/*
		 * Kullanıcı tarafından girilen bir sayının mutlak değerini yazdırmak için bir
		 * program yazın.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi = scan.nextInt();

		if (sayi < 0) {
			System.out.println(sayi * -1);
		} else if(sayi>=0) {
			System.out.println(sayi);
		}

		scan.close();
	}

}
