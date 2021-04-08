package day01_01march;

import java.util.Scanner;

public class Question04_Odev {

	public static void main(String[] args) {
		/*
		 * Ask user Name, Surname and credit card numbers than convert it to special
		 * form
		 * 
		 * (Check credit card number, if there aren’t 16 digit print “Invalid credit
		 * card number”
		 * 
		 * Input : John White 1234234534561478 Output : Name : J*** W**** CCN : ****
		 * **** **** 1478 (Initials for name and surname should be uppercase)
		 * 
		 * 
		 * Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d  ==> tum rakamlar (digit)
		  	\\D  ==> tum rakam disi character ler
		 2) \\w  ==> A->Z	a->z	0->9    _
		 	\\W  ==> A->Z	a->z	0->9    _ disindaki hersey
		 3) \\s  ==> space
		    \\S  ==> space disindaki hersey	

		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = scan.nextLine().toUpperCase();
		
		System.out.println("Please enter your surname");
		String surname = scan.nextLine().toUpperCase();
		
		System.out.println("Please enter your card numbers");
		String card = scan.next();
		
		if (card.length()!=16) {
			System.out.println("Invalid credit card number");
		}else {		
			System.out.println("Name : " + name.substring(0,1)+ name.substring(1).replaceAll("\\w", "*"));
			System.out.println("Surname : "+ surname.substring(0,1)+surname.substring(1).replaceAll("\\w", "*"));
			System.out.println("CCN : "+ "**** **** **** " + card.substring(12));
		}
		scan.close();
	}

}
