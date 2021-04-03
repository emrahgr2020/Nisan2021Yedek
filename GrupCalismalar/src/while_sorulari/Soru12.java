package while_sorulari;

import java.util.Scanner;

public class Soru12 {

	public static void main(String[] args) {
		/*
		 * // sayinin basamak degerlerinin toplamini while loop ile yapiniz //
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir pozitif tam sayi giriniz");
		int sayi = scan.nextInt();

		System.out.println(basamaklarToplami(sayi));

		scan.close();
	}

	public static int basamaklarToplami(int sayi) {
		int add = 0;

		while (sayi != 0) {
			add += sayi % 10;
			sayi /= 10;
		}
		return add;
	}

}
