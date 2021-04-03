package day_01;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		/*
		 * Soru 2: Kullanicidan Y/N ikilisinden birisini girdiginde girdigi degeri
		 * ekrana yazdiran java kodunu yaziniz.
		 * INPUT : Y
		 * 	OUTPUT : YES
		 */

		Scanner scan= new Scanner (System.in);
		System.out.println("Lutfen Yes icin 'Y' , No icin 'N' giriniz");
		char harf = scan.next().charAt(0);
		
		if (harf=='Y' || harf=='y') {
			System.out.println("YES");
		} else if(harf=='N' || harf=='n'){
			System.out.println("NO");
		}else {
			System.out.println("Yanlis giris yaptiniz. Lutfen tekrar deneyiniz...");
		}
		
		scan.close();

	}

}
