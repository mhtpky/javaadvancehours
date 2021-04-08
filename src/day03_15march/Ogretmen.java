package day03_15march;

public class Ogretmen {
	
	String isim;
	String cinsiyet;
	String brans;
	String okul;
	int yas;
	double maas;
	boolean evliMi;
	
	public Ogretmen(String isim, String cinsiyet, String brans, 
			String okul,int yas, double maas, boolean evliMi ) {
		this.isim = isim;
		this.cinsiyet = cinsiyet;
		this.brans = brans;
		this.okul = okul;
		this.yas = yas;
		this.maas = maas;
		this.evliMi = evliMi;
	}
	
	public Ogretmen() {
		
	}
}
