package hafta_4;

import java.util.Scanner;

public class Soru03 {

	public static void main(String[] args) {
		/*
		Ternary kullanarak:
		
				int variable : FIYAT
				string variable : Secim (String  .)
				price = $10 ise Print “UCUZ”
				price 10-$20 arasi ise Print “UYGUN”
				diger durumlar icin “PAHALI” yazdirin.
			*/

		// soruyu tam anlamadim sanirimmm
		
		Scanner scan =new Scanner (System.in);
		System.out.println("Lutfen almak istediginiz urunu yaziniz");
		System.out.println("Elma\nArmut\nKarpuz\n");
		String secim=scan.next().toUpperCase();
		System.out.println("Lutfen fiyat giriniz" );
		int fiyat=scan.nextInt();
		
		System.out.println(fiyat==10 ? "Ucuz" : (fiyat>10 || fiyat<20 ? "Uygun" : "Pahali"));
		scan.close();
	}

}
