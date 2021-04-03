package Ternary_Switch;

import java.util.Scanner;

public class Soru_01 {
    /*
    Girilen bir sayının önce 100 den küçük ise, 100 den 
    küçük yazdırın
    devamında 50 den küçük ise 50 den küçük yazdırın
    devamında 25 den küçük ise 25 den küçük yazdırın.
   */
	
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi= scan.nextInt();
		
		if (sayi<100) {
			System.out.println("Girilen sayi 100 den kucuk");
		}
		if (sayi<50) {
			System.out.println("Girilen sayi 50 den de kucuk");
		}
		if (sayi<25) {
			System.out.println("Girilen sayi 25 den de kucuk");
		}
		scan.close();
	}
	
	

}

