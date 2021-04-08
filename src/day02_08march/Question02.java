package day02_08march;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		// Kullanicidan bir sayi aliniz
		// sayinin basamak degerleri toplamini 
		// while loop ile yapiniz
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir sayi giriniz: ");
        int sayi = scan.nextInt();
        
        System.out.println(basamakToplami(sayi));
        
        scan.close();
	}

	public static int basamakToplami(int sayi) {
	
		int toplam= 0;
		while(sayi!=0) {
			
			toplam+=sayi%10;
			sayi/=10;	
		}
		
		return toplam;
	}

}
