package day04;

import java.util.Scanner;

public class Soru5 {
	public static void main(String[] args) {
		/*
	  	Kullanicini girdigi sayi kadar sekildeki gibi yarim piramit olusturan java programi yaziniz.
	    Ornek : kullanici 5 sayisini girdiginde yarim piramit olusacak ==>  1 2 3 4 5
																			1 2 3 4
																			1 2 3
																			1 2
																			1
    */
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir  rakam giriniz");
		int sayi = scan.nextInt();
		
		tersPramit(sayi);
		scan.close();
		
	}
	
	public static void tersPramit(int n) {
		
		for (int i = n; i >=1; i--) {
			for (int j = 1; j <=i ; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
}
