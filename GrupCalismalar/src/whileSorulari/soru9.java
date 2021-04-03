package whileSorulari;

import java.util.Scanner;

public class soru9 {

	public static void main(String[] args) {
		/*
//        Girilen bir sayıya kadar olan sayılardan 
 * 			sadece tek olanlarını ekrana yazdırınız.
 */
//         girilen sayı dahil
//        */

		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		System.out.print("Girilen sayidan 0'a kadarki cift sayilar : ");
		while(sayi>=0) {
			if(sayi%2==0) {
				System.out.print(sayi+" ");
			}
			sayi--;
		}
		scan.close();
		
		
		
	}

}
