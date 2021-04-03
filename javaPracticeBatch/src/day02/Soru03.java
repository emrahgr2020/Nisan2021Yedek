package day02;

import java.util.Scanner;

public class Soru03 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan 3 sayi aliniz ve bu uc sayinin en buyuk ve en kucuk olanini
		 * bulunuz
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen uc  tam sayi giriniz");
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		int sayi3 = scan.nextInt();

		if (sayi1 > sayi2 && sayi1 > sayi3) {
			System.out.println("En buyuk sayi : " + sayi1);
			if (sayi2 > sayi3) {
				System.out.println("En kucuk sayi : " + sayi3);
			} else if (sayi3 > sayi2) {
				System.out.println("En kucuk sayi : " + sayi2);
			} else {
				System.out.println(sayi2 + " ve " + sayi3 + " birbirine esittir");
			}
		} else if (sayi2 > sayi1 && sayi2 > sayi3) {
			System.out.println("En buyuk sayi : " + sayi2);
			if (sayi1 > sayi3) {
				System.out.println("En kucuk sayi : " + sayi3);
			} else if (sayi3 > sayi1) {
				System.out.println("En kucuk sayi : " + sayi1);
			} else {
				System.out.println(sayi1 + " ve " + sayi3 + " birbirine esittir");
			}
		} else if (sayi3 > sayi1 && sayi3 > sayi2) {
			System.out.println("En buyuk sayi : " + sayi3);
			if (sayi1 > sayi2) {
				System.out.println("En kucuk sayi : " + sayi2);
			} else if (sayi2 > sayi1) {
				System.out.println("En kucuk sayi : " + sayi1);
			} else {
				System.out.println(sayi1 + " ve " + sayi2 + " birbirine esittir");
			}

		} else if (sayi1 == sayi2 && sayi1 == sayi3) {
			System.out.println("Sayilar birbirine esit");
		} else if (sayi1 == sayi2 && sayi2 > sayi3) {
			System.out.println(sayi1 + " ve " + sayi2 + " birbirine esit ve girilen en buyuk sayilardir ");
		} else if (sayi1 == sayi3 && sayi3 > sayi2) {
			System.out.println(sayi1 + " ve " + sayi3 + " birbirine esit ve girilen en buyuk sayilardir ");
		} else if(sayi3==sayi2 && sayi2>sayi1) {
			System.out.println(sayi2+" ve " + sayi3 +" birbirine esit ve girilen en buyuk sayilardir ");
			
		}else {
			System.out.println("Yanlis islem. Lutfen tekrar giriniz...");
		}
		scan.close();

	}

}
