package day04;

import java.util.Scanner;

public class Odev2 {

	public static void main(String[] args) {
		/* Iki stringi birlestiren bir metod yaziniz
		 *
		 *  str1: Java is
           str2: fun
          Beklenen Çıktı:
          java is fun
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 1. String i giriniz");
		String str1=scan.nextLine();
		System.out.println("Lutfen 2. String i giriniz");
		String str2=scan.nextLine();
		
		
		
		System.out.println(str1+" "+str2);
		scan.close();
	}
}
