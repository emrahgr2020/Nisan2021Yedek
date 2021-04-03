package hafta_2;

public class odev_5 {

	public static void main(String[] args) {
		/*
		Iki degisken atayin : 
		num1=1,
		num2=1 
		‘increment’ yontemini kullanarak Carpim Tablosunu yazdirin.
		Note: ++ increment isareti 1 arttirir. 
		Asagidaki sekilde Carpim Tablosunu yazdirin:
		1 X 1 = 1
		1 X 2 = 2  
		1 X 3 = 3
		...
		1 X 10 =10
		*/

		byte num1=1;
		byte num2=1;
		
		System.out.println(num1+" x "+num2+ " = " + num1*num2);
		System.out.println("1 x 2 = " + ++num1);
		System.out.println("1 x 3 = " + ++num1);
		System.out.println("1 x 4 = " + ++num1);
		System.out.println("1 x 5 = " + ++num1);
		System.out.println("1 x 6 = " + ++num1);
		System.out.println("1 x 7 = " + ++num1);
		System.out.println("1 x 8 = " + ++num1);
		System.out.println("1 x 9 = " + ++num1);
		System.out.println("1 x 10 = " + ++num1);

	}

}
