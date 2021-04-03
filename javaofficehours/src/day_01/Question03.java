package day_01;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		/*
	     * Kullanicidan uc basamakli bir sayi alin
	     * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
	     *
	     *
	     * Ornek : Inputs : 853
	     * Output : Girdiginiz sayinin birler basamagi : 3
	     *          Girdiginiz sayinin onlar basamagi : 5
	     *          Girdiginiz sayinin yuzler basamagi : 8
	     *
	     *
	     */
	
		Scanner scan= new Scanner (System.in);
		System.out.println("Lutfen uc basamakli sayi giriniz");
		int sayi = scan.nextInt();
		
		//int yuzler =sayi/100, onlar=sayi/10%10, birler=sayi%10;
		//System.out.println(yuzler + " "+ onlar+ " "+ birler);
		
		int birlerBasamagi=sayi%10;
		sayi/=10;
		int onlarBasamagi= sayi%10;
		sayi/=10;
		int yuzlerBasamagi=sayi%10;
		sayi /=10;
		
		System.out.println("Girdiginiz sayinin birler basamagi: " +birlerBasamagi);
		System.out.println("Girdiginiz sayinin onlar basamagi: " +onlarBasamagi);
		System.out.println("Girdiginiz sayinin yuzler basamagi: " +yuzlerBasamagi);
		
		
		scan.close();
	}

}
