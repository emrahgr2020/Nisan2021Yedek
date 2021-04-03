package while_sorulari;

import java.util.Scanner;

public class Soru24 {
	/*
	 *  Girilen pozitif bir sayının tam kare olup olmadığını bulunuz, 
	 *  tamkare ise true değilse false yazdırınız.
	 * 
	 * Not: sqrt gibi fonksiyonları kullanmayın. 
	 *  Example 1: 
	 *  Input: 16 
	 * Output: true 
	 *  Not: bu sayı tamkare çünkü 4*4 = 16 
	 * Example 2: 
	 *  Input: 25 
	 * Output: true 
	 *Note: bu sayı tamkare çünkü 5*5=25
	 *  Example 3: 
	 
	 * Input: 14 
	 * Output: false 
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir pozitif tam sayi giriniz");
		int sayi = scan.nextInt();
		
		int count=0;
		boolean bl=false;
		
		while(count*count<=sayi) {
			
			if(count*count==sayi) {
				System.out.println("true");
				bl=true;
			}
			count++;
		}
		if(bl==false) {
			System.out.println(bl);
		}
		scan.close();
	}

}
