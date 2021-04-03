package hafta_2;

public class odev_1 {

	public static void main(String[] args) {
		/*
		Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz. 
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		*/  

		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
			
		System.out.println("----------charAt () yontemi ile----------");
		System.out.print(pickName.charAt(0));
		System.out.print(" ");
		System.out.print(pickName.charAt(11));
		System.out.print(" ");
		System.out.println(pickName.charAt(8));
		
		System.out.println("----------substring() yontemi ile----------");
		System.out.println(pickName.substring(0, 1) + " "+ pickName.substring(11, 12)
				           + " " + pickName.substring(8, 9));
		
	}

}
