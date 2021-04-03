package hafta_3;

import java.util.Scanner;

public class Odev2 {

	public static void main(String[] args) {
		/*
        Print "Lütfen iş unvanınızı girin�? 
        “jobTitle�? isimli bir degisken olusturun ve kullanicidan isteyin.
        Doğru jobTitle yazdırmak için aşağıdaki test datalarini kullanın. 
        Example :
        Eger jobTitle  qa ise print “İş unvanınız Quality Analyst�? 
        test data: qa ise print Quality Analyst 
        dev ise print Developer 
        ba ise print Business Analyst 
        pm ise print Project Manager
       */

		
		//Soru 2
		
		String jobTitle;
		
		Scanner scan =new Scanner (System.in);
		System.out.println("Lutfen jobTitle giriniz");
		jobTitle=scan.next();
		
		if (jobTitle.equalsIgnoreCase("QA")) {
			System.out.println("Is unvaniniz: Quality Analyst");
		} else if (jobTitle.equalsIgnoreCase("DEV")) {
			System.out.println("Is unvaniniz: Devoloper");
		}else if (jobTitle.equalsIgnoreCase("BA")) {
			System.out.println("Is unvaniniz: Bisiness Analyst");
		}else if (jobTitle.equalsIgnoreCase("PM")) {
			System.out.println("Is unvaniniz: Project Manager");
		}else {
			System.out.println("Lutfen gecerli bir is unvani giriniz");
		}
		
		
		scan.close();
	}

}
