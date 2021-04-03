package hafta_5;



public class Soru04 {

	public static void main(String[] args) {
		 
		/*
		 * Get numbers from the user and output that number consecutive fibonacci number
		 * sequence e.g : User enters 10 output : 0 1 1 2 3 5 8 13 21 34
		 */

		//4.soru
		int sayi=10;
		int sayiIlk=0;
		int sayiSon=1;
		int toplam=0;
		
		for (int i = 1; i <= sayi; i++) {
			System.out.print(sayiIlk+ " ");
			
			toplam=sayiIlk+sayiSon;
			sayiIlk=sayiSon;
			
			sayiSon=toplam;
			
		}

	}

}
