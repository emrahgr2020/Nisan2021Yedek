package hafta_2;

import java.util.Scanner;

public class odev_2 {

	public static void main(String[] args) {
		/*
		Kullaniciya gunde kac cay ictigini ve cayi kac sekerli ictigini sorun.
		 Daha sonra kullanicinin yilda kac kg seker kullandigini 
		 hesaplayan java kodunu yaziniz.
		1 seker= 1.7 gr
		Ornek: Input ⇒      
		Cay : 10
		Seker :2
		Output : 12.41 kg/yil
		*/

		
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Lutfen gunde kac cay ictiginizi giriniz");
		byte gunlukCay = scan.nextByte();
		
		System.out.println("Lutfen cayi kac sekerli ictiginizi giriniz");
		byte sekerMiktari = scan.nextByte();
		
		float sekerGr= 1.7f;
		
		
		float sekerYillik= (365 *sekerMiktari* sekerGr); 
		
		
		System.out.println(gunlukCay * sekerYillik/1000 + "  kg/yillik");
		
		scan.close();
	}

}
