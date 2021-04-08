package day02_08march;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		/*Bir say�n�n m�kemmel olup olmad���n� bulan bir program yaz�n�z.
			M�kemmel say� : bir say�n�n kendisi hari� b�lenlerinin toplam�, 
			kendisine e�itse o say� m�kemmeldir.
				
				ORNEK:
    			INPUT     : 6
    			OUTPUT : 1,2,3
                1+2+3 = 6 = 6 (M�kemmel)
                
                1.ADIM > Kullanicidan sayi alinir
                2.ADIM > Toplam ifadesini gorunce toplam degiskeni olusturulur
                3.ADIM > Sayinin bolenleri bulunur
                4.ADIM > Bolenler toplami alinir
                5.ADIM > Sayi ile toplamin esitligi kontrol edilir
		 */
		
		Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen pozitif bir sayi giriniz: ");
        int sayi = scan.nextInt();
        
        System.out.println(checkPerfectNumber(sayi));
        
        String result =  checkPerfectNumber(sayi) ? "Sayi mukemmel sayidir": "Sayi mukemmel sayi degildir";
        System.out.println(result);
        
        scan.close();
	}
       
	public static boolean checkPerfectNumber (int sayi) {
        	int toplam=0 ;
        	boolean flag = false; //durum kontrolu icindir(acik kapali gibi)
        	
        	for(int i= 1 ; i<sayi ; i++) {
        		if(sayi%i==0) {
        			toplam+=i;
        		}
        	}
        	if (toplam==sayi) {
        		flag=true;
        	}
        return flag; // ya da flag tanimlamadan > return toplam==sayi < da yazabilirdik 
        
	}

}
