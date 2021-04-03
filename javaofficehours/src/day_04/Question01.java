package day_04;

import java.util.Arrays;
import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan bir isim alin ve bu ismi char array'ine donusturen bir method
		 * yazin
		 * 
		 *
		 * (toCharArray methodunu kullanmayin)
		 *
		 * Input : John Output : [J, o, h, n]
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir isim giriniz");
		String isim = scan.next();

		// System.out.println(Arrays.toString(charaDonustur(isim)));
		char harfler2[] = charaDonustur(isim);// boyle de yapilir
		System.out.println(Arrays.toString(charaDonustur(isim)));
	}

	public static char[] charaDonustur(String isim) {

		char harfler[] = new char[isim.length()];// Tecpro t, e, c, h, p, r, o
		for (int i = 0; i < isim.length(); i++) {
			harfler[i] = isim.charAt(i);

		}
		return harfler;

	}

}
