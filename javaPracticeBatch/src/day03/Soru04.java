package day03;

import java.util.Scanner;



public class Soru04 {

	public static void main(String[] args) {
		/* Kullanicidan 10’dan kucuk bir sayi alin ve ornekteki gibi carpim tablosu olusturun
        *
        * ORNEK:
        * INPUT : number: 4 OUTPUT : 1 2 3 4
        *                            2 4 6 8
        *                            3 6 9 12
        *                            4 8 12 16
        */

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 10 dan kucuk pozitif bir sayi giriniz");
		int sayi=scan.nextInt();
		
		carpimTablosu(sayi);
		scan.close();
	}
	
	public static void carpimTablosu(int sayi) {
		
		if (sayi<0) {
			System.out.println("Lutfen pozitif 10 dan kucuk sayi giriniz");
		}else {
			for (int i = 1; i <= sayi; i++) {
				for (int j = 1; j <=sayi; j++) {
					System.out.print(i*j+" ");
				}System.out.println();
			}
			
		}
		
			

		
		
		
	}
	

}
