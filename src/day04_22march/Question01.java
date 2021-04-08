package day04_22march;

public class Question01 {

	public static void main(String[] args) {
		/*
		 * Bir array'deki en buyuk ve en kucuk sayiyi iki ayri methodda
		 * Arrays.sort() methodu kullanmadan yapiniz
		 */
		
		int arr [] = {5,3,2,-2,-30,156};
		int arr2 [] = {5,3,2,-2,-30,156,12893,23};
		
		enKucuk(arr);
		enBuyuk(arr2);

	}
		
		public static void enKucuk(int arr[]) {
			int temp = Integer.MAX_VALUE; // 2147483647
			
			for(int each : arr) {
				if(each<temp) {
					temp = each;	
				}
			}
			System.out.print("En kucuk deger: " +temp+ " ");
			System.out.println();
		}
		
		public static void enBuyuk(int arr[]) {
			int temp = Integer.MIN_VALUE; // 2147483647
			
			for(int each : arr) {
				if(each>temp) {
					temp = each;	
				}
			}
			System.out.print("En buyuk deger: " + temp+ " ");
		}

}
