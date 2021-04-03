package hafta_5;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		/*
		Kullanıcıdan bir isim ve karakter girmesini isteyin, sonra
		 karakterin kaç kez tekrarlandığını kontrol edin.
		e.g:
		char ch1= 'a' ;
		String name =“John came late" 
		=> Tekrar Sayisi = 2
		*/
		
		
		//1.soru
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir isim giriniz");
		String isim=scan.nextLine().toLowerCase();
		System.out.println("Lutfen bir karekter giriniz");
		char karakter=scan.next().toLowerCase().charAt(0);
		
		int tekrarSayisi=0;
		for (int i=0; i<isim.length();i++) {
			if (isim.charAt(i)==karakter) {
				tekrarSayisi++;
			}
		}
		System.out.println("Cumlede girilen karekterden "+ tekrarSayisi+" adet vardir.");
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}
