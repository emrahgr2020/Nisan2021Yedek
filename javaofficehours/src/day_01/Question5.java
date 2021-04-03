package day_01;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
		 * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
		 * Test data: ali eme all 
		 */
		Scanner scan= new Scanner (System.in);
		System.out.println("Lutfen uc harfli bir isim giriniz");
		String name = scan.next();
		
		
		System.out.println(name.length()==3 ? "sayi 3 basamakli": "sayi uc bsaamakli degil");
		
		String flag= "Harfler farkli";
		
				
		for (int i = 0; i < name.length(); i++) {
			if (name.indexOf(name.charAt(i))!= name.lastIndexOf(name.charAt(i))) {
				 flag="Harfler ayni";
						
			}
			
		}
		
		System.out.println(flag);
		scan.close();
		
		
		
		
	}

}
