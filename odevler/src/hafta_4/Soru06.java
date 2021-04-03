package hafta_4;

import java.util.Scanner;

public class Soru06 {

	public static void main(String[] args) {
		
		/* 
		Kullanıcıdan firstName ve lastName'i girmesini isteyin, 
		ardından baş harflerini büyük harf yapın ve geri kalanı tamamen 
		kucuk harf olarak konsolda yazdirin.          
		ferhat => Ferhat
		          	kirac => Kirac
		          */


		
		Scanner scan =new Scanner (System.in);
		System.out.println("Lutfen firstName giriniz" );
		String firstName=scan.next().toLowerCase();
		System.out.println("Lutfen lastName giriniz" );
		String lastName=scan.next().toLowerCase();
		
		System.out.print(firstName.toUpperCase().charAt(0)+firstName.substring(1)+" ");
		System.out.print(lastName.toUpperCase().charAt(0)+lastName.substring(1));
		
		scan.close();
	}

}
