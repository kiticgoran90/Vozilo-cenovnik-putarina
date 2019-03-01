package putarina;

import greske.GKat;
import greske.GNemaCenovnika;

public class Rampa {
	private String naziv;
	private Stanica[] stanice;
	
	public Rampa(String naziv, int brStanica, Cenovnik c) {
		this.naziv = naziv;
		stanice = new Stanica[brStanica];
		for(int i=0; i<brStanica; i++)
			stanice[i] = new Stanica(c);
	}
	
	public Rampa noviCenovnik(Cenovnik c) {
		for(Stanica s: stanice) 
			s.noviCen(c);
		return this;
	}
	
	public Rampa pristiglo(Vozilo v) throws GKat, GNemaCenovnika {
		stanice[(int)(Math.random()*stanice.length)].naplati(v);
		return this;
	}
	
	public int naplaceno() {
		int ukupno = 0;
		for(Stanica s: stanice)
			ukupno += s.naplaceno();
		return ukupno;
	}
	
	@Override
	public String toString() {
		String s = naziv + "(" + naplaceno() + "):";
		for(int i=0; i<stanice.length; i++) {
			if(i>0) s += ",";
			s += stanice[i];
		}
		return s;
	}
}
