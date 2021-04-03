package whileSorulari;

import java.util.Scanner;

public class Soru4 {

	public static void main(String[] args) {
		//GİRİLEN SAYININ BASAMAKLARINDAKİ RAKAMLARIN TOPLAMINI BULUNUZ.
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		//1234
		
		int add=0;
		
		do {
			add+=sayi%10;//4--3 --2--1
			sayi/=10;//12--1 Birler basamagini yok ediyoruz
			//System.out.println(sayi);
			
		}while(sayi!=0);
		System.out.println("Girilen sayinin basamaklarinin toplami : "+add);
		scan.close();
	}

}
