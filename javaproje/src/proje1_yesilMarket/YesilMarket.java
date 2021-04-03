package proje1_yesilMarket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class YesilMarket {

	/*
	 * Yeşil Market alış-veriş programı.
	 * 
	 * 1. Adım: Ürünler ve fiyatları içeren listeleri oluşturunuz. No Ürün Fiyat
	 * ==== ======= ========= 00 Domates 2.10 TL 01 Patates 3.20 TL 02 Biber 1.50 TL
	 * 03 Soğan 2.30 TL 04 Havuç 3.10 TL 05 Elma 1.20 TL 06 Muz 1.90 TL 07 Çilek
	 * 6.10 TL 08 Kavun 4.30 TL 09 Üzüm 2.70 TL 10 Limon 0.50 TL
	 * 
	 * 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini isteyiniz. 3.
	 * Adım: Kaç kg satın almak istediğini sorunuz. 4. Adım: Alınacak bu ürünü
	 * sepete ekleyiniz ve Sepeti yazdırınız. 5. Başka bir ürün alıp almak
	 * istemediğini sorunuz. 6. Eğer devam etmek istiyorsa yeniden ürün seçme
	 * kısmına yönlendiriniz. 7. Eğer bitirmek istiyorsa ödeme kısmına geçiniz ve
	 * ödem sonrasında programı bitirinzi.
	 */

	public static List<String> urunler = new ArrayList<>();// Global
	public static List<Double> fiyatlar = new ArrayList<>();
	
	public static List<String> sepetUrunler = new ArrayList<>();
	public static List<Double> sepetKg = new ArrayList<>();
	public static List<Double> sepetFiyatlar = new ArrayList<>();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		urunler.addAll(Arrays.asList("Domates", "Patates", "Biber", "Sogan", "Havuc", "Elma", "Muz", "Cilek", "Kavun",
				"Uzum", "Limon"));
		fiyatlar.addAll(Arrays.asList(2.10, 3.20, 1.50, 2.30, 3.10, 1.20, 1.90, 6.10, 4.30, 2.70, 0.50));

		urunListele();
		System.out.println("Urununuzu listeye gore seciniz");
		int urunNo = scan.nextInt();
		System.out.println("Urununkac kg alacaginizi giriniz");
		double kg = scan.nextDouble();
		
		sepeteEkle(urunNo, kg);

	}

	public static void urunListele() {
		System.out.println("No \t Urunler \t Fiyatlar");
		System.out.println("=== \t ======= \t =========");

		for (int i = 0; i < urunler.size(); i++) {
			System.out.println(" " + i + "\t" + urunler.get(i) + "\t \t" + fiyatlar.get(i));

		}
	}
	
	public static void sepeteEkle(int urunNo , double kg) {
		
		sepetUrunler.add(urunler.get(urunNo));
		sepetKg.add(kg);
		sepetFiyatlar.add(fiyatlar.get(urunNo)*kg);
	}
}

