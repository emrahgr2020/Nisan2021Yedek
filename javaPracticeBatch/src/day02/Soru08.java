package day02;

import java.util.Scanner;

public class Soru08 {

	public static void main(String[] args) {
		// kullanicidan bir kelime isteyin
		// eger kelime 3 ve daha fazla kelimeden olusuyorsa
		// son iki harfini 3 kere yan yana yazdirin.
		// degil ise girilen kelimeyi yazdirin
		// input =Ali output=lilili
		// input=el output=el

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir kelime giriniz");
		String harf = scan.next();

		if (harf.length() >= 3) {
			System.out.println(harf.substring(harf.length()-2)+
					harf.substring(harf.length()-2)+harf.substring(harf.length()-2));
		} else {
			System.out.println(harf);
		}
		scan.close();

	}

}
