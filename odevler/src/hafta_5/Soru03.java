package hafta_5;

public class Soru03 {

	public static void main(String[] args) {
		/*
		 * Verilen String array icerisindeki tekrar eden karakterleri yazdiran Java
		 * kodunu yaziniz. String str=“ilovejavatoo” Output: o v a
		 */

		//3.soru
		String str = "ilovetojavatoo";
		String strYeni = "";
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					if (!strYeni.contains(str.charAt(i) + "")) {
						strYeni += str.charAt(i) + " ";

					}

				}
			}
		}
		System.out.println(strYeni);
	}

}
