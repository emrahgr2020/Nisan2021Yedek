package hafta_5;

public class Soru05 {

	public static void main(String[] args) {
		/*
		 * String name = "Emine"; charAt yöntemini kullanarak 
		 * konsolda tüm harfleri
		 * yazdırın.
		 */

		
		//5.soru
		String name = "Emine";

		for (int i = 0; i < name.length(); i++) {
			
			System.out.print(name.charAt(i)+",");
		}
	}

}
