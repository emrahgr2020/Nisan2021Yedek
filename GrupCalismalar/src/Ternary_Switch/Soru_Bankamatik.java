package Ternary_Switch;

import java.util.Scanner;

public class Soru_Bankamatik {
    /*
    1. işlem bakıye öğrenme
    2.işlem para yetırma
    3.işlem para çekme
    4.işlem çıkış
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        String islemler = "1.işlem bakıye öğrenme\r\n" + "       2.işlem para yetırma \r\n"
                + "        3.işlem para çekme\r\n" + "     4.işlem çıkış";
        System.out.println(islemler);
        System.out.print("yapacağınız işlemin numarasını  seçiniz : ");
        int num = scan.nextInt();
        int bakiye = 5000;
        switch (num) {
            case 1:
                System.out.println("bakiyeniz: " + " " + (bakiye));
                break;
            case 2:
                System.out.println("yatırmk istediğiniz tutar :");
                int tutar1 = scan.nextInt();
                System.out.println("yeni bakiyeneiz :" + (bakiye + tutar1));
                break;
            case 3:
                System.out.println("çekmek istediğiniz tutar :");
                int tutar2 = scan.nextInt();
                if (tutar2 > bakiye) {
                    System.out.println("bakiye yetersiz");
                } else {
                    System.out.println("kalan bakiyeniz :" + (bakiye - tutar2));
                }
                break;
            case 4:
                System.out.println("çıkış işlemi yapılıyor");
                break;
            default:
                System.out.println("hatalı işlem girdiniz");
                break;
        }
    }
}

