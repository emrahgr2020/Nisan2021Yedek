package hafta_3;

import java.util.Scanner;

public class Odev3 {

	public static void main(String[] args) {
		/*
		 * “NestedIfStatements�? class olusturun.
		 * 
		 * Kullanicidan 2 kisi icin dogum gunu girmesini isteyin.
		 * 
		 * Yılı, ayi ve günü tamsayı olarak alın e NestedIf kullanarak kimin yas olarak
		 * daha buyuk oldugunu ekrana yazdirin. Examples: int birthYearOfYusuf=2000,
		 * birthMonthOfYusuf=12, birthDayOfYusuf=12, int
		 * birthYearOfMehmet=2000,birthMonthOfMehmet=12, birthDayOfMehmet=21; Yusuf is
		 * Older
		 */
		
		
		//Soru 3
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen Yusuf'un dogum  yilini  giriniz : ");
		int birthYearOfYusuf = scan.nextInt();
		System.out.print("\nLutfen Yusuf'un dogum  ayini  giriniz : ");
		int birthMonthOfYusuf = scan.nextInt();
		System.out.print("\nLutfen Yusuf'un dogum  gununu  giriniz : ");
		int birthDayOfYusuf = scan.nextInt();
		System.out.print("\nLutfen Mehmet'in dogum  yilini  giriniz : ");
		int birthYearOfMehmet = scan.nextInt();
		System.out.print("\nLutfen Mehmet'in dogum  ayini  giriniz : ");
		int birthMonthOfMehmet = scan.nextInt();
		System.out.print("\nLutfen Mehmet'in dogum  gununu  giriniz : ");
		int birthDayOfMehmet = scan.nextInt();

		if (birthYearOfYusuf == birthYearOfMehmet) {
			if (birthMonthOfYusuf == birthMonthOfMehmet) {
				if (birthDayOfYusuf > birthDayOfMehmet) {
					System.out.println("Mehmet is Older");
				} else {
					System.out.println("Yusuf is Older");
				}
			} else if (birthMonthOfYusuf > birthMonthOfMehmet) {
				System.out.println("Mehmet is Older");
			} else {
				System.out.println("Yusuf is Older");
			}
		} else if (birthYearOfYusuf > birthYearOfMehmet) {
			System.out.println("Mehmet is Older");
		} else {
			System.out.println("Yusuf is Older");
		}
		scan.close();
	}

}
