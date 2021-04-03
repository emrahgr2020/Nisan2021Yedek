package while_sorulari;

import java.util.Scanner;

public class Soru05 {

	public static void main(String[] args) {
		// GİRİLEN SAYININ BASAMAKLARINDAKİ RAKAMLARIN TOPLAMINI BULUNUZ.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen basamaklarini toplamak istediginiz bir sayi giriniz");
		int sayi = scan.nextInt();

		int add=0;
		
		do {
			add+=sayi%10;//123 ==>3
			sayi/=10;//12
			//System.out.println(sayi);
			
			
		}while(sayi!=0);
		//System.out.println(sayi);
		System.out.println("Girilen sayinin basamaklarinin toplami = "+ add);
		
		
		scan.close();
	}

}
