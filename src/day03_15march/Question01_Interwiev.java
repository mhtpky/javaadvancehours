package day03_15march;

import java.util.Arrays;
import java.util.Scanner;

public class Question01_Interwiev {

	public static void main(String[] args) {
		//INTERWIEV SORUSU
		
		// kullanicin girdigi sayi kadar int array olusturan ve
		// array elemanlarini kullanicidan alan
		// ve girilen array elemanlarinin en buyuk ile en kucuk
		// elemaninin arasinda ki farki gosteren
		// java programi yazin

		Scanner scan = new Scanner(System.in);
		System.out.println("Kac elemanli bir array olusturmak istiyorsunuz?");
		int arrLength = scan.nextInt();
		int arr[] = new int[arrLength];


		for (int i = 0; i < arr.length; i++) {
			System.out.println("Lutfen Array'in " +(i+1) + " .ci elemanini giriniz");
			arr[i] = scan.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		int fark = 0;
		fark = arr[arr.length - 1] - arr[0];

		System.out.println(fark);

	}

}
