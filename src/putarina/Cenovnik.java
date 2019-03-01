package putarina;

import greske.GKat;
import greske.GPonovo;

public class Cenovnik implements Cloneable {
	private int[] putarine;
	private boolean[] promene;
	
	public Cenovnik(int maxKat) {
		putarine = new int[maxKat];
		promene = new boolean[maxKat];
	}
	
	private void provera(int kat) throws GKat {
		if(kat <= 0 || kat > putarine.length) throw new GKat();
	}
	
	public Cenovnik postaviPutarinu(int iznos, int kat) throws GKat, GPonovo {
		provera(kat);
		if(promene[kat-1]) throw new GPonovo();
		promene[kat-1] = true;
		putarine[kat-1] = iznos;
		return this;
	}
	
	public int dohvatiPutarinu(int kat) throws GKat {
		provera(kat);
		return putarine[kat-1];
	}
	
	@Override
	public Cenovnik clone() {
		try {
			Cenovnik c = (Cenovnik)super.clone();
			c.putarine = putarine.clone();
			c.promene = new boolean[promene.length];
			return c;
		}catch(CloneNotSupportedException g) {return null;}
	}
}
