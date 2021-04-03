package whileSorulari;

import java.util.Scanner;

public class soru10 {

	public static void main(String[] args) {
	// Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.

		Scanner scan= new Scanner(System.in);
		//1 2 5 3 6 
		int enBuyuk=0;
		int count=1;
		while(count<=5) {
			System.out.println("Lutfen "+count+". sayiyi giriniz");
			int sayi=scan.nextInt();
			if(sayi>enBuyuk) {
				enBuyuk=sayi;
			}
			count++;
		}
		System.out.println("En buyuk sayi : "+ enBuyuk);
		scan.close();
	}

}
