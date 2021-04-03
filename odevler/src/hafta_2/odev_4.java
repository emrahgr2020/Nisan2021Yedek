package hafta_2;

import java.util.Scanner;

public class odev_4 {

	public static void main(String[] args) {
		/*
		Kullanicidan 3 basamakli bir sayi isteyin 
		ve bu sayinin basamaklari toplamini konsolda yazdiran programi yaziniz.
		*/

		Scanner scan= new Scanner (System.in);
		System.out.println("Lutfen uc basamakli sayi giriniz");
		
		int sayi=scan.nextInt();
		
		
		int birlerBasamagi= sayi%10;
		sayi/=10;
		int onlarBasamagi = sayi%10;
		sayi/=10;
		int yuzlerBasamagi = sayi;
		
		System.out.println(birlerBasamagi + onlarBasamagi + yuzlerBasamagi);
		
		scan.close();
		
	}

}
