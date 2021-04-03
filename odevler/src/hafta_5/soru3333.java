package hafta_5;

public class soru3333 {

	public static void main(String[] args) {
		String str = "tojavaytoiseviyorumto";
		String yeni="";
		for(int i = 0 ; i < str.length() ; i++) {
		    for (int j =i+1; j < str.length(); j++){
		        char harf1 = str.charAt(i);
		        char harf2 = str.charAt(j);
		    if(harf1== harf2)
		        yeni += harf1;
		    }
		}
		System.out.println("tekrar eden karakterler: " + yeni);
	}

}
