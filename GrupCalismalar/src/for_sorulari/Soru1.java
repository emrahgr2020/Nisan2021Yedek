package for_sorulari;

import java.util.Scanner;

public class Soru1 {

	public static void main(String[] args) {
		 /*
	     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
	     1-1-2-3-5-8-13-21-34....
	     */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen bir tam sayi giriniz");
		int sayi= scan.nextInt();
		
		int x=1;
		int y=1;
		int toplam=0;
		//1-1-2-3-5-8-13-21-34
		
		for (int i = 1; i <= sayi; i++) {	
		System.out.print(x+",");
		toplam = x+y;
		x=y;
		y=toplam;
		
		}
		scan.close();
	}

}
