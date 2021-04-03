package Ternary_Switch;

import java.time.LocalDate;

public class Soru_05 {

	// Bugüne göre 100 gün sonra hangi gün olduğunuz yazdırınız.

	public static void main(String[] args) {

		//LocalDate gun=  LocalDate.now();
		//System.out.println(gun.getDayOfWeek());
		//System.out.println(gun.getDayOfMonth().plus(100));
		
		
		
		String buGun="Sali" ;
		int yeniGun;
		yeniGun=100%7;
		
		switch (yeniGun) {
		case 6:
			System.out.println("Pazartesi");
			break;
		case 0:
			System.out.println("Sali");
			break;
		case 1:
			System.out.println("Carsamba");
			break;
		case 2:
			System.out.println("Persembe");
			break;
		case 3:
			System.out.println("Cuma");
			break;
		case 4:
			System.out.println("Cumartesi");
			break;
		case 5:
			System.out.println("Pazar");
			break;

		default:
			break;
		}
		
		
		
		
	}

}
