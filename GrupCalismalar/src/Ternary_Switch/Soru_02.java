package Ternary_Switch;

import java.util.Scanner;

public class Soru_02 {
	/*
	 * Kullanıcının girdiği gün sayısına karşılık gelen haftanın
	 * gününün adını yazıdırınız. haftanın 1.günü Pazartesi alınız.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 1 ile 7 arasinda haftanin gununu giriniz");
		int gun = scan.nextInt();
		
		switch (gun) {
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Sali");
			break;
		case 3:
			System.out.println("Carsamba");
			break;
		case 4:
			System.out.println("Persembe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		case 7:
			System.out.println("Pazar");
			break;

		default:
			System.out.println("Yanlis giris yatiniz");
			break;
		}
		
		
		scan.close();
		
		
	}
}
