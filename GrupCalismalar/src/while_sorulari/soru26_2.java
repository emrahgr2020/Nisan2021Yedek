package while_sorulari;

public class soru26_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vurmasayisi=0;
        double yol=220;
        for (double i = 220; i >=1 ; i-=0.25*i) {
            yol+=(i*0.75)*2;
            vurmasayisi++;
        }
        System.out.println("yol = " + yol);
        System.out.println("vurmasayisi = " + vurmasayisi);

        double mesafe=220.0;
        int sekme =0;
        double yukseklik=220.0;
        while (yukseklik>=1){
            yukseklik=yukseklik*(0.75);
            sekme++;
            mesafe= mesafe+(2*yukseklik);



        }
        System.out.println("sekme = " + sekme);
        System.out.println("Toplam mesafe = "+mesafe);
    }
}