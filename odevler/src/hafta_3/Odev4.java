package hafta_3;

import java.util.Scanner;

public class Odev4 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan 3 tane pozitif tam sayi alalim bu uc sayidan ucgen olup olmama
		 * durumunu kontrol edelim eger ucgen olabiliyor ise, es kenar ucgen mi kontrol
		 * edelim.
		 * 
		 * Ucgen olma kosullari. b+c>a>b-c 1 a+c>b>a-c 1 a+b>c>a-b 1
		 * 
		 * Eskenar ucgen olma kosullari. a=b=c
		 * 
		 * Konsolda asagidaki durumlari yazdiralim. Eskenar ucgen Sadece ucgen Ucgen
		 * degildir
		 */

		//Soru 4
		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen Uckenin 1. kenarini  giriniz : ");
		int kenar1 = scan.nextInt();
		System.out.print("Lutfen Uckenin 2. kenarini  giriniz : ");
		int kenar2 = scan.nextInt();
		System.out.print("Lutfen Uckenin 3. kenarini  giriniz : ");
		int kenar3 = scan.nextInt();

		if ((kenar2 + kenar3 > kenar1 && kenar1 > kenar2 - kenar3)
				|| (kenar1 + kenar3 > kenar2 && kenar2 > kenar1 - kenar3)
				|| kenar2 + kenar1 > kenar3 && kenar3 > kenar2 - kenar1) {
			if (kenar1 == kenar2 && kenar1 == kenar3) {
				System.out.println("Girilen degerler eskenar ucgendir");
			} else {
				System.out.println("Girilen degerler ucgen dir");
			}

		} else {
			System.out.println("Girilen degerler bir ucgen icin gecerli degildir");
		}
		scan.close();
	}

}
