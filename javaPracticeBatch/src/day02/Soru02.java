package day02;

public class Soru02 {

	public static void main(String[] args) {
		
		/* Auto widening  ve Explicit narrowing ornekleri olusturunuz
		 * increment ve decrement ornekleri olusturunuz
		 * iki variable olusturun ve matematik operatorlerini kullanarak dort islem ve mod
		 * islemlerini yapiniz
		 *
		 */

		System.out.println("----------Auto widening--------" );
		byte sayi1= 12;
		short sayi2=sayi1;
		int sayi3= sayi2;
		long sayi4= sayi3;
		float sayi5=sayi4;
		double sayi6 = sayi5;
		
		System.out.println(sayi6);
		System.out.println("----------Explicit narrowing--------" );
		
		double rakam1= 50.60;
		int rakam2=(int)rakam1;
		System.out.println(rakam2);
		
		System.out.println("----------islem--------" );
		
		int i=20;
		System.out.println(i);
		
		i=i+20;
		System.out.println(i);
		
		i +=20; //increment
		System.out.println(i);
		
		short s=10;
		System.out.println(s);
		s=(short)(s+10);
		System.out.println(s);
		s-=10;//decrement
		System.out.println(s);
		
		
		System.out.println("----------Matematik islemi--------" );
		
		int sayi10=40;
		int sayi11=30;
		
		System.out.println(sayi10*sayi11);
		System.out.println(sayi10/sayi11);
		System.out.println(sayi10+sayi11);
		System.out.println(sayi10-sayi11);
		short y=5;
		
		short mod =(short) (y%6);
		System.out.println("Mod : " + mod);
	
	}

}
