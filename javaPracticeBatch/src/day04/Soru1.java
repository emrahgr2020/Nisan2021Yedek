package day04;

import java.util.Scanner;

public class Soru1 {

	public static void main(String[] args) {
		/*
		 * Kulanicidan alina bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
		 * return eden metod yaziniz
		 *
		 * ornek
		 * input  elma  2
		 *        army  3
		 *
		 * output  eaea
		 *         ayayay
		 */
		 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir string deger girin");
		String input=scan.nextLine();
		System.out.println("Lutfen girilen stringin ilk ve son harfleri kac kez tekrarlasin");
		int sayi=scan.nextInt();
		
		
		System.out.println(ilkSonHarf(input, sayi));
		scan.close();
	}
 
	public static String ilkSonHarf(String str, int n) {
		
		String s=str.substring(0,1) +str.substring(str.length()-1);
		String b="";
		for(int i=1; i<=n; i++) {// donguyu saglayabilmek icin i degerini 1 den baslatiyoruz
			b=b+s;
		}
		
		
		
		return b;
	}
}
