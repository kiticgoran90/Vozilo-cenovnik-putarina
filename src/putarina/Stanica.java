package putarina;

import greske.GNemaCenovnika;
import greske.GKat;

public class Stanica {
	private static int ID = 0;
	private int id = ++ID;
	private Cenovnik cen;
	private int naplaceno = 0;
	
	public Stanica(Cenovnik cen) {
		noviCen(cen);
	}
	
	public Stanica noviCen(Cenovnik c) {
		cen = c;
		naplaceno = 0;
		return this;
	}
	
	public Stanica naplati(Vozilo v) throws GNemaCenovnika, GKat {
		if(cen == null) throw new GNemaCenovnika();
		naplaceno += cen.dohvatiPutarinu(v.kategorija());
		return this;
	}
	
	public int naplaceno() {
		return naplaceno;
	}
	
	public String toString() {
		return id + "(" + naplaceno + ")";
	}
}
