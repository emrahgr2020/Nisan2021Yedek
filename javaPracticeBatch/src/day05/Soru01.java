package day05;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan int array uzunlugunu isteyin Arrayin uzunlugu kadar kullanicidan
		 * array elemanlarini girmesini isteyin Array elemanlarini toplamini return eden
		 * metod yazin
		 */

		// 1. kULLANICIDAN ARRAY UZUNLUGU KADAR ARRAY ELEMANlari girlmesi
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen array uzunlugunu giriniz");
		int uzunluk = scan.nextInt();

		int arr[] = new int[uzunluk];

		// 2. adim kullanicidan array uzunlugu kadar array elemani girmesini isteyin
		System.out.println("Lutfen girdiginiz uzunluk kadar eleman giriniz");

		for (int i = 0; i < uzunluk; i++) {
			arr[i] = scan.nextInt();
		}

		// 4. adim olusturulan methodun cagirilmasi

		System.out.println(arrayElToplami(arr));

		scan.close();

	}

	// 3. adim array elemanlarini toplayan method yazalim

	public static int arrayElToplami(int arrSum[]) {
		int sum = 0;
		
		for (int each : arrSum)
			sum += each;

		return sum;
	}
}
