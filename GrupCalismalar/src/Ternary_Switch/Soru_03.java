package Ternary_Switch;

import java.util.Scanner;

public class Soru_03 {

	// Girilen bir sayının onlar basamağının rakam değerini
	// yazı ile yazdırınız.

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir rakam giriniz");
		int rakam = scan.nextInt();
		
		
		if (rakam >=10) {
			int onlarBasamagi=(rakam/10)%10;
			
			
			switch (onlarBasamagi) {
			case 0:
				System.out.println("Onlar basamagi: sifir");
				break;
			case 1:
				System.out.println("Onlar basamagi: bir");
				break;
			case 2:
				System.out.println("Onlar basamagi: iki");
				break;
			case 3:
				System.out.println("Onlar basamagi: uc");
				break;
			case 4:
				System.out.println("Onlar basamagi: dort");
				break;
			case 5:
				System.out.println("Onlar basamagi: bes");
				break;
			case 6:
				System.out.println("Onlar basamagi: alti");
				break;
			case 7:
				System.out.println("Onlar basamagi: yedi");
				break;
			case 8:
				System.out.println("Onlar basamagi: sekiz");
				break;
			case 9:
				System.out.println("Onlar basamagi: dokuz");
				break;

			default:
				System.out.println("Yanlis giris yaptiniz...");
				break;
			}

			
		}else {
			System.out.println("Lutfen en az iki basamakli bir sayi giriniz..");
		}
		scan.close();

	}

}
