package hafta_5;



public class Soru02 {

	public static void main(String[] args) {
		/*
		 * 1-20 arasindaki -20 dahil olmak üzere- çift sayıları yazdırın. e.g.2 4 6 ..
		 * 20
		 * 
		 * 
		 * 1-20 arasindaki -20 dahil olmak üzere- tek sayıları yazdırın. e.g
		 * 1,3,5,7,...,19 Virgul dahil!
		 * 
		 * 
		 * 20 ile 1 arasindaki 5 e bolunebilen sayillari 20 den geriye gelerek yazdirin.
		 * e.g.20,15,10,5
		 * 
		 * 1 - 20 arasındaki tüm çift sayıların toplamını bulun.
		 * 
		 * 11 veya 15 hariç 1-20 arasındaki tüm sayıları yazdırın; break or continue
		 * kullanin.
		 */

		
		//2.soru
		
		// 1.
		for (int i = 2; i < 21; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 2.
		for (int i = 1; i < 21; i += 2) {
			System.out.print((i + ","));
		}
		System.out.println();

		// 3.
		for (int i = 20; i > 0; i--) {
			if (i % 5 == 0) {
				System.out.print(i + ",");
			}
		}
		System.out.println();

		// 4.
		int ciftSayilarToplami = 0;
		for (int i = 2; i < 21; i += 2) {
			ciftSayilarToplami += i;
		}
		System.out.print("1 de 20 ye kadar ki cift sayilarin toplami : " + ciftSayilarToplami);
		System.out.println();

		// 5.

		for (int i = 1; i < 21; i++) {
			if (!(i == 11 || i == 15)) {
				System.out.print(i + ",");
				continue;
			}
		}

	}

}
