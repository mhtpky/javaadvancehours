package day06_04april;

import java.util.Scanner;

public class Question03_Exception {

	public static void main(String[] args) {
		/*
	 	Kullanicidan yasini alin ve eger kullanici yasini 0 
	 	veya daha az bir yas girerse
	 	kullaniciya musade etmeyin(Exception throw edin)
	 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen yasinizi giriniz");
		int yas = scan.nextInt();
		
		/*if(yas<=0) {
			throw new IllegalArgumentException("Yasiniz sifirdan kucuk olamaz");
		}*/
	
		/* // 2. YOL
		try {
			if (yas > 0) {
				System.out.println("Girdiğiniz Yaş = " + yas);
			} else {
				throw new IllegalArgumentException();
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}*/
		
		if(yas<0) {
			try {
				throw new IllegalArgumentException();
			}catch (IllegalArgumentException e) {
				System.out.println("Yasiniz sifirdan kucuk olamaz");
			}
		}
	
	}

}
