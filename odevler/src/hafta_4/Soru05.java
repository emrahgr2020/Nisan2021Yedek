package hafta_4;

import java.util.Scanner;

public class Soru05 {

	public static void main(String[] args) {
		/*
		Kullanıcıdan bir kelime girmesini isteyin. 
		Sözcükte tek sayıda karakter ve 3 veya daha fazla karakter içeriyorsa,
		 kelimenin ortasındaki karakteri yazdırın.
		*/


		Scanner scan =new Scanner (System.in);
		System.out.println("Lutfen bir kelime giriniz" );
		String kelime=scan.next().toLowerCase();
		
		if ((kelime.length()%2!=0) && kelime.length()>=3) {
			System.out.println(kelime.charAt((kelime.length()-1)/2));
		}else {
			System.out.println("Girilen kelimenin karekter sayisi cifttir...");
		}
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
