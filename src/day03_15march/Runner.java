package day03_15march;

public class Runner {

	public static void main(String[] args) {

		Ogretmen aliOgretmen = new Ogretmen("Ali Can", "Erkek", "Fen", "Oxford",28, 13500,false);
		Ogretmen ayseOgretmen = new Ogretmen("Ayse Han", "Kadin", "Bilgisayar", "Mit",40, 20000,true);
		Ogretmen zeynepOgretmen = new Ogretmen("Zeynep", "Kadin", "Matematik", "Mit",25, 13000,false);

		String isimSoyisim [] = new String[3];
		
		isimSoyisim[0] = aliOgretmen.isim;
		isimSoyisim[1] = ayseOgretmen.isim;
		isimSoyisim[2] = zeynepOgretmen.isim;

		//System.out.printlna(Arrays.toString(isimSoyisim));
		
		String brans[] = new String[3];
		
		brans[0] = aliOgretmen.brans;
		brans[1] = ayseOgretmen.brans;
		brans[2] = zeynepOgretmen.brans;
		
		boolean evliMi[] = new boolean[3];
		
		evliMi[0] = aliOgretmen.evliMi;
		evliMi[1] = ayseOgretmen.evliMi;
		evliMi[2] = zeynepOgretmen.evliMi;

		for(int i = 0; i<isimSoyisim.length; i++){
			System.out.println(i+1 +".ci ogretmenin bilgileri:" + isimSoyisim[i]
					+ " " + brans[i] + " " + evliMi[i]);
		}
		
		
		Ogretmen aliOgretmen2 = new Ogretmen();
		aliOgretmen2.brans = "abc";
		aliOgretmen2.isim = "Ebubekir";

	}

}