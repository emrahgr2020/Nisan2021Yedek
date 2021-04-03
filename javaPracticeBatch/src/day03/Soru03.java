package day03;

import java.util.Scanner;

public class Soru03 {

	public static void main(String[] args) {
		/*
		 * Perfect Number (Mukemmel sayi) Bir sayinin mukemmel olup olmadigini bulan
		 * method yaziniz. Mukemmel sayi : bir sayinin kendisi haric bolenlerinin
		 * toplami, kendisine esitse o sayi mukemmeldir. ORNEK: INPUT : 6 OUTPUT : 1,2,3
		 * 1+2+3 = 6 = 6 (Mukemmel)
		 */

		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int sayi=scan.nextInt();
		for (int i = 1; i <=sayi; i++) {
			mukemmelSayi(i);
		}
		
		scan.close();
		
	}

	public static void mukemmelSayi(int n) {

		int sum = 0;

		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == n) {
			System.out.println(n + " mukemmel sayidir");
		} else {
			System.out.println(n + " mukkemmel sayi degildir");
		}

	}

}
