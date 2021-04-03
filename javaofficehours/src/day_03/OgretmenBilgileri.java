package day_03;

public class OgretmenBilgileri {
	/* Soru Class’i olusturun bu Class’da bir Ogretmen icin gerekli
     * bilgileri girebilecegim instance Variable’lar olusturun
     * ve main method icinde bu variable’lara deger atayin ve yazdirin
     */
	
	 String ogretmenIsmi;
	 String ogretmenBransi;
	
	public OgretmenBilgileri(String brans,String isim) {
		this.ogretmenBransi=brans;
		this.ogretmenIsmi=isim;		
	}
	public OgretmenBilgileri() {
		
	}
	public static void main(String[] args) {
		
		OgretmenBilgileri ogretmen1 = new OgretmenBilgileri("Fen", "Velihan");
		System.out.println(ogretmen1.ogretmenIsmi);
	
		OgretmenBilgileri ogretmen2 = new OgretmenBilgileri();
		System.out.println(ogretmen2.ogretmenIsmi +ogretmen2.ogretmenBransi);
		
		
	}

}
