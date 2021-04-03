package day_04;

public class Question02 {

	public static void main(String[] args) {
		/*
		 * bir array'deki sayilarin ortalamasini bulan java kodunu yaziniz
		 *
		 * input[]= {1,2,3,4,5,6,7} Output : 4
		 */

		int arr[] = {1,2,3,4,5,6,7};

		System.out.println(ortalamaBul(arr));
	}

	public static double ortalamaBul(int arr[]) {

		double ortalama = 0;
		int toplam = 0;

		for (int each : arr) {
			toplam += each;
		}

		ortalama = toplam / arr.length;

		return ortalama;
	}
	
	/* farkli cozum
	 * 
	 * Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers you will write");
        int length = scan.nextInt();
        System.out.println("Please write numbers and I will find average of the numbers");
        
        int arr [] = new int[length];
        
        for (int i = 0; i < length; i++) {
            System.out.println(i+1 + ". number");
            int numbers = scan.nextInt();
            arr[i]=numbers;
        }
        
        System.out.println("Your numbers : " + Arrays.toString(arr));
        average(arr);
        
        
    }
    public static void average(int arr []) {
        
        double average = 0;
        double total = 0;
        
        for (int w : arr) {
            total+=w;
        }
        
        average = total / arr.length;
        System.out.println(average);
    }

	 * 
	 */

}
