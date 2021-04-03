package day_01;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir karakter girmesini isteyip, o karakterin ascii degerini yazdirin
	ORNEK:
	        INPUT : #
			 OUTPUT : girdiginiz # karakterinin ascii degeri = 125'dir.
		 */
	

		Scanner scan= new Scanner (System.in);
		System.out.println("Lutfen bir karakter giriniz");
		char karakter= scan.next().charAt(0);

		int karakterAscii=(int) karakter;
		System.out.println("girdiginiz " + karakter + " karakterinin ascii degeri "+ karakterAscii );
		
		System.out.println(karakter + 0); //girilen degeri 0 ile toplayinca ascii degeri olusuyor
		
		
		scan.close();
	}

}
