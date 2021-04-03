package day04;

import java.util.Scanner;

public class Soru4 {

	public static void main(String[] args) {
		/* Bir Stringin tersten ayni olup olmadigini bulunuz.  (Palindrom)
		 *
		 * ornek
		 *  madam , nursesrun  ==> palindromdur
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir string giriniz");
		String str=scan.nextLine().replace(" ", "").toLowerCase();
		palindrom(str);
		scan.close();
	}

	public static void palindrom(String str) {
		
		String strTers="";
		
		for(int i=str.length()-1; i>=0;i--) {
			
			strTers +=str.charAt(i);
		}
		if (strTers.equals(str)) {
			System.out.println("Girilen string palidromdur");
		} else {
			System.out.println("Girilen string palidrom degildir");
		}
		
	}
}
