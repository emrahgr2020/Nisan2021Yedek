package hafta_4;

import java.util.Scanner;

public class Soru2 {

	public static void main(String[] args) {
		
		/*  
		* Kullanicinin girmis oldugu ay icin kac gun oldugunu yazdiran 
		* Switch Case java kodunu yaziniz.
		*/

		Scanner scan =new Scanner (System.in);
		System.out.println("Lutfen gun sayisini ogrenmek istediginiz  ayi rakam olarak giriniz" );
		int ay=scan.nextInt();
		
		switch (ay) {
		case 1:
			System.out.println("Ocak ayi : 31 gun");
			break;
		case 2:
			System.out.println("Subat ayi : 28 gun");
			break;
		case 3:
			System.out.println("Mart ayi : 31 gun");
			break;
		case 4:
			System.out.println("Nisan ayi : 30 gun");
			break;
		case 5:
			System.out.println("Mayis ayi : 31 gun");
			break;
		case 6:
			System.out.println("Haziran ayi : 30 gun");
			break;
		case 7:
			System.out.println("Temmuz ayi : 31 gun");
			break;
		case 8:
			System.out.println("Agustos ayi : 31 gun");
			break;
		case 9:
			System.out.println("Eylul ayi : 30 gun");
			break;
		case 10:
			System.out.println("Ekim ayi : 31 gun");
			break;
		case 11:
			System.out.println("Kasim ayi : 30 gun");
			break;
		case 12:
			System.out.println("Aralik ayi : 31 gun");
			break;
			

		default:
			System.out.println("Lutfen gecerli rakam giriniz");
			break;
			
		}
		scan.close();
	}

}
