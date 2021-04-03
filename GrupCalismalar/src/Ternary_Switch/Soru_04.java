package Ternary_Switch;

import java.util.Scanner;

public class Soru_04 {
	// Girilen bir ay numarasına göre , ayın kaç gün olduğunu
	// sayı ile yazdırınız
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen ayin kac gun oldugunu ogrenmek icin 1 ile 12 arasinda rakam giriniz");
		int ay = scan.nextInt();

		
		switch (ay) {
		case 1:
			System.out.println("Ocak ayi 31 gundur");
			break;
		case 2:
			System.out.println("Subat ayi 28 gundur");
			break;
		case 3:
			System.out.println("Mart ayi 31 gundur");
			break;
		case 4:
			System.out.println("Nisan ayi 30 gundur");
			break;
		case 5:
			System.out.println("Mayis ayi 31 gundur");
			break;
		case 6:
			System.out.println("Haziran ayi 30 gundur");
			break;
		case 7:
			System.out.println("Temmuz ayi 31 gundur");
			break;
		case 8:
			System.out.println("Agustos ayi 31 gundur");
			break;
		case 9:
			System.out.println("Eylul ayi 30 gundur");
			break;
		case 10:
			System.out.println("Ekim ayi 31 gundur");
			break;
		case 11:
			System.out.println("Kasim ayi 30 gundur");
			break;
		case 12:
			System.out.println("Aralik ayi 31 gundur");
			break;
			
		default:
			System.out.println("Lutfen 1 ile 12 arasinda bir rakam giriniz");
			break;
		}
		scan.close();
	}

}
