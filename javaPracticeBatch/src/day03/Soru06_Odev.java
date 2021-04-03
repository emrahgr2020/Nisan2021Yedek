package day03;

import java.util.Scanner;

public class Soru06_Odev {

	public static void main(String[] args) {
		/*
		 * Complete the 'fizzBuzz' function below.
		 *
		 * The function accepts INTEGER n , k as parameter.
		 *
		 * Example 1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen pozitif bir sayi giriniz");
		int sayi = scan.nextInt();

		if (sayi > 0) {
			for (int i = 1; i <= sayi; i++) {
				
				if (i % 5 == 0 && i % 3 == 0) {
					String s = String.valueOf(i);
					s = "Fizz Buzz";
					System.out.println(s + " ");
				} else if (i % 5 == 0) {
					String s = String.valueOf(i);
					s = "Buzz";
					System.out.println(s + " ");
				} else if (i % 3 == 0) {
					String s = String.valueOf(i);
					s = "Fizz";
					System.out.println(s + " ");
				} else {
					System.out.println(i + " ");
				}

			}

		} else {
			System.out.println("Lutfen istenilen deger araliginda sayi giriniz");
		}
scan.close();
	}

}
