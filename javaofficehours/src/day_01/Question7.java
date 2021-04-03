package day_01;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		/*Soru 4:
		 * Kullanicidan 8 primitive veri tipinde de deger alalim ve ekrana yazdiralim.				
	     * 1. Adim : Scanner class'i ile kullanicidan veri alalim				
	     * 2. Adim : Aldigimiz her bir veriyi degiskenlere atayalim				
	     * 3. Adim : Ekrana yazdiralim.				
	       	INPUT      : 41			
	        OUTPUT  : Kullanicidan Aldigimiz sayi = 41		
				
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen byte veri tipinde bir veri giriniz");
		byte byteData=scan.nextByte();
		System.out.println("Girdiginiz byte veri tipindeki deger : "+ byteData);
		
		System.out.println("Lutfen short veri tipindebir veri tipinde bir veri giriniz");
		short shortData=scan.nextShort();
		System.out.println("Girdiginiz short veri tipindeki deger : "+ shortData);
		scan.close();

	}

}
