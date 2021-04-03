package hafta_3;

import java.util.Scanner;

public class Odev5 {

	public static void main(String[] args) {
		/*
		 * Kullanıcını 1 ile 7 arasında bir sayı girdiğinde haftanın hangi günü olduğunu
		 * yazdıran switch case java kodunu yazinız.
		 */

		//Soru 5
		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen haftanin gunleri icin 1 den 7 ye kadar bir deger  giriniz : ");
		int gun = scan.nextInt();

		
		
		switch (gun) {
		case 1:
			System.out.println("Gunlerden : Pazartesi");
			break;
		case 2:
			System.out.println("Gunlerden : Sali");
			break;
		case 3:
			System.out.println("Gunlerden : Carsamba");
			break;
		case 4:
			System.out.println("Gunlerden : Persembe");
			break;
		case 5:
			System.out.println("Gunlerden : Cuma");
			break;
		case 6:
			System.out.println("Gunlerden : Cumartesi");
			break;
		case 7:
			System.out.println("Gunlerden : Pazar");
			break;

		default:
			System.out.println("Lutfen gecerli rakam giriniz");
			break;
		}
		scan.close();
	}

}
