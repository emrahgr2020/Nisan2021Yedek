package day_01;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

		/*
		 * Soru 4: Kullanicinin girmis oldugu 1 ile 12 arasindaki sayinin yilin hangi
		 * ayi oldugunu yazdiran Switch Case java kodunu yaziniz.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 1 ile 12 arasinda bir rakam giriniz");
		byte ay = scan.nextByte();

		switch (ay) {
		case 1:
			System.out.println("Girdiginiz rakam Ocak ayi");
			break;
		case 2:
			System.out.println("Girdiginiz rakam Subat ayi");
			break;
		case 3:
			System.out.println("Girdiginiz rakam Mart ayi");
			break;
		case 4:
			System.out.println("Girdiginiz rakam Nisan ayi");
			break;
		case 5:
			System.out.println("Girdiginiz rakam Mayis ayi");
			break;
		case 6:
			System.out.println("Girdiginiz rakam Haziran ayi");
			break;
		case 7:
			System.out.println("Girdiginiz rakam Temmuz ayi");
			break;
		case 8:
			System.out.println("Girdiginiz rakam Agustos ayi");
			break;
		case 9:
			System.out.println("Girdiginiz rakam Eylul ayi");
			break;
		case 10:
			System.out.println("Girdiginiz rakam Ekim ayi");
			break;
		case 11:
			System.out.println("Girdiginiz rakam Kasim ayi");
			break;
		case 12:
			System.out.println("Girdiginiz rakam Aralik ayi");
			break;

		default:
			System.out.println("Lutfen gecerli bir ay giriniz");
			
			scan.close();

		}

	}

}
