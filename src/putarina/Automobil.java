package putarina;

public class Automobil extends Vozilo {
	
	public Automobil(String regBr) {
		super(regBr);
	}
	
	@Override
	public int kategorija() {
		return 1;
	}
}
