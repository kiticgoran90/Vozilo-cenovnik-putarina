package test;

import putarina.Automobil;
import putarina.Cenovnik;
import putarina.Kamion;
import putarina.Rampa;

public class MainTest {
	
	public static void main(String[] args) {
		try {
			Cenovnik c = new Cenovnik(2);
			c.postaviPutarinu(100, 1)
			 .postaviPutarinu(200, 3);
			
			Rampa rampa = new Rampa("Kuzmin", 3, c);
			rampa.pristiglo(new Automobil("NS12345"))
				 .pristiglo(new Automobil("NI45678"))
				 .pristiglo(new Kamion("BG123369"))
				 .pristiglo(new Kamion("SU789471"))
				 .pristiglo(new Automobil("KG456951"))
				 .pristiglo(new Kamion("VA15478"))
				 .pristiglo(new Automobil("BG123639"));
			System.out.println(rampa);
		}catch(Exception g) {System.out.println(g);}
	}
}
