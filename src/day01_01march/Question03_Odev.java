package day01_01march;

import java.util.Scanner;

public class Question03_Odev {

	public static void main(String[] args) {
		/*
		 * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
		 * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
		 * Test data: ali eme all 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 3 harften olusan bir isim giriniz");
		String isim = scan.next().toUpperCase();
		
		char h1 = isim.charAt(0);
		char h2 = isim.charAt(1);
		char h3 = isim.charAt(2);

		String result = isim.length()==3 && (h1!=h2 && h1!=h3 && h2!=h3 )? 
				"Girdiginiz string 3 harfli ve unique  karakterlere sahip" :
					"Girdiginiz isim unique karakterlere sahip degil veya 3 harfli degil";
		System.out.println(result);
		
		
		
		/*if (isim.length()==3) {
			System.out.println((isim.substring(0,1).equals(isim.substring(1,2)) )? 
						"Ilk iki harf ayni" : (isim.substring(1,2).equals(isim.substring(2)) ) ?
							    "Son iki harf ayni":(isim.substring(0,1).equals(isim.substring(2)) ?
										"Ilk ve son harf ayni" :"Tum harfler birbirinden farkli"));
		} else {
			System.out.println("Lutfen 3 harfli giris yaptiginizdan emin olunuz ve takrar deneyiniz");
		}*/
		scan.close();
	}

}
