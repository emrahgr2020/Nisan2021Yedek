package day_04;

import java.util.ArrayList;
import java.util.Scanner;



public class Question03 {

	public static void main(String[] args) {
		/*
		 * bir array de aranan sayinin olup olmadigini kontrol eden bir method yaz
		 */
		Scanner scan =new Scanner (System.in);		
		System.out.println("Aramak istediginiz sayiyi giriniz");
		int arananSayi=scan.nextInt();
		
		int arr[]=new int [10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=i+1;
		}
		
		System.out.println(sayiKontrol(arr, arananSayi));
		
	}

	public static boolean sayiKontrol(int arr[],int sayi) {
		
		boolean flag=false;
		
		ArrayList<Integer> arrList= new ArrayList<>();
		for (int each : arr) {
			arrList.add(each);
		}
		if(arrList.contains(sayi)) {
			flag=true;
			
		}
		
			
		return flag;
	}
}
